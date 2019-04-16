package Modelo;
// Generated 12-04-2019 20:19:43 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tipopropiedad generated by hbm2java
 */
public class Tipopropiedad  implements java.io.Serializable {


     private Integer idtipopropiedad;
     private String descripcion;
     private Set<Propiedades> propiedadeses = new HashSet<Propiedades>(0);

    public Tipopropiedad() {
    }

	
    public Tipopropiedad(Integer idtipopropiedad, String descripcion) {
        this.idtipopropiedad = idtipopropiedad;
        this.descripcion = descripcion;
    }
    public Tipopropiedad(Integer idtipopropiedad, String descripcion, Set<Propiedades> propiedadeses) {
       this.idtipopropiedad = idtipopropiedad;
       this.descripcion = descripcion;
       this.propiedadeses = propiedadeses;
    }
   
    public Integer getIdtipopropiedad() {
        return this.idtipopropiedad;
    }
    
    public void setIdtipopropiedad(Integer idtipopropiedad) {
        this.idtipopropiedad = idtipopropiedad;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set<Propiedades> getPropiedadeses() {
        return this.propiedadeses;
    }
    
    public void setPropiedadeses(Set<Propiedades> propiedadeses) {
        this.propiedadeses = propiedadeses;
    }




}

