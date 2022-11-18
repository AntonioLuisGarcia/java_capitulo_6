/*En este ejercicio mostraremos una tabla con cada mes del año y su temperatura media
 * sera de forma aleatorio y los meses de verano tendra una probabilidad mayor de temperaturas altas
 * y los meses de invierno de temperatura mas baja
 */

import java.util.Scanner;
public class temperaturas{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa te haremos una tabla de las temperaturas en cada mes del año");

        //aunque no hayamos dado arrays aun usare uno para que sea mas rapido el ejercicio

        int[] meses= new int[12];

        //para dar color a las tablas

        String red="\033[31m";
        String cyan="\033[36m"; 
        String blue="\033[34m"; 

        //para resetear el color

        String reset="\u001B[0m";

        for(int i=0;i<meses.length;i++){

            if(i>5 && i<9){
                meses[i]=(int)(Math.random()*15+26);
            }else{
                if(i==11 || i==0 || i==10){
                    meses[i]=(int)(Math.random()*16);
                }else{
                    meses[i]=(int)(Math.random()*26);
                }
            }
        }

        for(int i=40;i>=0;i--){

            if(i%5==0){
                System.out.printf("%4s",i+"| ");
            }else{
                System.out.printf("%4s","| ");
            }

            for(int j=0;j<meses.length;j++){

                if(meses[j]>=i){

                    if(meses[j]>30){
                        System.out.print(red+"*** "+reset);
                    }else{
                        if(meses[j]<12){
                            System.out.print(cyan+"*** "+reset);
                        }else{
                            if(meses[j]<30 && meses[j]>20){
                                System.out.print(blue+"*** "+reset);
                            }else{
                                System.out.print("*** ");
                            }
                        }
                    }
                }else{
                    if(i>0){
                        System.out.print("    ");
                    }
                }

            }
            if(i==0){
                System.out.println();
                System.out.printf("%3s","|");
                for(int j=1;j<=48;j++){
                    System.out.print("-");
                }
            }

            System.out.println();
        }

        System.out.printf("%3s %2s %2s %2s %2s %2s %2s %2s %2s %2s %2s %2s %2s","","ENE","FEB","MAR","ABR","MAY","JUN","JUL","AGO","SEP","OCT","NOV","DIC");

        sc.close();
        }
	}