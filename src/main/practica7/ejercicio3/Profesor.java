package ejercicio3;

import java.util.*;
import java.util.ArrayList;

public class Profesor {
    private double totalBs; 
    private int totalUnidades; 
    private List<Equipo> lista;

    public Profesor(double costoUnitario, int unidades, String descripcion, 
                    String numeroFactura, String fecha) {
        this.lista = new ArrayList<>();
        this.totalUnidades = unidades; 
        this.totalBs = unidades * costoUnitario; 
        Equipo equipo = new Equipo(costoUnitario, unidades, descripcion,
                                   numeroFactura, fecha); 
        this.lista.add(equipo); 
    }
    
    public void agregarEquipo(double costoUnitario, int unidades, String descripcion, 
                              String numeroFactura, String fecha) {
        this.totalUnidades += unidades; 
        this.totalBs += unidades * costoUnitario; 
        Equipo equipo = new Equipo(costoUnitario, unidades, descripcion,
                                   numeroFactura, fecha); 
        this.lista.add(equipo);
    }

    public double getTotalBs() {
        return totalBs;
    }

    public int getTotalUnidades() {
        return totalUnidades;
    }
}
