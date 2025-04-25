import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreams {
    public static void main(String[] args) throws IOException {

        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream();

        pos.connect(pis);

        Thread writerThread = new Thread(() -> {
            try{
                String message = "Hello from the Writer Thread!";
                pos.write(message.getBytes());
                pos.close();
            }
            catch (IOException e) {
                System.out.println("Writer Exception: " + e.getMessage());
            }
        });

        Thread readerThread = new Thread(() -> {
            try{
                int data;
                while ((data = pis.read()) != -1){
                    System.out.print((char) data);
                }
                pis.close();
            }
            catch (IOException e) {
                System.out.println("Reader Exception: " + e.getMessage());
            }
        });

        writerThread.start();
        readerThread.start();
    }
}
