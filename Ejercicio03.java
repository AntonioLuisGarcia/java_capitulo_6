// Ejercicio 3
// Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
// de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
//@author AntonioLuisGarcia

public class Ejercicio03 {
    public static void main(String[] args) {
    System.out.println("Genera al azar una carta de la baraja española");
        int palo = (int)(Math.random()*4+1); 
        int numero = (int)(Math.random()*10+1); 
        
        switch(palo){
            case 1:
                switch(numero){
                    case 1:
                        System.out.print("1 de oros");
                    break;
                    case 2:
                        System.out.print("2 de oros");
                    break;
                    case 3:
                        System.out.print("3 de oros");
                    break;
                    case 4:
                        System.out.print("4 de oros");
                    break;
                    case 5:
                        System.out.print("5 de oros");
                    break;
                    case 6:
                        System.out.print("6 de oros");
                    break;
                    case 7:
                        System.out.print("7 de oros");
                    break;
                    case 8:
                        System.out.print("Sota de oros");
                    break;
                    case 9:
                        System.out.print("Caballo de oros");
                    break;
                    case 10:
                        System.out.print("Rey de oros");
                    break;
                    
                }
                break;

            case 2:

                switch(numero){
                    case 1:
                        System.out.print("1 de copas");
                    break;
                    case 2:
                        System.out.print("2 de copas");
                    break;
                    case 3:
                        System.out.print("3 de copas");
                    break;
                    case 4:
                        System.out.print("4 de copas");
                    break;
                    case 5:
                        System.out.print("5 de copas");
                    break;
                    case 6:
                        System.out.print("6 de copas");
                    break;
                    case 7:
                        System.out.print("7 de copas");
                    break;
                    case 8:
                        System.out.print("Sota de copas");
                    break;
                    case 9:
                        System.out.print("Caballo de copas");
                    break;
                    case 10:
                        System.out.print("Rey de copas");
                    break;
                    
                }
                break;

            case 3:

                switch(numero){
                    case 1:
                        System.out.print("1 de espadas");
                    break;
                    case 2:
                        System.out.print("2 de espadas");
                    break;
                    case 3:
                        System.out.print("3 de espadas");
                    break;
                    case 4:
                        System.out.print("4 de espadas");
                    break;
                    case 5:
                        System.out.print("5 de espadas");
                    break;
                    case 6:
                        System.out.print("6 de espadas");
                    break;
                    case 7:
                        System.out.print("7 de espadas");
                    break;
                    case 8:
                        System.out.print("Sota de espadas");
                    break;
                    case 9:
                        System.out.print("Caballo de espadas");
                    break;
                    case 10:
                        System.out.print("Rey de espadas");
                    break;
                    
                }
                break;

            case 4:
                switch(numero){
                    case 1:
                        System.out.print("1 de bastos");
                    break;
                    case 2:
                        System.out.print("2 de bastos");
                    break;
                    case 3:
                        System.out.print("3 de bastos");
                    break;
                    case 4:
                        System.out.print("4 de bastos");
                    break;
                    case 5:
                        System.out.print("5 de bastos");
                    break;
                    case 6:
                        System.out.print("6 de bastos");
                    break;
                    case 7:
                        System.out.print("7 de bastos");
                    break;
                    case 8:
                        System.out.print("Sota de bastos");
                    break;
                    case 9:
                        System.out.print("Caballo de bastos");
                    break;
                    case 10:
                        System.out.print("Rey de bastos");
                    break;
                   
                }
                break;
        }

        }
    }
    