public class Usuario {
    public String email;
    public String nombre;
    int nivelDeAcceso; //package
    private String contrasenya;

    private boolean realizarPago(double monto) {
        return true;
    }
    private void cambiarContraseña(String nuevaContrasenya) {
        this.contrasenya = nuevaContrasenya;
    }
}
