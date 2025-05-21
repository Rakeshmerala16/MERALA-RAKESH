import java.util.*;

public class Program_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter input a:");
        int a = sc.nextInt(); 

        // If 'a' is even, subtract 1
        if (a % 2 == 0) {
            a = a - 1;
        }

        for (int i = 0; i < a; i++) {
            System.out.print((2 * i + 1));
            if (i < a - 1) {
                System.out.print(", ");
            }
        }
    }
}
