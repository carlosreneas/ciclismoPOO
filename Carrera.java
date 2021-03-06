
/**
 * Write a description of class Carrera here.
 *
 * @author CARLOS RENE ANGARITA
 * @version 0.0.1
 */
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Carrera
{
    // instance variables - replace the example below with your own
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;
    private Pais pais;
    private List<Posicion> posiciones;

    /**
     * Constructor for objects of class Carrera
     */
    public Carrera()
    {
        // initialise instance variables
        posiciones = new ArrayList<Posicion>();
    }
    
    
    public Carrera(String descripcion, Date fechaInicio, Date fechaFin, Pais pais) {
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.pais = pais;
        posiciones = new ArrayList<Posicion>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return y;
    }

    //Start GetterSetterExtension Source Code
    /**GET Method Propertie descripcion*/
    public String getDescripcion(){
        return this.descripcion;
    }//end method getDescripcion

    /**SET Method Propertie descripcion*/
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }//end method setDescripcion

    /**GET Method Propertie fechaInicio*/
    public Date getFechaInicio(){
        return this.fechaInicio;
    }//end method getFechaInicio

    /**SET Method Propertie fechaInicio*/
    public void setFechaInicio(Date fechaInicio){
        this.fechaInicio = fechaInicio;
    }//end method setFechaInicio

    /**GET Method Propertie fechaFin*/
    public Date getFechaFin(){
        return this.fechaFin;
    }//end method getFechaFin

    /**SET Method Propertie fechaFin*/
    public void setFechaFin(Date fechaFin){
        this.fechaFin = fechaFin;
    }//end method setFechaFin

    //End GetterSetterExtension Source Code
//!

    //Start GetterSetterExtension Source Code
    /**GET Method Propertie pais*/
    public Pais getPais(){
        return this.pais;
    }//end method getPais

    /**SET Method Propertie pais*/
    public void setPais(Pais pais){
        this.pais = pais;
    }//end method setPais

    //End GetterSetterExtension Source Code
//!

    //Start GetterSetterExtension Source Code
    /**GET Method Propertie posiciones*/
    public java.util.List<Posicion> getPosiciones(){
        return this.posiciones;
    }//end method getPosiciones

    /**SET Method Propertie posiciones*/
    public void setPosiciones(java.util.List<Posicion> posiciones){
        this.posiciones = posiciones;
    }//end method setPosiciones

    //End GetterSetterExtension Source Code
//!
}
