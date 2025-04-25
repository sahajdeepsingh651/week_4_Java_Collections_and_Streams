import java.io.*;
packge
public class BufferedStreams {

    public static void BufferedStreamPerformance (String filepath, String destination) {
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filepath));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))){
            long start = System.nanoTime();
            byte[] buffer = new byte[4096];
            int data;
            while ((data = bis.read(buffer)) != -1){
                bos.write(buffer, 0, data);
            }
            long end = System.nanoTime();
            System.out.println("Buffered Stream Time (ms): " + (end - start) / 1000000);
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void UnBufferedStreamPerformance (String filepath, String destination) {
        try(FileInputStream fis = new FileInputStream(filepath);
        FileOutputStream fos = new FileOutputStream(destination)){
            long start = System.nanoTime();
            byte[] buffer = new byte[4096];
            int data;
            while ((data = fis.read(buffer)) != -1){
                fos.write(buffer, 0, data);
            }
            long end = System.nanoTime();
            System.out.println("Buffered Stream Time (ms): " + (end - start) / 1000000);
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filepath = "C:\\Users\\hp\\Downloads\\largefile.txt";
        String destination = "BufferedStreams.txt";
        String destination1 = "UnBufferedStreams.txt";

        BufferedStreamPerformance(filepath, destination);
        UnBufferedStreamPerformance(filepath, destination1);
    }
}
