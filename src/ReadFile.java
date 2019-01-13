import java.io.IOException;
import java.util.ArrayList;

public interface ReadFile {

    /**
     * @param name Rep el nom del fitxer
     * @return Retorna integer en clau segons l'extencio del fitxer.
     */
    int checkExtension(String name);

    /**
     * @param file Rep el nom del fitxer
     * @return Retorna l'array de Places amb tota la informació del JSON insertada en l'arraylist.
     */
    ArrayList<Place> readJson(String file);

    /**
     * @param file Rep el nom del fitxer
     * @return Retorna l'array de Places amb tota la informació del CSV insertada en l'arraylist.
     */
    ArrayList<Place> readCsv(String file);

}
