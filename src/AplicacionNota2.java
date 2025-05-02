import java.util.Scanner;

public class AplicacionNota2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // aqui declaramos constantes y arreglos
        final int NUM_ASIGNATURAS = 3;
        final int NUM_ESTUDIANTES = 5;
        final double NontaMinimaAprobar = 3.0;

        String[] nombresEstudiantes = new String[NUM_ESTUDIANTES];
        String[] identificacionesEstudiantes = new String[NUM_ESTUDIANTES];
        double[][] notasEstudiantes = new double[NUM_ESTUDIANTES][NUM_ASIGNATURAS];
        double[] promediosEstudiantes = new double[NUM_ESTUDIANTES];
        boolean datosIngresados = false;
        // menu con los casos posibles a elegir 
        boolean continuar = true;
        int opcion;


        do {
            System.out.println("--- Menú Principal ---");
            System.out.println("1. Ingresar datos de estudiantes");
            System.out.println("2. Mostrar reporte de estudiantes");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = input.nextInt();
            input.nextLine(); // consumir salto de línea
        

            switch (opcion) {
                case 1: // son los datos de los estudiantes 
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
                        input.nextLine(); // consumir salto de línea
                        promediosEstudiantes[i] = sumaNota / NUM_ASIGNATURAS;
                    }
                    datosIngresados = true;
                    break;

                case 2: // el reporte de los estudiantes 
                    if (!datosIngresados) {
                        System.out.println("Primero debes ingresar los datos de los estudiantes.");
                        break;
                    }

                    System.out.println("\n--- Reporte de estudiantes ---");
                    for (int i = 0; i < NUM_ESTUDIANTES; i++) {
                        System.out.println("Estudiante " + (i + 1) + ":");
                        System.out.println("Nombre: " + nombresEstudiantes[i]);
                        System.out.println("ID: " + identificacionesEstudiantes[i]);
                        System.out.println("Promedio: " + promediosEstudiantes[i]);
                        System.out.println("Estado: " + (promediosEstudiantes[i] >= NontaMinimaAprobar ? "Aprobado" : "Reprobado"));
                        System.out.println("-------------------------------");
                    }
                    break;

                case 3: // es para salir del programa 
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
                
            }
            

        } while (continuar);

        input.close();
    }
}
