// Ejercicio 1
// Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
// también la suma total (los puntos que suman entre los tres dados).

public class Ejercicio01 {
    public static void main(String[] args) {
    System.out.println("Genera al azar la tirada de tres dados");
    int total=0;
    for(int i=1;i<=3;i++){
        int dado = (int)(Math.random()*6+1); 
        total=total+dado;
        System.out.println(dado);
    }
    System.out.println("El total es "+total);
        }
    }
    