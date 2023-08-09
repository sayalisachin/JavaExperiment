package java_prog_daily;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
class copy{
public static void main(String arg[]) throws Exception {
try (Scanner sc = new Scanner(System.in)) {
    System.out.print("source file name :\n");
    String file1 = sc.next();
    System.out.print("destination file name :\n");
    String file2 = sc.next();
    FileReader fin = new FileReader(file1);
    FileWriter fout = new FileWriter(file2, true);
    int c;
    while ((c = fin.read()) != -1) {
    fout.write(c);
    }
    System.out.println("Copy finish...");
    
    fin.close();
    fout.close();
}
}
}
