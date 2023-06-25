import java.io.FileOutputStream;

public class TryWithResources {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("C:\\Users\\adilk\\OneDrive\\Desktop\\practice\\output\\sample.txt")) {
            String content = "Hello... this is the sample content...";

            byte arr[] = content.getBytes();
            fos.write(arr);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("All resources are closed and content is written into sample file...");
    }
}
