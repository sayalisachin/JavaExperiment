package testing.lab10;

import java.io.File;

public class ListFilesAndDirectories {
    public static void main(String[] args) {
        String directoryPath = "/path/to/your/directory"; // Replace with your directory path
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] filesAndDirs = directory.listFiles();

            System.out.println("Files and Directories in " + directoryPath + ":");
            for (File file : filesAndDirs) {
                if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getName());
                } else {
                    System.out.println("File: " + file.getName());
                }
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }
}

