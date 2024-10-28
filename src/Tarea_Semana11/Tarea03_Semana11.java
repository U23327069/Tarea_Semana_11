import java.util.Scanner;
public class Tarea03_Semana11 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);
        int[][] ventas = new int[4][4];
        int ventaMayor = 10;  // Inicializamos con el mínimo posible en el rango
        int ventaMenor = 5000; // Inicializamos con el máximo posible en el rango

        // Generar ventas aleatorias entre 10 y 5000 y llenar la matriz
        System.out.println("Ventas registradas en la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Generar un número aleatorio entre 10 y 5000
                ventas[i][j] = (int)(Math.random() * (5000 - 10 + 1) + 10);
                
                // Mostrar el valor generado
                System.out.print(ventas[i][j] + "\t");

                // Verificar si es la venta mayor o menor
                if (ventas[i][j] > ventaMayor) {
                    ventaMayor = ventas[i][j];
                }
                if (ventas[i][j] < ventaMenor) {
                    ventaMenor = ventas[i][j];
                }
            }
            System.out.println(); // Imprimir nueva línea después de cada fila
        }

        // Mostrar resultados
        System.out.println("\nLa venta mayor es: " + ventaMayor);
        System.out.println("La venta menor es: " + ventaMenor);
    }
}