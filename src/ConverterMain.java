import java.util.Scanner;

public class ConverterMain {
    public static void main(String[] args) {
        Scanner in = null;

        try {
            System.out.println("Enter your string");
            in = new Scanner(System.in);
    
            while (in.hasNextLine()) {
                String input = in.nextLine().toLowerCase();
                StringBuilder sb = new StringBuilder();
    
                sb.append(input);
                sb.append("\n");
    
                System.out.println("Result: " + sb);
                System.out.println("Enter your string");
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
