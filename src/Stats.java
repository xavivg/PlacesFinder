import java.util.*;

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

    protected static void typeMorePlacesOpen(ArrayList<Place> places) {

        Map<String, Integer> types = new HashMap<>();
        types.put("store", 0);
        types.put("museum", 0);
        types.put("night_club", 0);
        types.put("restaurant", 0);

        for (Place p : places) {
            if (p.isOpen() == true) types.put(p.getType(), types.get(p.getType()) + 1);
        }

        String type = "";
        int max = 0;

        if (types.get("store") > max) {
            max = types.get("store");
            type = "store";
        }
        if (types.get("museum") > max) {
            max = types.get("museum");
            type = "museum";
        }
        if (types.get("night_club") > max) {
            max = types.get("night_club");
            type = "night_club";
        }
        if (types.get("restaurant") > max) {
            type = "restaurant";
        }

        System.out.println(type);
    }

    /*protected static void restaurantsPrice(ArrayList<Place> places) {

        for (Place p : places) {
            if (p.getClass() == Restaurant.class) {

            }
        }

    }*/

}
