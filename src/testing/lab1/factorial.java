//factorial of a number
package testing.lab1;
import java.util.Scanner;


public class factorial {
    private int n;
    private int i;
    private int result;

    public factorial(int n){
        this.n=n;
    }

    public int getN(){
        return n;
    }

    public setN(int n){
        this.n=n;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value for which you want to find its Factorial and table");
        int n=scanner.nextInt();
        int result=1;
        int table=1;

        factorial Factorial=new factorial(n);

        for(int i=1;i<n+1;i++){
            result=result*i;
        }
        System.out.println("Factorial is: "+result);

        for(int i=1;i<11;i++){
            table=n*i;
            System.out.println(n+ "X" + i+ "=" +table);

        }




    
}
}
