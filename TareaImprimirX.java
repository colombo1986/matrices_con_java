import java.util.Scanner;

public class TareaImprimirX {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int x = s.nextInt() ;
        System.out.println("x = " + x);

        String matriz[][] = new String[x][x] ;
        int flag = matriz.length  ;


        for(int i = 0 ; i < matriz.length ; i++){
            for(int j = matriz[i].length - 1 ; j > -1 ; j--) {
                if (i == j) {
                    matriz[i][j] = "x";
                } else {
                    matriz[i][j] = "_";
                }
            }
            flag-- ;
            matriz[i][flag] = "x";

        }


        for(int i = 0 ; i < matriz.length ; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                System.out.print(matriz[i][k]);

            }
            System.out.println();
        }
    }
}
