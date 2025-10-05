import java.util.Scanner;

public class ConverterMain {
    public static void main(String[] args) {
        Scanner in = null;

        try {
            in = new Scanner(System.in);
            System.out.println("Enter your string");
            StringBuilder sb = new StringBuilder();
    
            while (in.hasNextLine()) {
                String input = in.nextLine().toLowerCase();
    
                sb.append(input);
                sb.append("\n");
    
                System.out.println("Result: " + sb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
