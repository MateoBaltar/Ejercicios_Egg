/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió true, imprime las 2 posibles
soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvio true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 */
package guia6_ejercicio03_extra.Entidades;

/**
 *
 * @author mateo
 */
public class Raices {
    private int a;
    private int b;
    private int c;

    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int getDiscriminante(){
        return ((int) Math.pow(b,2)-4*a*c);
    }
    
    public boolean tieneRaices(){
        return (this.getDiscriminante() >= 0);
    }
    
    public boolean tieneRaiz(){
        return (this.getDiscriminante() == 0);
    }
    
    public void obtenerRaices(){
        double raiz1;
        double raiz2;
        if (this.tieneRaices() == true){
            raiz1 = ((-b + Math.sqrt(( Math.pow(b,2)-(4*a*c))))/(2*a));
            raiz2 = ((-b - Math.sqrt(( Math.pow(b,2)-(4*a*c))))/(2*a));
            System.out.println("Raiz 1 = "+ raiz1);
            System.out.println("Raiz 2 = "+ raiz2);
        }
    }
    
    public void obtenerRaiz(){
        int raiz;
        if (this.tieneRaiz() == true){
            raiz = (int) Math.pow(-b,(2*a));
        }
    }
    
    public void calcular(){
        if (this.getDiscriminante() < 0){
            System.out.println("No es posible calcular raices");
        } else if (this.tieneRaices() == true){
            this.obtenerRaices();
        } else if (this.tieneRaiz() == true) {
            this.obtenerRaiz();
        }
    }
}
