package playing;

import java.util.Scanner;

public class Util {

    public void mostrarClases(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("----------Las Clases-----------");
        System.out.println("1. Guerrero\n" +
                "2. Mago\n" +
                "3. Picaro\n" +
                "4. Sacerdote\n" +
                "5. Cazador");
        System.out.print("Elige(1 al 5): ");
        int eleccion = entrada.nextInt();

        switch (eleccion){
            case 1:
                System.out.println("-----Guerrero-----");
                System.out.println("tipico cuerpo a cuerpo");
                break;
            case 2:
                System.out.println("-----Mago-----");
                System.out.println("lanza magia, no pienses mucho");
                break;
            case 3:
                System.out.println("-----Picaro-----");
                System.out.println("usa dagas... le gusta robar, la muy rata");
                break;
            case 4:
                System.out.println("-----Sacerdote-----");
                System.out.println("un sanador de toda la vida");
                break;
            case 5:
                System.out.println("-----Cazador-----");
                System.out.println("No se... un rastreador y usa un arco, suele caer en trampas");
                break;
            default:
                System.out.println("Por favor escoja un numero acorde a la clase.");
                break;
        }
    }
}
