package DAOS;

import DTOS.UsuariosDto;
import IMPORTANTE.Login;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Types;


public class UsuariosDao {

    Connection cn = Conexion.getConnection();

    public DefaultTableModel mostrarUsuarios(UsuariosDto misUsuarios) {
        DefaultTableModel miModelo = null;
        try {
            String titulos[] = {"ID", "Nombre", "Usuario","nFicha","nControl","Carrera","Turno","Puesto","Institucion","Escuela", "CLAVE", "Perfil"};
            String[] usuDto = new String[12];
            miModelo = new DefaultTableModel(null, titulos);
            CallableStatement cst = cn.prepareCall("{call buscarUsuarios(?)}");
            cst.setString(1, misUsuarios.getUsuario());
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {
                usuDto[0] = rs.getString("IdUsuarios");
                usuDto[1] = rs.getString("Nombre");
                usuDto[2] = rs.getString("Usuario");
                usuDto[3] = rs.getString("numFicha");
                usuDto[4] = rs.getString("numControl");
                usuDto[5] = rs.getString("carrera");
                usuDto[6] = rs.getString("turno");
                usuDto[7] = rs.getString("puesto");
                usuDto[8] = rs.getString("institucion");
                usuDto[9] = rs.getString("escuela");
                usuDto[10] = rs.getString("Clave");
                usuDto[11] = rs.getString("Perfil");
                miModelo.addRow(usuDto);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return miModelo;
    }

    public String insertarUsuarios(UsuariosDto misUsuarios) {
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{Call insertarUsuarios(?,?,?,?,?,?,?,?,?,?,?)}");
            cst.setString(1, misUsuarios.getNombre());
            cst.setString(2, misUsuarios.getUsuario());
            cst.setString(3, misUsuarios.getNumFicha());
            cst.setString(4, misUsuarios.getNumControl());
            cst.setString(5, misUsuarios.getCarrera());
            cst.setString(6, misUsuarios.getTurno());
            cst.setString(7, misUsuarios.getPuesto());
            cst.setString(8, misUsuarios.getInstitucion());
            cst.setString(9, misUsuarios.getEscuela());
            cst.setString(10, misUsuarios.getClave());
            cst.setString(11, misUsuarios.getPerfil());
            cst.executeUpdate();
            msg = "Se registro de forma correcta";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }

     public String RegistrarUsuarioJefe(UsuariosDto misUsuarios) {
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{Call insertarUsuarioJefe(?,?,?,?,?,?)}");
            cst.setString(1, misUsuarios.getNombre());
            cst.setString(2, misUsuarios.getUsuario());
            cst.setString(3, misUsuarios.getNumFicha());
            cst.setString(4, misUsuarios.getCarrera());
            cst.setString(5, misUsuarios.getClave());
            cst.setString(6, misUsuarios.getPerfil());
            cst.executeUpdate();
            msg = "Se registro de forma correcta";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }
     
      public String RegistrarUsuarioProfesor(UsuariosDto misUsuarios) {
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{Call insertarUsuarioProfe(?,?,?,?,?,?)}");
            cst.setString(1, misUsuarios.getNombre());
            cst.setString(2, misUsuarios.getUsuario());
            cst.setString(3, misUsuarios.getNumFicha());
            cst.setString(4, misUsuarios.getCarrera());
            cst.setString(5, misUsuarios.getClave());
            cst.setString(6, misUsuarios.getPerfil());
            cst.executeUpdate();
            msg = "Se registro de forma correcta";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }
      
       public String RegistrarUsuarioServicioSocial(UsuariosDto misUsuarios) {
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{Call insertarUsuarioSS(?,?,?,?,?,?,?,?)}");
            cst.setString(1, misUsuarios.getNombre());
            cst.setString(2, misUsuarios.getUsuario());
            cst.setString(3, misUsuarios.getNumControl());
            cst.setString(4, misUsuarios.getCarrera());
            cst.setString(5, misUsuarios.getTurno());
            cst.setString(6, misUsuarios.getEscuela());
            cst.setString(7, misUsuarios.getClave());
            cst.setString(8, misUsuarios.getPerfil());
            cst.executeUpdate();
            msg = "Se registro de forma correcta";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }
       
        public String RegistrarUsuarioInvitado(UsuariosDto misUsuarios) {
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{Call insertarUsuarioInvitado(?,?,?,?,?,?)}");
            cst.setString(1, misUsuarios.getNombre());
            cst.setString(2, misUsuarios.getUsuario());
            cst.setString(3, misUsuarios.getPuesto());
            cst.setString(4, misUsuarios.getInstitucion());
            cst.setString(5, misUsuarios.getClave());
            cst.setString(6, misUsuarios.getPerfil());
            cst.executeUpdate();
            msg = "Se registro de forma correcta";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }
  
    
    public String editarUsuarios(UsuariosDto misUsuarios) {
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{Call editarUsuarios(?,?,?,?,?,?,?,?,?,?,?,?)}");
            cst.setInt(1, misUsuarios.getIdUsuarios());
            cst.setString(2, misUsuarios.getNombre());
            cst.setString(3, misUsuarios.getUsuario());
            cst.setString(4, misUsuarios.getNumFicha());
            cst.setString(5, misUsuarios.getNumControl());
            cst.setString(6, misUsuarios.getCarrera());
            cst.setString(7, misUsuarios.getTurno());
            cst.setString(8, misUsuarios.getPuesto());
            cst.setString(9, misUsuarios.getInstitucion());
            cst.setString(10, misUsuarios.getEscuela());
            cst.setString(11, misUsuarios.getClave());
            cst.setString(12, misUsuarios.getPerfil());
            cst.executeUpdate();
            msg = "Se actualizo de forma correcta";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }

    public String eliminarUsuarios(UsuariosDto misUsuarios) {
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{Call eliminarUsuarios(?)}");
            cst.setInt(1, misUsuarios.getIdUsuarios());
            cst.executeUpdate();
            msg = "Se elimino de forma correcta";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return msg;
    }

    public String ValidarLogin(UsuariosDto misUsuarios) {
        String perfil = "";
        try {

            CallableStatement cst = cn.prepareCall("{call loginUsuarios(?,?)}");
            cst.setString(1, misUsuarios.getUsuario());
            cst.setString(2, misUsuarios.getClave());
            ResultSet rs = cst.executeQuery();
            if (rs.first()) {
                perfil = rs.getString("Perfil");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return perfil;
    }

}
