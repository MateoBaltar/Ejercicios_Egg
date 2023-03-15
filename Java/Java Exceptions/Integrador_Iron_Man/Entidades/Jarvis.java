package Integrador_Iron_Man.Entidades;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Integrador_Iron_Man.Enumeraciones.Resistencias;

public class Jarvis{
    Random random = new Random();
    Scanner leer = new Scanner(System.in);
    ArrayList<Contacto> contactos = new ArrayList<>();
    private Armadura armadura;

    public void mostrarEstado(){
        System.out.println("Energia: "+ armadura.getGenerador()+"%" );
        System.out.println("Nivel de salud: " + armadura.getNivelSalud());
        System.out.println("Resistencia: " + armadura.getResistencia());
        System.out.println("Color primario: "+ armadura.getColorPrimario());
        System.out.println("Color secundario: "+ armadura.getColorSecundario());

        if (armadura.getCasco().isEstado() == true) {
            System.out.println("Casco operativo");
        } else {
            System.out.println("Casco dañado");
        }
        if (armadura.getCasco().getConsola().isEstado() == true) {
            System.out.println("Consola operativa");
        } else {
            System.out.println("Consola dañada");
        }
        if (armadura.getCasco().getSintetizador().isEstado() == true) {
            System.out.println("Sintetizador operativo");
        } else {
            System.out.println("Sintetizador dañado");
        }
        if (armadura.getBrazoDerecho().isEstado() == true) {
            System.out.println("Brazo derecho operativo");
        } else {
            System.out.println("Brazo derecho dañado");
        }
        if (armadura.getBrazoIzquiero().isEstado() == true) {
            System.out.println("Brazo izquierdo operativo");
        } else {
            System.out.println("Brazo izquiero dañado");
        }
        if (armadura.getPiernaDerecha().isEstado() == true) {
            System.out.println("Pierna derecha operativa");
        } else {
            System.out.println("Pierna derecha dañada");
        }
        if (armadura.getPiernaIzquierda().isEstado() == true) {
            System.out.println("Pierna izquierda operativa");
        } else {
            System.out.println("Pierna izquierda dañada");
        }
    }

    public void estadoBateria(){
        System.out.println("Estado de la bateria actual: " + armadura.getGenerador()+"%");
    }

    /*public void repararDanio(){
        Random random = new Random();
        Scanner leer = new Scanner(System.in);
        int menu;
        do {
            System.out.println("Cual dispositivo desea reparar?");
            System.out.println("1. Casco");
            System.out.println("2. Consola");
            System.out.println("3. Sintetizador");
            System.out.println("4. Brazo derecho");
            System.out.println("5. Brazo izquierdo");
            System.out.println("6. Pierna derecha");
            System.out.println("7. Pierna izquierda");
            System.out.println("8. Cancelar");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                if (armadura.getCasco().isEstado() == false) {
                    int danio = random.nextInt(100);
                    if ( danio <= 40) {
                        System.out.println("El casco fue reparado con exito");
                        armadura.getCasco().setEstado(true);
                    } else {
                        System.out.println("La reparacion ha fallado");
                    }
                } else {
                    System.out.println("El casco no se encuentra dañado");
                }
                    break;

                case 2:
                if (armadura.getCasco().getConsola().isEstado() == false) {
                    int danio = random.nextInt(100);
                    if ( danio <= 40) {
                        System.out.println("La consola fue reparada con exito");
                        armadura.getCasco().getConsola().setEstado(true);
                    } else {
                        System.out.println("La reparacion ha fallado");
                    }
                } else {
                    System.out.println("La consola no se encuentra dañada");
                }
                    break;

                case 3:
                    if (armadura.getCasco().getSintetizador().isEstado() == false) {
                        int danio = random.nextInt(100);
                        if ( danio <= 40) {
                            System.out.println("El sintetizador fue reparadp con exito");
                            armadura.getCasco().getSintetizador().setEstado(true);
                        } else {
                            System.out.println("La reparacion ha fallado");
                        }
                    } else {
                        System.out.println("El sintetizador no se encuentra dañado");
                    }
                    break;

                case 4:
                if (armadura.getBrazoDerecho().isEstado() == false) {
                    int danio = random.nextInt(100);
                    if ( danio <= 40) {
                        System.out.println("El brazo derecho fue reparado con exito");
                        armadura.getBrazoDerecho().setEstado(true);
                    } else {
                        System.out.println("La reparacion ha fallado");
                    }
                } else {
                    System.out.println("El brazo derecho no se encuentra dañado");
                }
                    break;

                case 5:
                if (armadura.getBrazoIzquiero().isEstado() == false) {
                    int danio = random.nextInt(100);
                    if ( danio <= 40) {
                        System.out.println("El brazo izquierdo fue reparado con exito");
                        armadura.getBrazoIzquiero().setEstado(true);
                    } else {
                        System.out.println("La reparacion ha fallado");
                    }
                } else {
                    System.out.println("El brazo izquierdo no se encuentra dañado");
                }
                    break;

                case 6:
                if (armadura.getPiernaDerecha().isEstado() == false) {
                    int danio = random.nextInt(100);
                    if ( danio <= 40) {
                        System.out.println("La pierna derecha fue reparada con exito");
                        armadura.getPiernaDerecha().setEstado(true);
                    } else {
                        System.out.println("La reparacion ha fallado");
                    }
                } else {
                    System.out.println("La pierna derecha no se encuentra dañada");
                }
                    break;

                case 7:
                if (armadura.getPiernaIzquierda().isEstado() == false) {
                    int danio = random.nextInt(100);
                    if ( danio <= 40) {
                        System.out.println("La pierna izquierda fue reparada con exito");
                        armadura.getPiernaIzquierda().setEstado(true);
                    } else {
                        System.out.println("La reparacion ha fallado");
                    }
                } else {
                    System.out.println("La pierna izquierda no se encuentra dañada");
                }
                    break;
                default:
                    break;
            }
        } while (menu != 8);
        
        
    }*/

    public void revisarDispositivos(){
        if (armadura.getCasco().isEstado() == true) {
            System.out.println("Casco operativo");
        } else if (armadura.getCasco().destruido == false) {
            
            System.out.println("Casco dañado, intenado reparar");
            do {
                int danio = random.nextInt(100);
                int destruido = random.nextInt(100);
                    if ( destruido <= 30) {
                        System.out.println("El casco fue destruido");
                        armadura.getCasco().setDestruido(true);
                        break;
                    } else if(danio <= 40) {
                        System.out.println("Casco reparado con exito");
                        armadura.getCasco().setEstado(true);
                    }
            } while (armadura.getCasco().isEstado() == false);
        } else {
            System.out.println("El casco esta destruido e irreparable");
        }

        if (armadura.getCasco().getConsola().isEstado() == true) {
            System.out.println("Consola operativa");
        } else if (armadura.getCasco().getConsola().destruido == false){
            System.out.println("Consola dañada, intenado reparar");
            do {
                int danio = random.nextInt(100);
                int destruido = random.nextInt(100);
                    if ( destruido <= 30) {
                        System.out.println("La consola fue destruida");
                        armadura.getCasco().getConsola().setDestruido(true);
                        break;
                    } else if(danio <= 40) {
                        System.out.println("Casco reparado con exito");
                        armadura.getCasco().getConsola().setEstado(true);
                    }
            } while (armadura.getCasco().getConsola().isEstado() == false);
        } else {
            System.out.println("La consola esta destruida e irreparable");
        }

        if (armadura.getCasco().getSintetizador().isEstado() == true) {
            System.out.println("Sintetizador operativo");
        } else if (armadura.getCasco().getSintetizador().destruido == false){
            System.out.println("Sintetizador dañado, intenado reparar");
            do {
                int danio = random.nextInt(100);
                int destruido = random.nextInt(100);
                    if ( destruido <= 30) {
                        System.out.println("El sintetizador fue destruido");
                        armadura.getCasco().getSintetizador().setDestruido(true);
                        break;
                    } else if(danio <= 40) {
                        System.out.println("Casco reparado con exito");
                        armadura.getCasco().getSintetizador().setEstado(true);
                    }
            } while (armadura.getCasco().getSintetizador().isEstado() == false);
        } else {
            System.out.println("El sinteteizador esta destruido e irreparable");
        }

        if (armadura.getBrazoDerecho().isEstado() == true) {
            System.out.println("Brazo derecho operativo");
        } else if (armadura.getBrazoDerecho().destruido == false){
            System.out.println("Brazo derecho dañado, intenado reparar");
            do {
                int danio = random.nextInt(100);
                int destruido = random.nextInt(100);
                    if ( destruido <= 30) {
                        System.out.println("El brazo derecho fue destruido");
                        armadura.getBrazoDerecho().setDestruido(true);
                        break;
                    } else if(danio <= 40) {
                        System.out.println("Brazo derecho reparado con exito");
                        armadura.getBrazoDerecho().setEstado(true);
                    }
            } while (armadura.getBrazoDerecho().isEstado() == false);
        } else {
            System.out.println("El brazo derecho se encuentra destruido e irreparable");
        }

        if (armadura.getBrazoIzquiero().isEstado() == true) {
            System.out.println("Brazo izquierdo operativo");
        } else if (armadura.getBrazoIzquiero().destruido == false){
            System.out.println("Brazo izquierdo dañado, intenado reparar");
            do {
                int danio = random.nextInt(100);
                int destruido = random.nextInt(100);
                    if ( destruido <= 30) {
                        System.out.println("El brazo izquierdo fue destruido");
                        armadura.getBrazoIzquiero().setDestruido(true);
                        break;
                    } else if(danio <= 40) {
                        System.out.println("Brazo izquierdo reparado con exito");
                        armadura.getBrazoIzquiero().setEstado(true);
                    }
            } while (armadura.getBrazoIzquiero().isEstado() == false);
        } else {
            System.out.println("El brazo izquierdo se encuentra destruido e irrreparable");
        }

        if (armadura.getPiernaDerecha().isEstado() == true) {
            System.out.println("Pierna derecha operativa");
        } else if (armadura.getPiernaDerecha().destruido == false){
            System.out.println("Pierna derecha dañada, intenado reparar");
            do {
                int danio = random.nextInt(100);
                int destruido = random.nextInt(100);
                    if ( destruido <= 30) {
                        System.out.println("La pierna derecha fue destruida");
                        armadura.getPiernaDerecha().setDestruido(true);
                        break;
                    } else if(danio <= 40) {
                        System.out.println("Pierna derecha reparada con exito");
                        armadura.getPiernaDerecha().setEstado(true);
                    }
            } while (armadura.getPiernaDerecha().isEstado() == false);
        } else{
            System.out.println("La pierna derecha se encuentra destruida e irreparable");
        }

        if (armadura.getPiernaIzquierda().isEstado() == true) {
            System.out.println("Pierna izquierda operativa");
        } else if (armadura.getPiernaIzquierda().destruido == false){
            System.out.println("Pierna izquierda dañada, intenado reparar");
            do {
                int danio = random.nextInt(100);
                int destruido = random.nextInt(100);
                    if ( destruido <= 30) {
                        System.out.println("La pierna izquierda fue destruida");
                        armadura.getPiernaIzquierda().setDestruido(true);
                        break;
                    } else if(danio <= 40) {
                        System.out.println("Pierna izquierda reparada con exito");
                        armadura.getPiernaIzquierda().setEstado(true);
                    }
            } while (armadura.getPiernaIzquierda().isEstado() == false);
        } else {
            System.out.println("Pierna izquierda dañada, intenado reparar");
        }
    }

    public void radar(){
        System.out.println("Se detectaron " + contactos.size() + " contactos");
        for (int i = 0; i < (contactos.size()-1); i++) {
            if (i>= 10) {
                System.out.println("No se pueden registrar mas de 10 objetivos al mismo tiempo");
                break;
            }
            double distancia = (Math.sqrt((Math.pow(contactos.get(i).getX(), 2))+(Math.pow(contactos.get(i).getY(), 2))+(Math.pow(contactos.get(i).getZ(), 2))));
            contactos.get(i).setDistancia(distancia);

            System.out.println("Contacto "+(i+1)+". Distancia: "+ distancia + " metros." );
        }
       
        
    }

    public void simulador(){
        String[] resistencias = {"HRA","HRB","HRC"};
        String resistencia;
        int x,y,z;
        boolean hostil;

        System.out.println("Cuantos objetivos quiere para la simulacion?");
        int cantidad = leer.nextInt();
        leer.nextLine();

        if (cantidad > 10) {
            System.out.println("El radar solo puede detectar hasta 10 objetivos, el resto de los objetivos no podran ser escaneados. Esta seguro de que quiere continuar?");
            String confirma = leer.nextLine();
            if (confirma.equals("Si") || confirma.equals("si")) {
                for (int i = 0; i < cantidad; i++) {
                    resistencia = resistencias[random.nextInt(3)];
                    if (random.nextInt(2) == 0) {
                        hostil = true;
                    } else {
                        hostil = false;
                    }
                    x = random.nextInt(5000);
                    y = random.nextInt(5000);
                    z = random.nextInt(5000);
        
                    Contacto contactoAux = new Contacto(x,y,z,hostil, resistencia, true);
                    this.contactos.add(contactoAux);    
                }
                this.radar();
            } else {
                System.out.println("Volviendo al menu");
            }

        } else {
            for (int i = 0; i < cantidad; i++) {
                resistencia = resistencias[random.nextInt(3)];
                if (random.nextInt(2) == 0) {
                    hostil = true;
                } else {
                    hostil = false;
                }
                x = random.nextInt(5000);
                y = random.nextInt(5000);
                z = random.nextInt(5000);
                Contacto contactoAux = new Contacto(x,y,z,hostil, resistencia, true);
                this.contactos.add(contactoAux);    
            }
            this.radar();
        }
        
    }

    public void destruirEnemigo(){
        

        for (Contacto contacto : contactos) {
            int tiempo = 0;
            if ((contacto.isHostil() == true) && (contacto.getDistancia() <= 5000) && (contacto.isActivo() == true)){
                if ((armadura.getBrazoDerecho().estado == true) && (armadura.getBrazoIzquiero().estado == true)) {
                    do {
                        double danio = 2000 - (contacto.getDistancia() * 0.4);
                        contacto.nivelSalud-= danio;
                        if (contacto.nivelSalud < 1) {
                            System.out.println("Contacto destruido");
                            contacto.setActivo(false);
                        }
                        tiempo++;
                    } while (contacto.isActivo() == true);

                    armadura.consumoGenerador((armadura.getBrazoDerecho().usar(tiempo, "Intensivo")));
                    armadura.consumoGenerador((armadura.getBrazoIzquiero().usar(tiempo, "Intensivo")));

                } else if ((armadura.getBrazoDerecho().estado) == true || (armadura.getBrazoIzquiero().estado == true)) {

                    do {
                        double danio = 2000 - (contacto.getDistancia() * 0.2);
                        contacto.nivelSalud-= danio;
                        if (contacto.nivelSalud < 1) {
                                System.out.println("Contacto destruido");
                                contacto.setActivo(false);
                            }
                            tiempo++;
                    } while (contacto.isActivo() == false);

                    if (armadura.getBrazoDerecho().estado == true) {
                            armadura.consumoGenerador((armadura.getBrazoDerecho().usar(tiempo, "Intensivo")));
                    } else {
                            armadura.consumoGenerador((armadura.getBrazoIzquiero().usar(tiempo, "Intensivo")));
                    }
                
                } else {
                    System.out.println("Los guantes se encuentran dañados");
                }
            }
            if (armadura.getGenerador() < 10) {
                System.out.println("Energia critica, iniciando acciones evasivas");
                accionesEvasivas();
                break;
            }
        }
    }


    public void accionesEvasivas(){
        double menor = 99999;
        int tiempo = 0;
        int x = 0;
        for (Contacto contacto : contactos) {
            if (contacto.getDistancia() < menor) {
                menor = contacto.getDistancia();
                int index = x;
            }
            x++;
        }
        double distancia = menor;

        if ((armadura.getPiernaDerecha().estado == true) && (armadura.getPiernaIzquierda().estado == true) && (armadura.getBrazoDerecho().estado) == true && (armadura.getBrazoIzquiero().estado == true)) {
            do {
                distancia += 83.3333;
                tiempo++;
            } while (distancia >= 10000);
            armadura.consumoGenerador((armadura.getPiernaDerecha().usar(tiempo, "Intensivo")));
            armadura.consumoGenerador((armadura.getPiernaIzquierda().usar(tiempo, "Intensivo")));
            armadura.consumoGenerador((armadura.getBrazoDerecho().usar(tiempo, "Normal")));
            armadura.consumoGenerador((armadura.getBrazoIzquiero().usar(tiempo, "Normal")));

        } else if ((armadura.getPiernaDerecha().estado == true) && (armadura.getPiernaIzquierda().estado == true)){
            if ((armadura.getBrazoDerecho().estado) == true || (armadura.getBrazoIzquiero().estado == true)) {
                do {
                distancia += 62.49975;
                tiempo++;
            } while (distancia >= 10000);
            armadura.consumoGenerador((armadura.getPiernaDerecha().usar(tiempo, "Intensivo")));
            armadura.consumoGenerador((armadura.getPiernaIzquierda().usar(tiempo, "Intensivo")));
            if (armadura.getBrazoDerecho().estado == true) {
                armadura.consumoGenerador((armadura.getBrazoDerecho().usar(tiempo, "Normal")));
            } else {
                armadura.consumoGenerador((armadura.getBrazoIzquiero().usar(tiempo, "Normal")));
            }
            }
        } else if ((armadura.getPiernaDerecha().estado == true) || (armadura.getPiernaIzquierda().estado == true)){

            if ((armadura.getBrazoDerecho().estado) == true && (armadura.getBrazoIzquiero().estado == true)) {
                do {
                distancia += 62.49975;
                tiempo++;
            } while (distancia >= 10000);
            armadura.consumoGenerador((armadura.getBrazoDerecho().usar(tiempo, "Normal")));
            armadura.consumoGenerador((armadura.getBrazoIzquiero().usar(tiempo, "Normal")));

            if (armadura.getPiernaDerecha().estado == true) {
                armadura.consumoGenerador((armadura.getPiernaDerecha().usar(tiempo, "Intensivo")));
               
            } else {
                armadura.consumoGenerador((armadura.getPiernaIzquierda().usar(tiempo, "Intensivo")));
                
            }
            } else if ((armadura.getBrazoDerecho().estado) == true || (armadura.getBrazoIzquiero().estado == true)){
                do {
                    distancia += 41.66665;
                    tiempo++;
                } while (distancia >= 10000);

                if (armadura.getBrazoDerecho().estado == true) {
                    armadura.consumoGenerador((armadura.getBrazoDerecho().usar(tiempo, "Normal")));
                } else {
                    armadura.consumoGenerador((armadura.getBrazoIzquiero().usar(tiempo, "Normal")));
                }
    
                if (armadura.getPiernaDerecha().estado == true) {
                    armadura.consumoGenerador((armadura.getPiernaDerecha().usar(tiempo, "Intensivo")));
                   
                } else {
                    armadura.consumoGenerador((armadura.getPiernaIzquierda().usar(tiempo, "Intensivo")));
                    
                }
            }
            
        } else {
            System.out.println("Propulsores dañados, es imposible iniciar acciones evasivas");
        }
        
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }
}
