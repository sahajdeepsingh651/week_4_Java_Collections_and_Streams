import java.io.*;

public class DataStreams {

    public static void main(String[] args) {

        String filePath = "student.dat";

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))){
            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(8.5);

            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(9.1);

            System.out.println("Student data written successfully!");
        }
        catch (IOException e) {
            e.getMessage();
        }

        try(DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            System.out.println("\nReading Student data:");
            while (dis.available() > 0) {
                int roll = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll: " + roll + ", Name: " + name + ", GPA: " + gpa);
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
