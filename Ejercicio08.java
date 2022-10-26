// Ejercicio 8
// Modifica el programa anterior para que la probabilidad de que salga un 1 sea
// de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
// 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.

public class Ejercicio08 {
    public static void main(String[] args) {
        System.out.println("Este programa te muestra las apuestas de tres quinielas");

        for(int j=1;j<=3;j++){
            for(int i=1;i<=15;i++){
                int resultado= (int)(Math.random()*6+1);
                switch(resultado){
                    case 1:
                    System.out.print("1  ");
                    break;
                    case 2:
                    System.out.print("1  ");
                    break;
                    case 3:
                    System.out.print("1  ");
                    break;
                    case 4:
                    System.out.print("X  ");
                    break;
                    case 5:
                    System.out.print("X  ");
                    break;
                    case 6:
                    System.out.print("2  ");
                    break;
                }
                
            }
            System.out.println("");
        }
    }
}