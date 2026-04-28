import java.util.HashSet;

public class HashSetT {

    public void mostrarLibros() {
        HashSet<String> coleccionLibros = new HashSet<>();

        coleccionLibros.add("Juego de Tronos");
        coleccionLibros.add("Tormenta de Espadas");
        coleccionLibros.add("Choque de Reyes");
        coleccionLibros.add("Festín de Cuervos");

        for (String nombres : coleccionLibros) {
            System.out.println(nombres);
        }

        if (coleccionLibros.contains("Tormenta de Espadas")) {
            System.out.println("El libro se encuentra disponible.");
        } else {
            System.out.println("El libro no se encuentra disponible.");
        }

        System.out.println("La colección de libros contiene: "
                + coleccionLibros.size() + " libros en total.");
    }
}