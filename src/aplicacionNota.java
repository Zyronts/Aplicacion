import java.util.Scanner;
public class AplicacionNota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int NUM_ASIGNATURAS = 3;
        final int NUM_ESTUDIANTES = 5;
        final double NOTA_MINIMA_APROBAR = 3.0;

        String[] nombresEstudiantes = new String[NUM_ESTUDIANTES];
        String[] identificacionesEstudiantes = new String[NUM_ESTUDIANTES];
        double[][] notasEstudiantes = new double[NUM_ESTUDIANTES][NUM_ASIGNATURAS];
        double[] promediosEstudiantes = new double[NUM_ESTUDIANTES];

        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombresEstudiantes[i] = input.nextLine();

            System.out.println("Ingrese la identificación del estudiante " + (i + 1) + ": ");
            identificacionesEstudiantes[i] = input.nextLine();

            double sumaNota = 0;
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                System.out.println("Ingrese la nota " + (j + 1) + " del estudiante " + (i + 1) + ": ");
                notasEstudiantes[i][j] = input.nextDouble();
                sumaNota += notasEstudiantes[i][j];
            }
            input.nextLine(); // Consumir salto de línea
            promediosEstudiantes[i] = sumaNota / NUM_ASIGNATURAS;
        }

        System.out.println("Reporte de estudiantes:");
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + nombresEstudiantes[i] + " (ID: " + identificacionesEstudiantes[i] + ") - Promedio: " + promediosEstudiantes[i]);
            if (promediosEstudiantes[i] >= NOTA_MINIMA_APROBAR) {
                System.out.println("Estado: Aprobado");
            } else {
                System.out.println("Estado: Reprobado");
            }
        }

        input.close();
    }
}

