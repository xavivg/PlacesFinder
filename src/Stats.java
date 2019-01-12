import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Stats {

    protected static void showPlacesAlphabetically(ArrayList<Place> places) {

        /*Comparator<Place> cmp = new Comparator<Place>() {
            public int compare(Place o1, Place o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };*/

        Collections.sort(places, Comparator.comparing(Place::getName));

        for (Place p : places) {
            System.out.println("Nombre: " + p.getName());
            System.out.println("Dirección: " + p.getAddress());
            System.out.println("Valoración: " + p.getRating());
            System.out.println("Abierto: " + p.isOpen());
            System.out.println("Tipo: " + p.getType());
            System.out.println("---------------------");
        }

    }
}
