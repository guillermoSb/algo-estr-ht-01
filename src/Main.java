/**
 * @file Main.java
 * @author Majo Gil - 20337
 * @author Guillermo Stantos - 191517
 * @author Sebastian Villatoro - 211039
 * @date 20/01/2022
 */

import java.util.Scanner;

public class Main {
   
public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
        RadioSettings radiosettings = new RadioSettings();
        int opcion1;
        int opcion = 0;
        
        try {
            System.out.println("\t\tRADIO\n-------------------");
            System.out.println("¿Desea encender el Radio? \n\t\t1. Sí\n\t\t2. No\n-------------------");
            opcion1 = scan.nextInt();
            scan.nextLine();
        } catch (Exception e) {
            System.out.println("Ups, ha ocurrido un error inesperado, por favor reinicie el programa");
            opcion1 = 2;
        }
        if (opcion1 == 1){
            // Se crea un ciclo while para el menu 
        while(opcion != 6){

            boolean frequency = radiosettings.getFrequency();
            String amfm;
            if(frequency) amfm = "AM";
            else amfm = "FM";

            String emisora = String.valueOf(Math.round(radiosettings.getStation()*100.0)/100.0);

            //Se crea el menu con las diferentes opciones 
            System.out.println("\tRadio: "+ amfm + "\n\t\t" + emisora + "\n------------------- " +
                            "\n1. Siguiente Estacion" +
                            "\n2. Estacion Previa " +
                            "\n3. Guardar emisora actal" +
                            "\n4. Seleccionar una emisora guardada"+
                            "\n5. Cambiar frecuencia" +
                            "\n6. Apagar " +
                    "\n-------------------\n  ¿Qué deseas escoger?");
            try {
                opcion = scan.nextInt();
                scan.nextLine();
            } catch (Exception e){
                scan.nextLine();
            }

                    
                    if(opcion==1){
                        radiosettings.nextStation(radiosettings.getFrequency());
                    }
                     else if(opcion==2){
                        radiosettings.prevStation(radiosettings.getFrequency());
                    }

                     else if(opcion==3){
                         try {
                             System.out.println("¿En qué nuemro desea guardar la emisora (1-12)?");
                             int space = scan.nextInt();
                             scan.nextLine();
                             if(space>12 || space< 1) System.out.println("Ese espacio no existe, recuerde que solo tiene 12 espacios disponibles");
                             else radiosettings.saveStation((space-1),radiosettings.getStation());
                         } catch (Exception e){
                             System.out.println("Ups, ha ocurrido un error inesperado");
                         }

                    }
                     else if (opcion == 4){
                         try {
                             System.out.println("¿Que emisora desea seleccionar (1-12)");
                             int space = scan.nextInt();
                             scan.nextLine();
                             if(space>12 || space< 1) System.out.println("Ese espacio no existe, recuerde que solo tiene 12 espacios disponibles");
                             else radiosettings.getSavedStation((space-1));
                         } catch (Exception e){
                             System.out.println("Ups, ha ocurrido un error inesperado");
                         }

                    }
                     else if(opcion== 5){
                        radiosettings.switchAMFM();
                    }
                     else if(opcion==6){
                        System.out.println("\tFeliz dia");
                    } else {
                         System.out.println("No se ingresó una opción válida\n-------------------");
                    }
                    
    
        }
        }

        else if (opcion1 == 2){
            
        }
        
        }
        
    }
