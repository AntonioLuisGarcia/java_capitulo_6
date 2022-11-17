import java.util.Scanner;
public class figuras{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa genera una figura aleatoria de un tamaño aleatorio con un maximo determinado");
        System.out.println("Cual quieres que sea el maximo del tamaño");
        int maximo=sc.nextInt();
        int figura=(int)(Math.random()*6+1);
        int tamaño=0;

        //para que la figura no sea tan pequeña o cree solo una linea

        do{
            tamaño=(int)(Math.random()*maximo+1);
        }while(tamaño<=3);

        switch(figura){

            //para el caso 1 haremos un cuadrado

            case 1:

            for(int i=1;i<=tamaño*tamaño;i++){
                System.out.print("* ");
                if(i%tamaño==0){
                    System.out.println();
                }
            }

            break;

            //para el caso 2 haremos un rectangulo de pie y el ancho sera la mitad de la altura que dependera del maximo
            
            case 2:
            
            for(int i=1;i<=tamaño;i++){
                for(int j=1;j<=tamaño/2+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            
            break;
            
            //para el caso 2 haremos un rectangulo tumbado y la altura sera la mitad del ancho que dependera del maximo

            case 3:

            for(int i=1;i<=tamaño/2+1;i++){
                for(int j=1;j<=tamaño;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            break;

            //en el caso 4 haremos una piramide

            case 4:

            for(int i=1;i<=tamaño;i++){
                for(int j=i;j<=tamaño;j++){
                    System.out.print(" ");
                }

                for(int j=1;j<=i*2-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            break;

            //en el caso 5 haremos un triangulo rectangulo

            case 5:

            for(int i=1;i<=tamaño;i++){

                for(int j=1;j<=i*2-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            break;

            //el caso 6 sera para un triangulo invertido

            case 6:

            for(int i=1;i<=tamaño;i++){

                for(int j=i;j>i;j--){
                    System.out.print(" ");
                }

                for(int j=i*2-1;j<=tamaño*2-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            break;

        }


        
        sc.close();
    }
}