import java.util.Scanner;
public class aplicacionNota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Definición de constantes //
        final int NUM_ASIGNATURAS = 3;
        final int NUM_ESTUDIANTES = 5 ;
        final double NOTA_MINIMA_APROBAR = 3.0;

        // Definición de variables //
        String [] nombresEstudiantes = new String[NUM_ESTUDIANTES];
        String [] identificacionesEstudiantes = new String[NUM_ESTUDIANTES];
        double [][] notasEstudiantes = new double[NUM_ESTUDIANTES][NUM_ASIGNATURAS];
        double [] promediosEstudiantes = new double[NUM_ESTUDIANTES];
        double [] estadoEstudiantes = new double[NUM_ESTUDIANTES];
        double sumaNota = 0;

        // Entrada de datos de los estudiantes //
        for (int i = 0 ; i < nombresEstudiantes.length ; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombresEstudiantes[i] = input.nextLine();
          
            System.out.println("Ingrese la identificación del estudiante " + (i + 1) + ": ");
            identificacionesEstudiantes[i] = input.nextLine();
            
            
            for (int j = 0 ; j < NUM_ASIGNATURAS ; j++) {
                System.out.println("Ingrese las 3 notas " + (j + 1) + " del estudiante " + (i + 1) + ": ");
                notasEstudiantes[i][j] = input.nextDouble();
                sumaNota += notasEstudiantes[i][j];
                
            }

            // Consumir el salto de línea//
            input.nextLine(); 

            // Calcular el promedio de cada estudiante //
            promediosEstudiantes[i] = sumaNota / NUM_ASIGNATURAS;



        }
        // Reporte Final //
        System.out.println("Reporte de estudiantes: ");
        for (int i = 0 ; i < NUM_ESTUDIANTES; i ++) {
            switch (estadoEstudiantes[i] >= NOTA_MINIMA_APROBAR) {
                case "Aprobado":
                    
                    break;
            
                default:
                    break;
            }
            
            }
        
       input.close();
    }
    
}
