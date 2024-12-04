public class Comercio {
    public String nombreComercio;
    String direccion;  //package
    double ingresosAnuales; //package
    private String claveRegistro;

    public int registrarVenta(float cantidad) {
        ingresosAnuales += cantidad;
        return 1;
    }
    private String consultarClave() {
        return claveRegistro;
    }
}
