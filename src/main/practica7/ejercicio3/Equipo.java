public class Equipo {
    private double costoUnitario;
    private int unidades; 
    private String descripcion; 
    private String numeroFactura; 
    private String Fecha; 

    public Equipo(double costoUnitario, int unidades, String descripcion, String numeroFactura, String Fecha) {
        this.costoUnitario = costoUnitario;
        this.unidades = unidades;
        this.descripcion = descripcion;
        this.numeroFactura = numeroFactura;
        this.Fecha = Fecha;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public int getUnidades() {
        return unidades;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public String getFecha() {
        return Fecha;
    }    
}
