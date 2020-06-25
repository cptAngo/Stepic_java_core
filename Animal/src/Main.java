import java.io.*;

public class Main {
    public static void main(String[] args) {

    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(data));) {
            int size = in.readInt();
            Animal[] arr = new Animal[size];
            for (int i = 0; i < size; i++) {
                arr[i] = (Animal) in.readObject();
            }
            in.close();
            return arr;
        }
        catch (Throwable t) {
            throw new java.lang.IllegalArgumentException();
        }
    }
}
