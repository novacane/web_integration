package Modelo;
// Generated 12-04-2019 20:19:43 by Hibernate Tools 4.3.1



/**
 * Rolusuario generated by hbm2java
 */
public class Rolusuario  implements java.io.Serializable {


     private Integer idrol;
     private String roldesc;
     private Usuarios usuarios;

    public Rolusuario() {
    }

	
    public Rolusuario(Integer idrol) {
        this.idrol = idrol;
    }
    public Rolusuario(Integer idrol, String roldesc, Usuarios usuarios) {
       this.idrol = idrol;
       this.roldesc = roldesc;
       this.usuarios = usuarios;
    }
   
    public Integer getIdrol() {
        return this.idrol;
    }
    
    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }
    public String getRoldesc() {
        return this.roldesc;
    }
    
    public void setRoldesc(String roldesc) {
        this.roldesc = roldesc;
    }
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }




}

