public class CuentaBancaria {
    public String numeroCuenta;
    public String nombreTitular;
    private double saldo;
    String moneda;

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    private boolean retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
}
