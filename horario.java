/*
 * El programa consiste en generar un horario de las asignaturas que tenemos, 
 *de manera que los viernes solo haya 3 horas de FOL y 3 horas de SINF. No 
 *hay que preocuparse porque las horas estén seguidas, solo en el caso de los 
 *viernes. Se pedirá al usuario de qué asignatura es el profesor que solo da 
 *clases en horario previo al recreo.
 * 
 * @author Antonio Luis Garcia
 */


public class horario{
	public static void main(String[] args){

        String recreo = "";
        int h = 8;
        int m = 15;
        int aleatorioAsignatura;
        String asignatura="";
        int contador1=6;
        int contador2=4;
        int contador3=8;
        int contador4=3;
        int contador5=3;
        int contador6=3;
        int contadorViernes=0;
        boolean repetir=true;
        int aleatorioViernes=(int)(Math.random()*2+1);
        String viernes;
        if(aleatorioViernes==1){
            viernes="FOL";
        }else{
            viernes="SINF";
        }

        System.out.printf("%6s|   LUNES   |  MARTES   | MIÉRCOLES |  JUEVES   |  VIERNES  |\n", "");
        System.out.print("-------------------------------------------------------------------\n");

        for (int i = 0; i <=6; i++) {

            if (i == 4) {
                m = 45;
                h--;
            }
            System.out.printf("%2d:%2d |", h, m);
            h++;
            for (int j = 1; j <= 5; j++) {


                if (i == 3) {
                    switch (j) {
                        case 1:
                            recreo = "R";
                            break;
                        case 2:
                            recreo = "E";
                            break;
                        case 3:
                            recreo = "CR";
                            break;
                        case 4:
                            recreo = "E";
                            break;
                        default:
                            recreo = "O";
                    }
                    System.out.printf("    %2s     |", recreo);
                } else {

                    if(contadorViernes==16){
                        if(viernes.equals("FOL")){
                            viernes="SINF";
                        }else{
                            viernes="FOL";
                        }
                    }

                    contadorViernes++;

                    if(contadorViernes%5==0){
                        System.out.printf("  %-7s  |", viernes);
                    }else{

                            do{
                                repetir=false;
                                aleatorioAsignatura=(int)(Math.random()*5+1);
                                switch (aleatorioAsignatura) {
                                    case 1:
                                        asignatura="BBDD";
                                        contador1--;
                                        break;
                                        
                                    case 2:
                                    asignatura="LMARCAS";
                                        contador2--;
                                        break;
                                        
                                    case 3:
                                        asignatura="PROG";
                                        contador3--;
                                        break;
            
                                    case 4:
                                        asignatura="ENTDES"; 
                                        contador4--;   
                                        break;
            
                                    case 5:
                                        asignatura="SINF"; 
                                        contador5--;   
                                        break;
            
                                    default:
                                        asignatura="FOL";
                                        contador6--;
                                        break;
                                }
            
                                if(contador1==-1){
                                    contador1++;
                                    repetir=true;
                                }
            
                                if(contador2==-1){
                                    contador2++;
                                    repetir=true;
                                }
            
                                if(contador3==-1){
                                    contador3++;
                                    repetir=true;
                                }
            
                                if(contador4==-1){
                                    contador4++;
                                    repetir=true;
                                }
            
                                if(contador5==-1){
                                    contador5++;
                                    repetir=true;
                                }
            
                                if(contador6==-1){
                                    contador6++;
                                    repetir=true;
                                }
        
                            }while(repetir);


                        System.out.printf("  %-7s  |", asignatura);
                    }

                }
            }
            System.out.println();
        }
    }
}