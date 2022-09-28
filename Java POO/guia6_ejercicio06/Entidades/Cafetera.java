/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package guia6_ejercicio06.Entidades;

/**
 *
 * @author mateo
 */
public class Cafetera {
    private int capacidadMaxima = 100;
    private int capacidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
    public void llenarCafetera(){
        capacidadActual = capacidadMaxima;
    }
    
    public void servirTaza(int taza){
        if (capacidadActual >= taza) {
            capacidadActual -= taza;
            System.out.println("La taza se lleno completamente");
        } else {
            System.out.println("La taza no se lleno completamente, se lleno "+ capacidadActual+"/"+taza);
            capacidadActual = 0;
        }
    }
    
    public void vaciarCafetera(){
        capacidadActual = 0;
    }
    
    public void agregarCafe(int agrega){
        if ((capacidadActual+agrega) > capacidadMaxima){
            System.out.println("Oops, agrego mas cafe del que puede contener la maquina");
            capacidadActual = capacidadMaxima;
        } else{
            capacidadActual += agrega;
            System.out.println("La cantidad de cafe actual es " + capacidadActual+"/"+capacidadMaxima);
        }
    }
}
