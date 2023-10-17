package playing;

import game.Players;
import game.Util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Util util = new Util();

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Crear personaje\n" +
                    "2. Mostrar clases\n" +
                    "3. Salir");
            int opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    
                    break;
                case 2:
                    util.mostrarClases();
                    break;
                case 3:
                    break;
                default:
                    break;
            }

        }while ();




    }
}