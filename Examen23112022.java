/* 
 *@author AntonioLuisGarcia
 */
import java.util.Scanner;
public class Examen23112022{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aleatorium pensará un número entre los valores que tu decidas");

        //aqui pedimos los intervalos del usuario

        System.out.println("Introduzca el mínimo valor del intervalo:");
        int minimo=sc.nextInt();
        System.out.println("Introduzca el maximo valor del intervalo:");
        int maximo=sc.nextInt();

        //declaramos las variables de los intervalos aleatorios

        int intervaloMax;
        int intervaloMin;

        //controlaremos que los intervalos introducidos de teclado son correctos
        //sino mostraremos un mensaje de error

        if(maximo>=minimo){

            //esta varable boolean servira para salir del juego(que es el bucle grande),dependera de la eleccion del

                boolean acabar=true;

                //ahora entramos en el juego en si

                do{

                    //comprobamos que el intervalo mayor aleatorio sea mayor que el intervalo menor aleatrio
                    //si no lo es se repite hasta que lo sea

                    do{
                        intervaloMax=(int)(Math.random()*(maximo-minimo+1)+minimo);
                        intervaloMin=(int)(Math.random()*(maximo-minimo+1)+minimo);

                    }while(intervaloMax<=intervaloMin);

                    //una vez calculados los extremos se muestran por pamtalla y tambien mostramos el numero de intentos

                    int solucion=(int)(Math.random()*(intervaloMax-intervaloMin+1)+intervaloMin);
                    int intentos = (int)(Math.log(intervaloMax-intervaloMin+1) / Math.log(2));
                    System.out.println("Estoy pensando en un número entre "+intervaloMin+" y "+intervaloMax);
                    System.out.println("Tienes "+intentos+" intentos");

                    //declaramos la variable de numero que se ira pidiendo dentro del bucle cada vez que entremos en el
                    //declaramos un boolean para salir del bucle que adivina el numero
                    //el contadorIntentos es para que cuando haya superado ese limite se salga del bucle

                    int numero;
                    boolean salir=true;
                    int contadorIntentos=0;

                    do{

                        //pedimos el numero

                        System.out.print("Escribe el numero: ");
                        numero=sc.nextInt();

                        //incrementamos el contador cada vez que se entre

                        contadorIntentos++;

                        //comprobamos que no hemos superado los intentos permitidos
                        //sino se muestra un mensaje y la solucion y salimos del bucle

                        if(contadorIntentos<=intentos){

                            //si el numero es mayor le decimos al usuario que se ha pasado

                            if(numero>solucion){
                                System.out.println("Te has pasado");
                            }else{

                                //si el numero es menor indicamos que se ha quedado corto

                                if(numero<solucion){
                                    System.out.println("Te has quedado corto");
                                }else{

                                    //sino se pasa ni se queda corto ha hacertado el numero y mostramos un mensaje

                                    System.out.println("Enhorabuena!!!! has acertado.");
                                    System.out.println("Efectivamente el número era: "+solucion);
                                    salir=false;
                                }
                            }
                        }else{
                            salir=false;
                            System.out.println("Has superado el número de intentos.");
                            System.out.println("El numero que habia pensado era: "+solucion);
                        }

                    }while(salir);

                    //mostramos las opciones que tiene
                    //si escoge 1 volvera a jugar
                    //si escoge 2 se acabara el juego y se mostrara un mensaje de despedida

                    System.out.println("Elige una opción");
                    System.out.println("1. Volver a jugar.");
                    System.out.println("2. Salir del juego.");
                    System.out.print("Opción: ");
                    int opcion=sc.nextInt();
                
                    if(opcion==1){
                        acabar=true;
                    }else{
                        acabar=false;
                    }

                }while(acabar);
                
                System.out.println("Gracias por jugar a -A-L-E-A-T-O-R-I-U-M-");

        }else{
            System.out.println("Has puesto valores erroneos vuelve a intentarlo");
        }

        sc.close();
    }
}