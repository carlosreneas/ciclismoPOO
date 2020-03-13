
/**
 * Write a description of class Corredor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Date;

public class Corredor
{
    // instance variables - replace the example below with your own
    private String nombre;
    private Date fechaNacimiento;
    private Float estatura;
    private Float peso;

    /**
     * Constructor for objects of class Corredor
     */
    public Corredor()
    {

    }

    

    //Start GetterSetterExtension Source Code
    /**GET Method Propertie nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**SET Method Propertie nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**GET Method Propertie fechaNacimiento*/
    public Date getFechaNacimiento(){
        return this.fechaNacimiento;
    }//end method getFechaNacimiento

    /**SET Method Propertie fechaNacimiento*/
    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }//end method setFechaNacimiento

    /**GET Method Propertie estatura*/
    public Float getEstatura(){
        return this.estatura;
    }//end method getEstatura

    /**SET Method Propertie estatura*/
    public void setEstatura(Float estatura){
        this.estatura = estatura;
    }//end method setEstatura

    /**GET Method Propertie peso*/
    public Float getPeso(){
        return this.peso;
    }//end method getPeso

    /**SET Method Propertie peso*/
    public void setPeso(Float peso){
        this.peso = peso;
    }//end method setPeso

    //End GetterSetterExtension Source Code
//!
}
