public class Matrix2D {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,10},
                       {4,5,6,11},
                       {7,8,9,12}};
        System.out.println("Matrix Row length: "+mat.length);
        System.out.println("Matrix Column length: "+mat[0].length);
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+20+" ");
            }
        }
    }
}
