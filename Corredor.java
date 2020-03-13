
/**
 * Write a description of class Corredor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Corredor
{
    // instance variables - replace the example below with your own
    private String nombre;
    private Date fechaNacimiento;
    private Float estatura;
    private Float peso;
    private Equipo equipo;
    private List<Posicion> posiciones;

    /**
     * Constructor for objects of class Corredor
     */
    public Corredor()
    {
        posiciones = new ArrayList<Posicion>();
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

    //Start GetterSetterExtension Source Code
    /**GET Method Propertie equipo*/
    public Equipo getEquipo(){
        return this.equipo;
    }//end method getEquipo

    /**SET Method Propertie equipo*/
    public void setEquipo(Equipo equipo){
        this.equipo = equipo;
    }//end method setEquipo

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
