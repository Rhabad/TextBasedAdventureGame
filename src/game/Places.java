package game;

public class Places {
    private String[] nombreLugar = {"dg1", "pueblo semilla", "bosque boscoso"};


    public void lugares(Players pla){
        if (pla.getLevet() <= 5){
            System.out.println("Zonas Disponibles: ");
            System.out.println(nombreLugar[0]);
        }else if (pla.getLevet() <= 10) {
            System.out.println("Zonas Disponibles: ");
            System.out.println(nombreLugar[0]+"\n"+nombreLugar[1]);
        }else if (pla.getLevet() <= 15) {
            System.out.println("Zonas Disponibles: ");
            System.out.println(nombreLugar[0]+"\n"+nombreLugar[1]+"\n"+nombreLugar[2]);
        }
    }

    public String[] getNombreLugar() {
        return nombreLugar;
    }
}
