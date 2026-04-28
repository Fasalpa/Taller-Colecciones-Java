import java.util.HashMap;
import java.util.Map;

public class HashMapT {
    public static void main(String[] args) {

        String separador = "************************";

        Map<String, Double> empleados = new HashMap<String, Double>();

        empleados.put("Mario", 1500.0);
        empleados.put("Claudia", 2000.0);
        empleados.put("Cesar", 700.25);


        for (Map.Entry<String, Double> entry : empleados.entrySet()) {
            System.out.println("Empleado: " + entry.getKey() + " - Salario: " + entry.getValue());
        }
        empleados.put("Claudia", 3000.5);
        System.out.println(separador +"\nCorrección de salario - Empleado: Claudia - Salario: " + empleados.get("Claudia"));

        double total = 0;

        for (double valor : empleados.values()) {
            total = total + valor;
        }

        double promedio = total/ empleados.size();

        System.out.println(separador +"\nPromedio de salarios: " + promedio);

    }
}
