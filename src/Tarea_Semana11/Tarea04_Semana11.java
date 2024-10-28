import java.util.Scanner;
public class Tarea04_Semana11 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);
        int[][] ventas = new int[3][3];
        int totalVentas = 0;
        //Aplicamos ventas aleatorias entre 1000 y 10000 y llenar la matriz
        System.out.println("Ventas registradas en la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Generar un número aleatorio entre 1000 y 10000
                ventas[i][j] = (int) (Math.random() * (10000 - 1000 + 1) + 1000);
                totalVentas += ventas[i][j];
                // Mostrar el valor generado
                System.out.print(ventas[i][j] + "\t");
            }
            System.out.println(); // Imprimir nueva línea después de cada fila
        }
        //Calcular el promedio de ventas
        int totalElementos = 3 * 3; // Total de elementos en una matriz 3x3
        double promedioVentas = (double) totalVentas / totalElementos;
        // Mostrar resultados
        System.out.println("\nTotal de ventas: " + totalVentas);
        System.out.println("Promedio de ventas: " + promedioVentas);
    }
}