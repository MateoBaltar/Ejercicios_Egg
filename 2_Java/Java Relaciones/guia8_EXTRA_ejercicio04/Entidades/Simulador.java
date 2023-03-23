/*
• La clase Simulador debe tener un método que genere un listado de alumnos manera
aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.
• Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
debe retornar la lista de dnis.
• Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de
objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos
listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si con el
mismo nombre.
• Se debe imprimir por pantalla el listado de alumnos.
• Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
• Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
para cada alumno genera tres votos de manera aleatoria. En este método debemos
guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
mismo alumno. Utilizar un hashset para resolver esto.
• Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales
fueron sus 3 votos.

• Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y
comienza a hacer el recuento de votos.
• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5
facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, mostrar
los 5 facilitadores y los 5 facilitadores suplentes.
 */
package guia8_EXTRA_ejercicio04.Entidades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import guia8_EXTRA_ejercicio04.Enumeraciones.Apellidos;
import guia8_EXTRA_ejercicio04.Enumeraciones.Nombres;

public class Simulador {
    private ArrayList<String> nombres = new ArrayList<>();
    private ArrayList<String> apellidos = new ArrayList<>();
    ArrayList<Long> dnis = new ArrayList<>();
    private Nombres nombresEnum;
    private Apellidos apellidosEnum;
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private ArrayList<Voto> votos = new ArrayList<>();
    
    Scanner leer = new Scanner(System.in);
    Random random = new Random();

    public void generarAlumnos() {
        for (Apellidos aux : apellidosEnum.values()) {
            apellidos.add(aux.toString());
        }
        for (Nombres aux : nombresEnum.values()) {
            nombres.add(aux.toString());
        }

        System.out.println("Cuantos alumnos quiere crear?");
        int cantidad = leer.nextInt();
        leer.nextLine();
        int topNombres = nombres.size();
        int topApellidos = apellidos.size();
        boolean repetido = false;
        long dni;

        for (int i = 0; i < cantidad; i++) {
            String nombre = (nombres.get(random.nextInt(topNombres)) + " " + apellidos.get(random.nextInt(topApellidos)));
            do {
                repetido = false;
                dni = 10000000 + random.nextInt(90000000);
                if (dnis.isEmpty()) {
                    break;
                }
                for (Long aux : dnis) {
                    if (aux == dni) {
                        repetido = true;
                    }
                }
            } while (repetido == true);
            
            dnis.add(dni);

            Alumno alumnoAux = new Alumno(nombre, dni);
            alumnos.add(alumnoAux);
        }

        for (Alumno aux : alumnos){
            System.out.println("Alumno: " + aux.getNombreCompleto());
            System.out.println("DNI: " + aux.getDni());
        }
        
    }

    public void votacion(){
        ArrayList<Integer> votados = new ArrayList<>();
        boolean repetido;
        int x = 0;
        if (alumnos.size() <= 3) {
            System.out.println("No hay suficientes alumnos para llevar acabo una buena votacion");
        } else{
            for (Alumno alumno : alumnos) {
                int num;
                Voto voto = new Voto(alumno);
                for (int i = 0; i < 3; i++) {
                        do {
                        repetido = false;
                        num = random.nextInt(alumnos.size());
                        if (votados.isEmpty()) {
                        
                        } else {
                            for (Integer aux : votados) {
                            if (aux == num) {
                                repetido = true;
                            }
                        }
                    }
                } while (num == x || repetido == true);
                votados.add(num);

                voto.getVotos().add(alumnos.get(num));
                alumnos.get(num).sumarVoto();
            }
                votados.clear();
                votos.add(voto);
                x++;
        }
    }
    }

    public void recuentoVotos(){
        ArrayList<Alumno> facilitadores = new ArrayList<>();
        ArrayList<Alumno> suplentes = new ArrayList<>();
        alumnos.sort(compararVotos);
        for (int i = 0; i < alumnos.size(); i++) {
            if (i <= 4) {
                facilitadores.add(alumnos.get(i));
            } else if (i < 5 && i >= 10){
                suplentes.add(alumnos.get(i));
            }
        }
        System.out.println("-----------------------------------");
        System.out.println("Los facilitadores seran: ");
        for (Alumno facilitador : facilitadores) {
            System.out.println(facilitador.getNombreCompleto());
            System.out.println("DNI: " + facilitador.getDni());
            System.out.println("Votos: " + facilitador.getCantidadVotos());
            System.out.println("");
        }
        System.out.println("-----------------------------------");
        System.out.println("Los suplentes seran");
        for (Alumno suplente : suplentes) {
            System.out.println(suplente.getNombreCompleto());
            System.out.println("DNI: " + suplente.getDni());
            System.out.println("Votos: " + suplente.getCantidadVotos());
            System.out.println("");
        }
    }

    public static Comparator<Alumno> compararVotos = new Comparator<Alumno>(){

        @Override
        public int compare(Alumno alumno1, Alumno alumno2) {
            return Integer.compare(alumno2.getCantidadVotos(), alumno1.getCantidadVotos());
        }
    };
}


