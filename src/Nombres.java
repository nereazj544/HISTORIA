import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Nombres {

    public static void main(String[] args) {
        List<String> caracteres = new ArrayList<>(List.of(
            "Marino Tidal",
            
            "Etosh Iceflower",
            "Orion Iceflower"
        ));

        Collections.shuffle(caracteres); // Baraja la lista para asegurar aleatoriedad

        int cantidadDeNombres = 1; // Número de nombres aleatorios que deseas seleccionar
        System.out.println("Nombres seleccionados aleatoriamente sin repetición:");

        for (int i = 0; i < cantidadDeNombres; i++) {
            System.out.println(caracteres.get(i));
        }
    }
}
