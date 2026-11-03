// Archivo: AlumnoUAEMex.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Implementamos la interfaz genérica Comparable apuntando a nuestra propia clase
public class AlumnoUAEMEX implements Comparable<AlumnoUAEMEX> {
    private int cuenta;
    private String nombre;
    private double promedio;

    public AlumnoUAEMEX(int cuenta, String nombre, double promedio) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getNombre() { return nombre; }
    public double getPromedio() { return promedio; }

    // MODIFICACIÓN DEL CONTRATO DE COMPARACIÓN NATURAL
    @Override
    public int compareTo(AlumnoUAEMEX otro) {
        // Criterio: Ordenar de forma descendente por promedio (Mayor a Menor)
        if (this.promedio < otro.promedio) return 1;
        if (this.promedio > otro.promedio) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + " | Promedio: " + promedio;
    }

    public static void main(String[] args) {
        List<AlumnoUAEMEX> grupo = new ArrayList<>();
        grupo.add(new AlumnoUAEMEX(182401, "Beatriz", 8.5));
        grupo.add(new AlumnoUAEMEX(182402, "Alejandro", 9.2));
        grupo.add(new AlumnoUAEMEX(182403, "Daniela", 9.8));

        // Collections.sort() exige internamente que el tipo de la lista sea un Comparable
        Collections.sort(grupo);

        System.out.println("=== Alumnos ordenados por Promedio (Natural) ===");
        for (AlumnoUAEMEX al : grupo) {
            System.out.println(al);
        }
    }
}

