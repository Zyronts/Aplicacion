import java.util.Scanner;

public class aplicacioNotaFinal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        final int NUM_ASIGNATURAS = 3;
        final double NotaMinimaAprobar = 3.0;
        String[] nombres = new String[100];
        String[] identificaciones = new String[100];
        double[][] notas = new double[100][NUM_ASIGNATURAS];
        int contadorEstudiantes = 0;{

            while (true) {
            System.out.print("Ingrese el nombre del estudiante " + (contadorEstudiantes + 1) + " : ");//para terminar el bucle la banderilla es: ya
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("ya")) break;

            System.out.print("Ingrese la identificación del estudiante: ");
            String identificacion = scanner.nextLine();

            System.out.println("Ingrese las 3 notas del estudiante:");
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[contadorEstudiantes][j] = scanner.nextDouble();
            }
            scanner.nextLine();
            
            nombres[contadorEstudiantes] = nombre;
            identificaciones[contadorEstudiantes] = identificacion;
            contadorEstudiantes++;
                
            }
        }
    }
}
