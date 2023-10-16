package game;

import java.util.*;

public class Monsters{
    private Map<String, String> monstruo = new HashMap<>(){{
        put("Goblin", " Humanoide");
        put("Jabali", " Bestia");
        put("Poring", " Limo");
        put("Ogro", " Humanoide");
        put("Acechador de la maleza", " Bestia");
        put("Zorro", " Bestia");
        put("Diablillo", " Demonio");
        put("Sucubu", " Demonio");
        put("Debora almas", " Demonio");
    }};
    private int nivelMonstruo;

    //obtenemos el mostruo de manera aleatoria
    public Map<String, String> getMonstruo(){
        Random random = new Random();
        List<String> claves = new ArrayList<>(monstruo.keySet());
        int numAleatorio = random.nextInt(claves.size());
        String clave = claves.get(numAleatorio);
        String valor = monstruo.get(clave);

        Map<String, String> mosntruoAleatorio = new HashMap<>(){{
            put(clave, valor);
        }};


        return this.monstruo = mosntruoAleatorio;
    }

    //lo mismo con el nivel del monstruo, el nivel sera limitante a la zona
    public int getNivelMonstruo(Places places){
        Random random = new Random();
        String[] zona = places.getNombreLugar();

        int elnivel = 0;
        if (zona[0].equals("dg1")){
            elnivel = random.nextInt(5)+1;
        }
        if (zona[1].equals("pueblo semilla")){
            elnivel = random.nextInt(10)+1;
        }
        if (zona[2].equals("bosque boscoso")){
            elnivel = random.nextInt(15)+1;
        }
        this.nivelMonstruo = elnivel;
        return 1;
    }

    //constructor
    public Monsters(Places places){
        getMonstruo();
        getNivelMonstruo(places);
    }

    public String toString(){
        return this.monstruo+" "+nivelMonstruo;
    }
}
