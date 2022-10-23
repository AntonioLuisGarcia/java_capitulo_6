// Ejercicio 2
// Realiza un programa que muestre al azar el nombre de una carta de la baraja
// francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
// y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
// numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
// 1).

public class Ejercicio02 {
    public static void main(String[] args) {
    System.out.println("Genera al azar una carta de poker");
        int palo = (int)(Math.random()*4+1); 
        int numero = (int)(Math.random()*13+1); 
        
        switch(palo){
            case 1:
                switch(numero){
                    case 1:
                        System.out.print("As de corazones");
                    break;
                    case 2:
                        System.out.print("2 de corazones");
                    break;
                    case 3:
                        System.out.print("3 de corazones");
                    break;
                    case 4:
                        System.out.print("4 de corazones");
                    break;
                    case 5:
                        System.out.print("5 de corazones");
                    break;
                    case 6:
                        System.out.print("6 de corazones");
                    break;
                    case 7:
                        System.out.print("7 de corazones");
                    break;
                    case 8:
                        System.out.print("8 de corazones");
                    break;
                    case 9:
                        System.out.print("9 de corazones");
                    break;
                    case 10:
                        System.out.print("10 de corazones");
                    break;
                    case 11:
                        System.out.print("J de corazones");
                    break;
                    case 12:
                        System.out.print("Q de corazones");
                    break;
                    case 13:
                        System.out.print("K de corazones");
                    break;
                }
                break;

            case 2:

                switch(numero){
                    case 1:
                        System.out.print("As de diamantes");
                    break;
                    case 2:
                        System.out.print("2 de diamantes");
                    break;
                    case 3:
                        System.out.print("3 de diamantes");
                    break;
                    case 4:
                        System.out.print("4 de diamantes");
                    break;
                    case 5:
                        System.out.print("5 de diamantes");
                    break;
                    case 6:
                        System.out.print("6 de diamantes");
                    break;
                    case 7:
                        System.out.print("7 de diamantes");
                    break;
                    case 8:
                        System.out.print("8 de diamantes");
                    break;
                    case 9:
                        System.out.print("9 de diamantes");
                    break;
                    case 10:
                        System.out.print("10 de diamantes");
                    break;
                    case 11:
                        System.out.print("J de diamantes");
                    break;
                    case 12:
                        System.out.print("Q de diamantes");
                    break;
                    case 13:
                        System.out.print("K de diamantes");
                    break;
                }
                break;

            case 3:

                switch(numero){
                    case 1:
                        System.out.print("As de picas");
                    break;
                    case 2:
                        System.out.print("2 de picas");
                    break;
                    case 3:
                        System.out.print("3 de picas");
                    break;
                    case 4:
                        System.out.print("4 de picas");
                    break;
                    case 5:
                        System.out.print("5 de picas");
                    break;
                    case 6:
                        System.out.print("6 de picas");
                    break;
                    case 7:
                        System.out.print("7 de picas");
                    break;
                    case 8:
                        System.out.print("8 de picas");
                    break;
                    case 9:
                        System.out.print("9 de picas");
                    break;
                    case 10:
                        System.out.print("10 de picas");
                    break;
                    case 11:
                        System.out.print("J de picas");
                    break;
                    case 12:
                        System.out.print("Q de picas");
                    break;
                    case 13:
                        System.out.print("K de picas");
                    break;
                }
                break;

            case 4:
                switch(numero){
                    case 1:
                        System.out.print("As de treboles");
                    break;
                    case 2:
                        System.out.print("2 de treboles");
                    break;
                    case 3:
                        System.out.print("3 de treboles");
                    break;
                    case 4:
                        System.out.print("4 de treboles");
                    break;
                    case 5:
                        System.out.print("5 de treboles");
                    break;
                    case 6:
                        System.out.print("6 de treboles");
                    break;
                    case 7:
                        System.out.print("7 de treboles");
                    break;
                    case 8:
                        System.out.print("8 de treboles");
                    break;
                    case 9:
                        System.out.print("9 de treboles");
                    break;
                    case 10:
                        System.out.print("10 de treboles");
                    break;
                    case 11:
                        System.out.print("J de treboles");
                    break;
                    case 12:
                        System.out.print("Q de treboles");
                    break;
                    case 13:
                        System.out.print("K de treboles");
                    break;
                }
                break;
        }

        }
    }
    