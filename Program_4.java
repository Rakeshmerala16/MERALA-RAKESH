import java.util.*;

public class Program_4{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers separated by space:");
        String[] numbers = sc.nextLine().split(" ");

        int[] counts = new int[10]; 

        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    counts[i]++;
                }
            }
        }

     
        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + counts[i]);
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        sc.close();
    }
}
