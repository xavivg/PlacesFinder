import java.util.*;


public class Stats {

    /**
     * @param places Array d'informació
     * Mostrar locales alfabéticamente: muestra todos los locales en orden alfabético, de A
     * a Z. Se debe mostrar toda la información de cada local.
     */
    protected static void showPlacesAlphabetically(ArrayList<Place> places) {

        Collections.sort(places, Comparator.comparing(Place::getName));

        for (Place p : places) {
            System.out.println(p.toString());
        }
    }

    /**
     * @param places Array d'informació
     * . Mejor valorados: muestra, independientemente del tipo de local, los locales de mejor
     * a peor valorados
     */
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

    /**
     * @param places Array d'informació
     * Tipo con más locales abiertos: Muestra el tipo de local del que hay más locales
     * abiertos
     */
    protected static void showBestPlacesBetterFirst(ArrayList<Place> places) {
        Collections.sort(places, Comparator.comparing(Place::getRating).reversed());

        for (Place p : places) {
            System.out.println(p.toString());
        }
    }

    /**
     * @param places Array d'informació
     *  Mejor y peor valorado: Muestra el local mejor y peor valorado por pantalla.
     */
    protected static void showBestPlaceAndTheWorst(ArrayList<Place> places) {
        Collections.sort(places, Comparator.comparing(Place::getRating).reversed());

        Place p = places.get(0);

       System.out.println(p.toString());

        Place p1 = places.get(places.size()-1);

        System.out.println(p.toString());

    }

    /**
     * @param places Array d'informació
     * Valoración media restaurantes: muestra el valor medio de las puntuaciones de los
     * restaurantes encontrados por pantalla.
     */
    protected static void showRestaurantAverageRating(ArrayList<Place> places) {

        double av = 0;
        double count = 0;
        for (Place p : places) {
            if (p.getClass() == Restaurant.class) {
                av += p.getRating();
                count++;
            }
        }
        av = (double) Math.round((av/count) * 100) / 100;
        System.out.println("La media de la valoración de los restaurantes es de: "+av);
    }

    /**
     * @param places Array d'informació
     *  Precio restaurantes: muestra la cantidad de restaurantes que hay para cada nivel de
     * precio (1 - Barato, 2 - moderado, 3 - caro, 4 - muy caro)
     */
    protected static void restaurantsPrice(ArrayList<Place> places) {

        int[] prices = {0,0,0,0};

        for (Place p : places) {
            if (p.getClass() == Restaurant.class) {
                prices[p.getPrice() - 1] ++;
            }
        }

        System.out.println("1 - Barato: " + prices[0]);
        System.out.println("2 - Moderado: " + prices[1]);
        System.out.println("3 - Caro: " + prices[2]);
        System.out.println("4 - Muy caro: " + prices[3]);
    }
}
