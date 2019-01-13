import java.util.*;


public class Stats {

    protected static void showPlacesAlphabetically(ArrayList<Place> places) {

        Collections.sort(places, Comparator.comparing(Place::getName));

        for (Place p : places) {
            System.out.println(p.toString());
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

    protected static void showBestPlacesBetterFirst(ArrayList<Place> places) {
        Collections.sort(places, Comparator.comparing(Place::getRating).reversed());

        for (Place p : places) {
            System.out.println(p.toString());
        }
    }

    protected static void showBestPlaceAndTheWorst(ArrayList<Place> places) {
        Collections.sort(places, Comparator.comparing(Place::getRating).reversed());

        Place p = places.get(0);

       System.out.println(p.toString());

        Place p1 = places.get(places.size()-1);

        System.out.println(p.toString());

    }

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
