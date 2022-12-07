public class MatrizSimetrica {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        boolean simetrica = true ;

        int i = 0 , j  ;

        while(i < matriz.length && simetrica == true ){
             j = 0 ;
            while (j < i && simetrica==true){
              if(matriz[i][j] != matriz[j][i]){
                  simetrica= false ;
              }
              j++ ;
            }
            i++ ;
        }

        if(simetrica){
            System.out.println("La matriz es simetrica");
        }else{
            System.out.println("La matriz no es simetrica ");
        }
    }
}
