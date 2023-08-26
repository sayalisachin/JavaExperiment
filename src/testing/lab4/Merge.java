import java.util.Scanner;
class Merge{
    int a[]=new int[10],b[]=new int[10],c[]=new int[20],m,n;

void accept(){
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter the number of elements in first array");
    m=sc.nextInt();
    System.out.println("\nEnter the elements in first array ");
    for(i=0;i<m;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("\nEnter the number of elements in first array");
    n=sc.nextInt();
    System.out.println("\nEnter the elements in first array ");
    for(i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    
}
void merger(){
    int i,j;
    for(i=0;i<m;i++){
        c[i]=a[i];
    }
    j=i;
    for(i=0;i<n;i++){
        c[j]=b[i];
    }
    System.out.println("\nThe merged array is: ");
    for(i=0;i<m+n;i++){
        System.out.print(c[i]+" ");
    }
    
}
public static void main(String[] args) {
    Merge m=new Merge();
    m.accept();
    m.merger();
}
}
