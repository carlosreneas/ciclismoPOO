
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
        ca1.setDescripcion("Le Tour");
        ca1.setPais(Pais.FRANCIA);
        ca1.setFechaInicio(Util.toDate("01/04/2020"));
        ca1.setFechaFin(Util.toDate("22/04/2020"));
        carreras.add(ca1);
        
        Carrera ca2 = new Carrera();
        ca2.setDescripcion("La Vuelta");
        ca2.setPais(Pais.ESPANIA);
        ca2.setFechaInicio(Util.toDate("01/05/2020"));
        ca2.setFechaFin(Util.toDate("22/05/2020"));
        
        carreras.add(ca2);
        
        carreras.add(new Carrera("El Giro", Util.toDate("01/07/2020"), 
            Util.toDate("22/07/2020"), Pais.ITALIA));
        
        printCarreras();
        
        Corredor co1 = new Corredor();
        co1.setNombre("Nairo Quintana");
        co1.setFechaNacimiento(Util.toDate("01/01/1990"));
        Equipo e1 = findEquipo("Arkea");
        co1.setEquipo(e1);
        e1.getCorredores().add(co1);
        corredores.add(co1);
        
        Corredor co2 = new Corredor();
        co2.setNombre("Egan Bernal");
        co2.setFechaNacimiento(Util.toDate("01/01/1999"));
        for(Equipo e: this.equipos) {
            if(e.getNombre().contentEquals("Ineos")) {
                co2.setEquipo(e);
                e.getCorredores().add(co2);
            }
        }
        corredores.add(co2);
        
        
        Corredor co3 = new Corredor();
        co3.setNombre("Cristopher Froome");
        co3.setFechaNacimiento(Util.toDate("01/01/1992"));
        asignarEquipo("Ineos", co3);
        corredores.add(co3);
        
        
        printCorredores();
        
        printEquipos();
        
        
        /** Egan en el Tour */ 
        Posicion p1 = new Posicion();
        p1.setPosicion(1);
        
        Carrera car1 = findCarrera("Le Tour");
        p1.setCarrera(car1);
        car1.getPosiciones().add(p1);
        
        Corredor cor1 = findCorredor("Egan Bernal");
        p1.setCorredor(cor1);
        cor1.getPosiciones().add(p1);
        
        /** Nairo en el Tour */ 
        p1 = new Posicion();
        p1.setPosicion(4);
        
        car1 = findCarrera("Le Tour");
        p1.setCarrera(car1);
        car1.getPosiciones().add(p1);
        
        cor1 = findCorredor("Nairo Quintana");
        p1.setCorredor(cor1);
        cor1.getPosiciones().add(p1);
        
        /** Egan en el Giro */ 
        p1 = new Posicion();
        p1.setPosicion(5);
        
        car1 = findCarrera("El Giro");
        p1.setCarrera(car1);
        car1.getPosiciones().add(p1);
        
        cor1 = findCorredor("Egan Bernal");
        p1.setCorredor(cor1);
        cor1.getPosiciones().add(p1);
        
        car1 = findCarrera("Le Tour");
        printPosiciones(car1);
        
    }
    
    public void printEquipos() {
        for(Equipo e: this.equipos) {
            System.out.println(e.getNombre() + " No " + e.getCorredores().size());
        }
    }
    
    public Equipo findEquipo(String nombre) {
        for(Equipo e: this.equipos) {
            if(e.getNombre().contentEquals(nombre)) {
                return e;
                //co1.setEquipo(e);
                //e.getCorredores().add(co1);
            }
        }
        return null;
    }
    
    public void asignarEquipo(String nombre, Corredor co) {
        for(Equipo e: this.equipos) {
            if(e.getNombre().contentEquals(nombre)) {
                co.setEquipo(e);
                e.getCorredores().add(co);
            }
        }
    }
    
    public void printCorredores() {
        for(Corredor c: this.corredores) {
            System.out.println("Nombre: " + c.getNombre() + " - Equipo: " + c.getEquipo().getNombre());
        }
    }
    
    
    public Corredor findCorredor(String nombre) {
        for(Corredor pepito: this.corredores) {
            if(pepito.getNombre().contentEquals(nombre)) {
                return pepito;
            }
        }
        return null;
    }
    
    public void printCarreras() {
        for(Carrera c: this.carreras) {
            System.out.println(c.getDescripcion());
        }
    }
    
    
    public void printPosiciones(Carrera car) {
        List<Posicion> pos = car.getPosiciones();
        for(Posicion p: pos) {
            System.out.println(p.getPosicion() + " Corredor " + p.getCorredor().getNombre() + " Equipo " + p.getCorredor().getEquipo().getNombre() );
        }
    }
    
    public Carrera findCarrera(String descripcion) {
        for(Carrera c: this.carreras) {
            if(c.getDescripcion().contentEquals(descripcion)) {
                return c;
            }
        }
        return null;
    }
    
    
    
}
