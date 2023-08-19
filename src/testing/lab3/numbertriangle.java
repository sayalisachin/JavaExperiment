package testing.lab3;
import java.util.Scanner;

public class numbertriangle {
    private int n;
    private int i;
    private int j;

    public numbertriangle(int n){
        this.n=n;
        
    }
    public int getN(){
        return n;
    }
    public void setN(int n){
        this.n=n;

    }
    

    public static void main(String[] args) {
        int i,j;
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
        

    }
        
    

}
