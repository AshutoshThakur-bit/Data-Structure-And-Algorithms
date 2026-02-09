package Matrix;

public class SetMatrixZeroes {
    public static void setzero(int[][] m ){
        int r = m.length, c = m[0].length;
        boolean fc = false, fr = false;

        for(int i =0; i<r; i++)
            if(m[i][0] == 0)fc = true;
        for(int j= 0; j<c; j++)
            if(m[0][j] == 0)fr = true;

        for(int i= 0; i<r; i++){
            for(int j=0; j<c; j++){
                if(m[i][j] == 0 )m[i][0] = m[0][j]=0;
            }
        }
        
        for(int i= 0; i<r; i++){
            for(int j=0; j<c; j++){
                if(m[i][0] == 0  || m[0][j] == 0)m[i][j] = 0;
            }
        }
        if (fr) for (int j = 0; j < c; j++) m[0][j] = 0;
        if (fc) for (int i = 0; i < r; i++) m[i][0] = 0;

    }
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setzero(matrix);
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
        
    }
}
