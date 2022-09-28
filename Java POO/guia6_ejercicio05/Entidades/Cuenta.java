/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Entidades;

/**
 *
 * @author mateo
 */
public class Cuenta {
    
    private int numeroCuenta;
    private long DNI;
    private int saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void ingresar(int saldoIngresante){
        saldoActual = saldoActual + saldoIngresante;
    }
    
    public void retirar(int saldoSaliente){
        if (saldoActual > saldoSaliente){
            saldoActual = saldoActual - saldoSaliente;
        } else {
            saldoActual = 0;
        }  
    }
    
    public void extraccionRapida(int extraccionRapida){
        if ((saldoActual * 0.20) > extraccionRapida){
            saldoActual = saldoActual - extraccionRapida;
        } else {
            System.out.println("La extraccion supera el 20% del saldo, no podra ser rapida.");
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" + "Numero de Cuenta= " + numeroCuenta + ", DNI= " + DNI + ", Saldo Actual= $" + saldoActual + '}';
    }
    
    
}
