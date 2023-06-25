import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

public class TryWithMultipleResources {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("C:\\Users\\adilk\\OneDrive\\Desktop\\practice\\output\\output.txt");
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\adilk\\OneDrive\\Desktop\\practice\\output\\sample.txt"))) {

            String content = "";
            while((content = br.readLine()) != null) {
                byte arr[] = content.getBytes();
                fos.write(arr);
            }
            System.out.println("File sample copied to output file");
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("All resources are closed and content is written into sample file...");
    }
}
