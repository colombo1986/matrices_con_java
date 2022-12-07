import java.util.Scanner;

public class ImprimirSilla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz (n x n): ");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];
        System.out.println("n/2+1 = " + ((n/2)+1));

        if (n == 0) {
            System.out.println("ERROR");
            System.exit(1);
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               if(j ==0 || ((n/2) == i) || (j == matriz.length -1 && i > matriz.length/2)){
                   matriz[i][j] = 1 ;
               }

            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
