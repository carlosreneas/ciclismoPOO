
/**
 * Write a description of class Posicion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Posicion
{
    // instance variables - replace the example below with your own
    private Integer posicion;
    private Carrera carrera;
    private Corredor corredor;

    /**
     * Constructor for objects of class Posicion
     */
    public Posicion()
    {

    }

    

    //Start GetterSetterExtension Source Code
    /**GET Method Propertie posicion*/
    public Integer getPosicion(){
        return this.posicion;
    }//end method getPosicion

    /**SET Method Propertie posicion*/
    public void setPosicion(Integer posicion){
        this.posicion = posicion;
    }//end method setPosicion

    //End GetterSetterExtension Source Code
//!

    //Start GetterSetterExtension Source Code
    /**GET Method Propertie carrera*/
    public Carrera getCarrera(){
        return this.carrera;
    }//end method getCarrera

    /**SET Method Propertie carrera*/
    public void setCarrera(Carrera carrera){
        this.carrera = carrera;
    }//end method setCarrera

    /**GET Method Propertie corredor*/
    public Corredor getCorredor(){
        return this.corredor;
    }//end method getCorredor

    /**SET Method Propertie corredor*/
    public void setCorredor(Corredor corredor){
        this.corredor = corredor;
    }//end method setCorredor

    //End GetterSetterExtension Source Code
//!
}
