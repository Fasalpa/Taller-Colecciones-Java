import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListT {
    static void main(String[] args) {

        String separador = "************************";
        Scanner teclado = new Scanner(System.in);
        List<String> toDo = new ArrayList<>();
        toDo.add("Mercar");
        toDo.add("Limpiar Casa");
        toDo.add("Regar Plantas");
        toDo.add("Lavar baños");

        System.out.println(separador);
        System.out.println("Digíte:");


        for (int i = 0; i < toDo.size(); i++) {
            System.out.println((i + 1) + ") " + toDo.get(i));
        }

        System.out.println("5) Agregar nueva tarea");

        int opcionMenu = teclado.nextInt();

        if (opcionMenu >= 1 && opcionMenu <= 4) {
            System.out.println("Seleccionó: " + toDo.get(opcionMenu - 1));

            System.out.println("1) Tarea completada\n2) Posponer");
            int opcion = teclado.nextInt();

            if (opcion == 1) {
                toDo.remove(opcionMenu - 1);
                System.out.println("Tarea " + opcionMenu + " eliminada.");
            } else {
                System.out.println("Tarea pospuesta.");
            }

        } else if (opcionMenu == 5) {
            teclado.nextLine();
            System.out.println("Ingrese la nueva tarea: ");
            String nuevaTarea = teclado.nextLine();

            toDo.add(nuevaTarea);
            System.out.println("Tarea agregada.");

        } else {
            System.out.println("Opción no válida.");
        }

        System.out.println("Tareas restantes: " + toDo.size());
        System.out.println("toDo actual: " + toDo);

    }
}