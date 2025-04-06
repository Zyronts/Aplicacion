import java.util.Scanner;
public class AplicacionNota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        // Definición de constantes //
        final int NUM_ASIGNATURAS = 3;
        final int NUM_ESTUDIANTES = 5;
        final double NOTA_MINIMA_APROBAR = 3.0;

        // Definición de arreglos //
        String[] nombresEstudiantes = new String[NUM_ESTUDIANTES];
        String[] identificacionesEstudiantes = new String[NUM_ESTUDIANTES];
        double[][] notasEstudiantes = new double[NUM_ESTUDIANTES][NUM_ASIGNATURAS];
        double[] promediosEstudiantes = new double[NUM_ESTUDIANTES];

        // Ingreso de datos //
        System.out.println("Ingrese los datos de los estudiantes:");
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

            // Consumir salto de línea después de leer la última nota //
            input.nextLine(); 
            promediosEstudiantes[i] = sumaNota / NUM_ASIGNATURAS;
        }

        System.out.println("Reporte de estudiantes:");
        System.out.println("==============================");
        
        // Recorrer los estudiantes //
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            // Mostrar información del estudiante con formato //
            System.out.println("\nEstudiante " + (i + 1) + ":");
            System.out.println("Nombre: " + nombresEstudiantes[i]);
            System.out.println("ID: " + identificacionesEstudiantes[i]);
            System.out.println("Promedio: " + promediosEstudiantes[i]); 
        
            // Mostrar el estado del estudiante //
            if (promediosEstudiantes[i] >= NOTA_MINIMA_APROBAR) {
                System.out.println("Estado: Aprobado");
            } else {
                System.out.println("Estado: Reprobado");
            }
        
            System.out.println("-------------------------------");
        }
        
        input.close();
    }
}

