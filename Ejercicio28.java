// Ejercicio 28
// Realiza un programa que sea capaz de recolocar los números de un array de
// fuera hacia adentro. En primer lugar, el programa pedirá al usuario el tamaño
// del array. A continuación generará un array con ese tamaño con números
// enteros aleatorios entre 0 y 200 ambos incluidos. Seguidamente el programa
// irá colocando desde fuera hacia adentro los números de tal forma que el
// primero se coloca en la primera posición, el segundo en la última, el tercero
// en la segunda, el cuarto en la penúltima, el quinto en la tercera, en sexto en la
// antepenúltima, etc. Se debe mostrar por pantalla tanto el array original como
// el array resultado.

import java.util.Scanner;
public class Ejercicio28{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Diga la longitud del array");
        int longitud = sc.nextInt();
        int aleatorio=0;
        System.out.print("Indice  ");

        for(int i=1;i<=longitud;i++){
            System.out.print("  "+i+"  ");
        }

        System.out.println(" ");
        System.out.print("Valor  ");

        for(int i=1;i<=longitud;i++){
            aleatorio=(int)(Math.random()*201);
            System.out.print(" "+aleatorio+"  ");
        }
        
        sc.close();
        }
	}
