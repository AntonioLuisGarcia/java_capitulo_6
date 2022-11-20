/*
 *En este ejercicio haremos un cuadrilatero y dentro de el otro con la mitad de sus dimensiones
 *dentro del segundo podra estar o no la princesa y eso supone que hay que liberarla, tambien esta la posibilidad 
 *de que alrrededor del cuarto haya vigilantes o no sengun la cantidad de ellos la dificultad para rescatar a la
 *princesa sera mayor
 * @author AntonioLuisGarcia
 */
import java.util.Scanner;
public class rescate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿De que dimensiones quieres que sea el castillo?");
        System.out.print("Ancho: ");
        int ancho=sc.nextInt();
        System.out.print("Altura: ");
        int altura=sc.nextInt();

        //declaramos y le daos valores a las variables aleatorias

        int princesa=(int)(Math.random()*10+1);
        int guardias=(int)(Math.random()*ancho);
        int comienzoXcuarto=(int)(Math.random()*((ancho-2)/2));
        int comienzoYcuarto=(int)(Math.random()*((altura-2)/2));
        int vecesarriba=0;
        int vecesabajo=0;
        boolean seguir=true;

        for(int j=1;j<=ancho;j++){
            System.out.print("*");
        }
        System.out.println();

        for(int i=1;i<=altura-2;i++){
            seguir=false;
            System.out.print("*");
            for(int j=1;j<=ancho-2;j++){
                if(i==comienzoYcuarto && j==comienzoXcuarto){
                    seguir=true;
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }

        for(int j=1;j<=ancho;j++){
            System.out.print("*");
        }
        System.out.println();

        sc.close();
    }
}