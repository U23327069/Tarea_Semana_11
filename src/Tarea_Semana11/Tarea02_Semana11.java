import java.util.Scanner;
public class Tarea02_Semana11 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);
        //Definiremos la matriz de 4x4 de compras
        int[][] compras = new int[4][4];
        int totalCompras = 0;
        int totalElementos = 4 * 4;
        //Solicitar al usuario que ingrese datos de compras
        System.out.println("Ingrese las compras para la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Compra en la posicion [" + i + "][" + j + "]: ");
                compras[i][j] = lectura.nextInt();
                totalCompras += compras[i][j];  // Sumar el valor al total de compras
            }
        }
        //Calcularemos el promedio de compras
        double promedioCompras = (double) totalCompras / totalElementos;
        // Mostraremos la matriz de compras
        System.out.println("\nMatriz de Compras:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(compras[i][j] + "\t");
            }
            System.out.println();
        }
        //Salida y fin de datos
        System.out.println("\nEl total de las compras es: " + totalCompras);
        System.out.println("El promedio de las compras es: " + promedioCompras);
    }
}