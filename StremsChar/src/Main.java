import java.io.*;
import java.nio.charset.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        while (scanner.hasNext()) {
            try {
                sum += Double.parseDouble(scanner.next());
            }
            catch(Throwable t) {}
        }
        System.out.format("%.6d", sum);
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream, charset));
        //Writer out = new OutputStreamWriter(System.out, charset);
        int el = in.read();
        StringBuilder stringBuilder = new StringBuilder();
        while (el != -1) {
            stringBuilder.append((char) el);
            el = in.read();
        }
        return stringBuilder.toString();
    }
}
