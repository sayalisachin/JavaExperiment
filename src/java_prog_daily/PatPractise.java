/* Make  names of two files. Copy contents of first and second.
* First file having book name and author name in file
 * second file having contents of first file
 * Add copy finish at the end of program
 */

package java_prog_daily;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class PatPractise {
    public static void main(String args[]) throws Exception{
        try (Scanner sc=new Scanner(System.in)){
            System.out.print("source file name: \n");
            String file1=sc.next();
            System.out.print("destination file name: \n");
            String file2=sc.next();

            FileReader fin=new FileReader(file1);
            FileWriter fout= new FileWriter(file2, true);
            int c;
            while ((c=fin.read())!=-1){
                fout.write(c);
            }
            //closing program statement
            System.out.println("Copy finish");

            fin.close();
            fout.close();


        }
    }

    
}
