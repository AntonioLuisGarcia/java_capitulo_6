// Ejercicio 7
// Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
// para los 14 partidos y el pleno al quince (15 filas).

public class Ejercicio07 {
    public static void main(String[] args) {
        System.out.println("Este programa te muestra las apuestas de tres quinielas");
        

        for(int j=1;j<=3;j++){
            for(int i=1;i<=15;i++){
                int resultado= (int)(Math.random()*3+1);
                switch(resultado){
                    case 1:
                    System.out.print("1  ");
                    break;
                    case 2:
                    System.out.print("X  ");
                    break;
                    case 3:
                    System.out.print("2  ");
                    break;
                }
                
            }
            System.out.println("");
        }
    }
}