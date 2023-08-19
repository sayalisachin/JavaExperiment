package testing.lab4;

public class MatrixDiagnols {
    private int input_matrix[][];
    private int matrix_size;
    private int i;
    private int j;
    private int primary_diagnol;
    private int secondary_diagnol;

    public MatrixDiagnols(int i, int j){
        this.i=i;
        this.j=j;
    }
    public int getI(){
        return i;
    }
    public void setI (int i){
        this.i=i;
    }
    public int getJ(){
        return j;
    }
    public void setJ(int j){
        this.j=j;
    }
    public static void main(String[] args) {
        int input_matrix[][]={
            {1,2,3,4},
            {5,9,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int matrix_size=4;
        System.out.println("Matrix defined as: ");
        for(int i=0;i<matrix_size;i++){
            for(int j=0;j<matrix_size;j++){
                System.out.print(input_matrix[i][j]+" ");
                
            }
            System.out.print("\n");
        }
        int primary_diagnol=0;
        int secondary_diagnol=0;
        for(int i=0;i<matrix_size;i++){
            for(int j=0;j<matrix_size;j++){
                if(i==j){
                    primary_diagnol+=input_matrix[i][j];
                }
                else if((i+j)==matrix_size-1){
                    secondary_diagnol+=input_matrix[i][j];
                }
                
            }
        }
            System.out.println("Sum of elements in primary diagnol: "+primary_diagnol);
            System.out.println("Sum of elements in secondary diagnol: "+secondary_diagnol);
        
    }
        
    

}
