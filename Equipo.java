
/**
 * Write a description of class Equipo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Equipo
{
    // instance variables - replace the example below with your own
    private String nombre;
    private Pais pais;

    /**
     * Constructor for objects of class Equipo
     */
    public Equipo()
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
}
