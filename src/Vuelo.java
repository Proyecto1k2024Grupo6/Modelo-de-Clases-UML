public class Vuelo {
    public String codigoVuelo;
    public String aerolinea;
    private int asientosDisponibles;
    String ruta;

    public boolean reservarAsiento(int numeroDeAsientos) {
        if (asientosDisponibles >= numeroDeAsientos) {
            asientosDisponibles -= numeroDeAsientos;
            return true;
        }
        return false;
    }

    public void modificarRuta(String nuevaRuta) {
        this.ruta = nuevaRuta;
    }
}
