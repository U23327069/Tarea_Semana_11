import java.util.Scanner;
public class Tarea03_Semana11 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);
        int[][] ventas = new int[4][4];
        int ventaMayor = 10;
        int ventaMenor = 5000;
        //Generamos ventas aleatorias entre 10 y 5000 y llenar la matriz
        System.out.println("Ventas registradas en la matriz 4x4:");
        for (int i=0;i<4;i++) {
            for (int j=0;j<4;j++) {
                ventas[i][j]=(int)(Math.random()*(5000-10+1)+10);
                //Mostrar el valor que se tiene generado
                System.out.print(ventas[i][j]+"\t");
                if (ventas[i][j] > ventaMayor) {
                    ventaMayor = ventas[i][j];
                }
                if (ventas[i][j] < ventaMenor) {
                    ventaMenor = ventas[i][j];
                }
            }
            System.out.println();
        }
        //Salida de datos
        System.out.println("\nLa venta mayor es: " + ventaMayor);
        System.out.println("La venta menor es: " + ventaMenor);
    }
}