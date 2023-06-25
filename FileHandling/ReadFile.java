package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {

    public static void main(String[] args) { 
    

        // try {
        //     File file = new File("C:\\Users\\adilk\\OneDrive\\Desktop\\mongo_creds.txt");
        //     BufferedReader bf = new BufferedReader(new FileReader(file)); 
        //     String str;

        //     while((str=bf.readLine())!=null) {
        //         System.out.println(str);
    
        //     }
        //     bf.close();
            
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        //Reading a file in one line 
        
        try {
            System.out.println(new String(Files.readAllBytes(Paths.get("C:\\Users\\adilk\\OneDrive\\Desktop\\mongo_creds.txt"))));
        } catch (IOException e) {
            
            e.printStackTrace();
        }
                
    }
}
    

