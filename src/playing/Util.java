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
                System.out.println("Los guerreros son combatientes fuertes y resistentes. Generalmente, se especializan " +
                        "\nen el combate cuerpo a cuerpo y son expertos en el uso de armas y armaduras pesadas. " +
                        "\nSon conocidos por su capacidad para resistir daño y infligirlo a sus enemigos.");
                break;
            case 2:
                System.out.println("-----Mago-----");
                System.out.println("Los magos son maestros de la magia. Utilizan hechizos y habilidades mágicas para atacar, " +
                        "\ndefenderse y manipular el entorno. Suelen ser frágiles en combate físico, " +
                        "\npero su poder mágico los hace letales a distancia.");
                break;
            case 3:
                System.out.println("-----Picaro-----");
                System.out.println("Los pícaros son astutos y ágiles. Son expertos en el sigilo, el robo y la evasión. " +
                        "\nPueden desarmar trampas, abrir cerraduras y atacar con precisión crítica. " +
                        "\nA menudo se les asocia con habilidades furtivas y el uso de dagas y arcos.");
                break;
            case 4:
                System.out.println("-----Sacerdote-----");
                System.out.println("Los sacerdotes son sanadores y lanzadores de hechizos divinos. Tienen la capacidad " +
                        "\nde curar heridas y proteger a sus aliados con magia sagrada. También pueden invocar el poder " +
                        "\ne sus dioses para dañar a los enemigos no creyentes.");
                break;
            case 5:
                System.out.println("-----Cazador-----");
                System.out.println("Los cazadores son expertos rastreadores y tiradores. Se especializan en el uso de " +
                        "\narmas a distancia, como arcos o armas de fuego, y tienen la capacidad de domesticar bestias " +
                        "\npara que luchen a su lado. También son hábiles en la supervivencia en la naturaleza.");
                break;
            default:
                System.out.println("Por favor escoja un numero acorde a la clase.");
                break;
        }
        System.out.println();
    }

    
}
