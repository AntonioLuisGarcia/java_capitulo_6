// Ejercicio 20
// Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
// agua. La capacidad será indicada por el usuario. La cuba se llenará con una
// cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
// pueda admitir. El ancho de la cuba no varía.
//@author AntonioLuisGarcia

import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("De que capacidad quiere la cuba");
        int capacidad= sc.nextInt();
        int litros= (int)(Math.random()*capacidad+1);
        for(int i=capacidad;i>=1;i--){
            if(i>litros){
                System.out.println("*    *");
            }
            if(i<=litros){
                System.out.println("*====*");
            }
        }
        System.out.println("******");

        sc.close();
    }
}
