import java.util.Scanner;
public class Tarea_Semana11 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);
        //Definimos la matriz de 4x4 de ventas
        int[][] ventas = new int[4][4];
        int totalVentas = 0;
        //Aplicamos variables y solicitamos al usuario ingresar datos
        System.out.println("Ingrese las ventas para la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Venta en la posicion [" + i + "][" + j + "]: ");
                ventas[i][j] = lectura.nextInt();
                totalVentas += ventas[i][j];
            }
        }
        // Mostraremos la matriz de toda venta
        System.out.println("\nMatriz de Ventas:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(ventas[i][j] + "\t");
            }
            System.out.println();
        }
        //Salida de datos
        System.out.println("\nEl total de las ventas es: " + totalVentas);
    }    
}
