
package DTOS;

public class UsuariosDto {

    int IdUsuarios;
    String Nombre;
    String Usuario;
    String numFicha;
    String numControl;
    String carrera;
    String turno;
    String puesto;
    String institucion;
    String escuela;
    String Clave;
    String Perfil;
    
    
    public UsuariosDto(){
        
    }

  

    public UsuariosDto(int IdUsuarios, String Nombre, String Usuario, String numFicha, String numControl, String carrera, String turno,String puesto, String institucion, String escuela, String Clave, String Perfil) {
        this.IdUsuarios = IdUsuarios;
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.numFicha = numFicha;
        this.numControl = numControl;
        this.carrera = carrera;
        this.turno=turno;
        this.puesto = puesto;
        this.institucion = institucion;
        this.escuela = escuela;
        this.Clave = Clave;
        this.Perfil = Perfil;
    }

  

    public int getIdUsuarios() {
        return IdUsuarios;
    }

    public void setIdUsuarios(int IdUsuarios) {
        this.IdUsuarios = IdUsuarios;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getNumFicha() {
        return numFicha;
    }

    public void setNumFicha(String numFicha) {
        this.numFicha = numFicha;
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getPerfil() {
        return Perfil;
    }

    public void setPerfil(String Perfil) {
        this.Perfil = Perfil;
    }
   
    

    
    
    
}
