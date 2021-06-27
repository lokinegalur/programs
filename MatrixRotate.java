class MatrixRotate {

    static void swap(int i,int j,int[][] mat){

        int temp = mat[i][j];
 
        mat[i][j]=mat[j][i];

        mat[j][i]=temp;

    }
     static void rowSwap(int i,int j,int k,int[][] mat){

        int temp = mat[i][j];

        mat[i][j]=mat[i][k];

        mat[i][k]=temp;

    }

    public void rotate(int[][] matrix) {

        int n=matrix.length;

        for(int i=0;i<n;i++){

            for(int j=i;j<n;j++){

                swap(i,j,matrix);

            }

        }


        
   for(int i=0;i<n;i++){

            for(int j=0;j<n/2;j++){

                rowSwap(i,j,n-j-1,matrix);

            }

        }

     }

}