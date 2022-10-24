// Ejercicio 11
// Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
// aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
// final aparecerá el número de suspensos, el número de suficientes, el número
// de bienes, etc.

public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Este programa te muestra 20 notas");
        
        int contS=0;
        int contSu=0;
        int contB=0;
        int contN=0;
        int contSobre=0;
            for(int i=1;i<=20;i++){
                int resultado= (int)(Math.random()*5+1);
                switch(resultado){
                    case 1:
                    System.out.print("Suspenso  ");
                    contS++;
                    break;
                    case 2:
                    System.out.print("Suficiente  ");
                    contSu++;
                    break;
                    case 3:
                    System.out.print("Bien  ");
                    contB++;
                    break;
                    case 4:
                    System.out.print("Notable  ");
                    contN++;
                    break;
                    case 5:
                    System.out.print("Sobresaliente  ");
                    contSobre++;
                    break;
                }
                
            }
            System.out.println("");
            System.out.println("Hay "+contS+" suspensos");
            System.out.println("Hay "+contSu+" suficientes");
            System.out.println("Hay "+contB+" bien");
            System.out.println("Hay "+contN+" notables");
            System.out.println("Hay "+contSobre+" sobresalientes");
    }
}