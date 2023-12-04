/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import ventanas.MenuPrincipal1;
import ventanas.tblEmpleado;

/**
 *
 * @author favel
 */
public class CRUD {

    private PreparedStatement PS;
    private DefaultTableModel DT;
    private ResultSet RS;
    private final ConexionSQL CN;
    private final String insertarUsuaro = "INSERT INTO usuarios(nombre, apellidos, telefono, correo ,tipoUsuario, usuario, contraseña) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private final String SeletEmpelado = "SELECT * FROM usuarios";
    private final String SelectVenta = "SELECT * FROM ventas";
    private final String SelectStock = "SELECT * FROM stock";
    private final String SelectMaterial = "SELECT * FROM materiales";
    private final String SelectUsuarios = "SELECT nombre, apellidos ,tipoUsuario, contraseña from usuarios where usuario= ? and contraseña= ?";

    public CRUD() {
        PS = null;
        CN = new ConexionSQL();
    }
    
    public String getNombreUsuario(String usuario) {
        String nombreUsuario = "";
        try {
            PS = CN.Conectar().prepareStatement("select nombre from usuarios where usuario = ?");
            PS.setString(1, usuario);
            RS =PS.executeQuery();
            while(RS.next()) {
                nombreUsuario = RS.getString("nombre");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al encontrar usuario", JOptionPane.ERROR_MESSAGE);
        }
        return nombreUsuario;
    }
    
      // busqueda de productos
    public Object[] SelecionarProdu(String id){
        Object[] Valor = new Object[2];
              try {
            PS = CN.Conectar().prepareStatement("select * from materiales where ID = ?");
            PS.setString(1, id);
            RS =PS.executeQuery();
            if (RS.next()) {
                Valor[0] = RS.getString("maizKG");
                Valor[1] = RS.getString("ArinaKG");
            } else {
                Valor[0] = "";
                Valor[1] = "";
                JOptionPane.showMessageDialog(null, "Registro no encontrado");
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.toString());
        }finally {
            PS = null;
            CN.Desconectar();
        }
                    return Valor;
    }
    //-------------------- Buscar Empleado -----------------------
    public Object[] buscarEmpleado(String id) {
        Object[] valor = new Object[7];

        try {
            PS = CN.Conectar().prepareStatement("Select * from usuarios where ID = ?");
            PS.setString(1, id);
            RS = PS.executeQuery();
            if (RS.next()) {
                valor[0] = RS.getString("nombre");
                valor[1] = RS.getString("apellidos");
                valor[2] = RS.getString("telefono");
                valor[3] = RS.getString("correo");
                valor[4] = RS.getString("tipoUsuario");
                valor[5] = RS.getString("usuario");
                valor[6] = RS.getString("contraseña");
                
            } else {
                valor[0] = "";
                valor[1] = "";
                valor[2] = "";
                valor[3] = "";
                valor[4] = "";
                valor[5] = "";
                valor[6] = "";
                JOptionPane.showMessageDialog(null, "Registro no encontrado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            PS = null;
            CN.Desconectar();
        }
        return valor;
    }
    private final String RegVenta = "insert into ventas(kilo, precio, montoTotal) values (?,?,?)";
    public int GuardarVentas(double kg,double pc, double montT) throws SQLException {
        // crear consulta SQL parametrizada
        PS = CN.Conectar().prepareStatement(RegVenta);
        // Establecer los valores de los parametros
        PS.setDouble(1, kg);
        PS.setDouble(2, pc);
        PS.setDouble(3, montT);
        //Ejecutar la consulta
        int filasAfectadas = PS.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Registro guardado Exitosamente");
        }
        return filasAfectadas;
    }
    
    //
    private final String ActualizaPro ="UPDATE materiales SET maizKG=?, arinaKG=? WHERE idMateriales = ?"; 
    public int ActualizarProducto(int id,String Maiz,String Arina){
        int res=0;
        try {
            PS =CN.Conectar().prepareStatement(ActualizaPro);
            PS.setString(1, Maiz);
            PS.setString(2, Arina);
            PS.setInt(3, id);
             res = PS.executeUpdate();
            System.out.println(res);
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro actualizado ");
               tblEmpleado p = new tblEmpleado();
               p.cargarRegistros();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actaluzar");
            }
        } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            PS = null;
            CN.Desconectar();
        }
        return res;
    }
    
    //actualizacion Empleado
    private final String UpdateEmpleados = "UPDATE usuarios SET nombre = ?, apellidos= ?, telefono= ?, correo= ?, tipoUsuario= ?, usuario= ?, contraseña= ? WHERE ID = ?";

    public int ActualizarEmpleados(int cod, String Nombre, String Apellido, String Telefono, String Correo, String TipoEmpleado, String Usuario, String Contra) {
        int res = 0;
        try {
            PS = CN.Conectar().prepareStatement(UpdateEmpleados);
            PS.setString(1, Nombre);
            PS.setString(2, Apellido);
            PS.setString(3, Telefono);
            PS.setString(4, Correo);
            PS.setString(5, TipoEmpleado);
            PS.setString(6, Usuario);
            PS.setString(7, Contra);
            PS.setInt(8, cod);
            res = PS.executeUpdate();
            System.out.println(res);
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro actualizado ");
               tblEmpleado p = new tblEmpleado();
               p.cargarRegistros();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actaluzar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            PS = null;
            CN.Desconectar();
        }
        return res;
    }
    //Eliminar cliente

    public int EliminarEmpleado(int ID) {
        int res = 0;
        try {
            if (JOptionPane.showConfirmDialog(null, "¿Seguro lo quieres eliminar?", "Advertencia", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                PS = CN.Conectar().prepareStatement("DELETE FROM usuarios where ID = ?");
                PS.setInt(1, ID);
                res = PS.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "El registro se ha borrado");
                    tblEmpleado objReg = new tblEmpleado();
                    objReg.cargarRegistros();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            PS = null;
            CN.Desconectar();
        }
        return res;
    }

    // Login
    public boolean validacion(String usuario, String contra) {
        boolean valido = false;
        try {
            PS = CN.Conectar().prepareCall(SelectUsuarios);
            PS.setString(1, usuario);
            PS.setString(2, contra);

            RS = PS.executeQuery();
            Object[] fila = new Object[4];
            while (RS.next()) {
                fila[0] = RS.getString(1);
                fila[1] = RS.getString(2);
                fila[2] = RS.getString(3);
                fila[3] = RS.getString(4);
            }
            try {
                if (!fila[1].equals(null)) {
                    valido = true;
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "El usuario y/o contraseña es incorrecta");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            PS = null;
            RS = null;
            CN.Desconectar();
        }
        return valido;
    }

    public int insertarClientes(String nom, String ape, String tel, String cor, String tip, String user, String pass) throws SQLException {
        // crear consulta SQL parametrizada
        PS = CN.Conectar().prepareStatement(insertarUsuaro);
        // Establecer los valores de los parametros
        PS.setString(1, nom);
        PS.setString(2, ape);
        PS.setString(3, tel);
        PS.setString(4, cor);
        PS.setString(5, tip);
        PS.setString(6, user);
        PS.setString(7, pass);

        //Ejecutar la consulta
        int filasAfectadas = PS.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Registro guardado Exitosamente");
        }
        return filasAfectadas;
    }
    //modelo de la tabla Empleados

    private DefaultTableModel cargarModelo() {
        DT = new DefaultTableModel();
        // columnas de la tabla
        DT.addColumn("ID");
        DT.addColumn("Nombres");
        DT.addColumn("Apellidos");
        DT.addColumn("Telefono");
        DT.addColumn("Correo");
        DT.addColumn("Tipo");
        DT.addColumn("Usuario");
        DT.addColumn("Contraseña");
        return DT;
    }
    // cargar los registros de la tabla Empleado

    public DefaultTableModel getDatosEmpleado() {
        try {
            cargarModelo();
            PS = CN.Conectar().prepareStatement(SeletEmpelado);
            RS = PS.executeQuery();
            Object[] fila = new Object[8];
            while (RS.next()) {
                fila[0] = RS.getString(1);
                fila[1] = RS.getString(2);
                fila[2] = RS.getString(3);
                fila[3] = RS.getString(4);
                fila[4] = RS.getString(5);
                fila[5] = RS.getString(6);
                fila[6] = RS.getString(7);
                fila[7] = RS.getString(8);
                DT.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            PS = null;
            RS = null;
            CN.Desconectar();
        }
        return DT;
    }
    // Establecer el modelo de la tabla Ventas

    private DefaultTableModel cargarModeloVentas() {
        DT = new DefaultTableModel();
        // columnas de la tabla
        DT.addColumn("ID");
        DT.addColumn("Kilo");
        DT.addColumn("Precio");
        DT.addColumn("Monto Total");
        return DT;
    }
    //Cargar los registros

    public DefaultTableModel getDatosVentas() {
        try {
            cargarModeloVentas();
            PS = CN.Conectar().prepareStatement(SelectVenta);
            RS = PS.executeQuery();
            Object[] fila = new Object[8];
            while (RS.next()) {
                fila[0] = RS.getString(1);
                fila[1] = RS.getString(2);
                fila[2] = RS.getString(3);
                fila[3] = RS.getString(4);
                DT.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            PS = null;
            RS = null;
            CN.Desconectar();
        }
        return DT;
    }
    //modelo de la tabla Empleados

    private DefaultTableModel cargarModeloStock() {
        DT = new DefaultTableModel();
        // columnas de la tabla
        DT.addColumn("ID");
        DT.addColumn("Cant_Tortillas");
        return DT;
    }
    // cargar los registros de la tabla Empleado

    public DefaultTableModel getDatosStock() {
        try {
            cargarModelo();
            PS = CN.Conectar().prepareStatement(SelectStock);
            RS = PS.executeQuery();
            Object[] fila = new Object[8];
            while (RS.next()) {
                fila[0] = RS.getString(1);
                fila[1] = RS.getString(2);
                DT.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            PS = null;
            RS = null;
            CN.Desconectar();
        }
        return DT;
    }
    //modelo de la tabla Empleados

    private DefaultTableModel cargarModeloMateriales() {
        DT = new DefaultTableModel();
        // columnas de la tabla
        DT.addColumn("ID");
        DT.addColumn("Maiz(KG)");
        DT.addColumn("Arina(KG)");
        return DT;
    }
    // cargar los registros de la tabla Empleado

    public DefaultTableModel getDatosMateriales() {
        try {
            cargarModeloMateriales();
            PS = CN.Conectar().prepareStatement(SelectMaterial);
            RS = PS.executeQuery();
            Object[] fila = new Object[8];
            while (RS.next()) {
                fila[0] = RS.getString(1);
                fila[1] = RS.getString(2);
                fila[2] = RS.getString(3);
                DT.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            PS = null;
            RS = null;
            CN.Desconectar();
        }
        return DT;
    }
}
