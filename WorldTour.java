
/**
 * Write a description of class WorldTour here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class WorldTour
{
    private List<Carrera> carreras;
    private List<Corredor> corredores;
    private List<Equipo> equipos;
    /**
     * Constructor for objects of class WorldTour
     */
    public WorldTour()
    {
        // initialise instance variables
        carreras = new ArrayList<Carrera>();
        corredores = new ArrayList<Corredor>();
        equipos = new ArrayList<Equipo>();
    }
    
    
    public void testWorld() {
        
        Equipo eq1 = new Equipo();
        eq1.setNombre("Arkea");
        eq1.setPais(Pais.FRANCIA);
        
        Equipo eq2 = new Equipo("Movistar", Pais.ESPANIA);
        
        Equipo eq3 = new Equipo("Ineos", Pais.INGLATERRA);
        
        equipos.add(eq1);
        equipos.add(eq2);
        equipos.add(eq3);
        
        printEquipos();
        
        Carrera ca1 = new Carrera();
        ca1.setDescripcion("Tour de Francia");
        ca1.setPais(Pais.FRANCIA);
        ca1.setFechaInicio(Util.toDate("01/04/2020"));
        ca1.setFechaFin(Util.toDate("22/04/2020"));
        
        carreras.add(ca1);
        
        
        printCarreras();
        
        
        printCorredores();
        
        
        
    }
    
    public void printEquipos() {
        for(Equipo e: this.equipos) {
            System.out.println(e.getNombre());
        }
    }
    
    public void printCorredores() {
        for(Corredor c: this.corredores) {
            System.out.println(c.getNombre());
        }
    }
    
    public void printCarreras() {
        for(Carrera c: this.carreras) {
            System.out.println(c.getDescripcion());
        }
    }
    
    
    
}
