import java.util.Scanner;

 class Program_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number (a):");
        int a = sc.nextInt();  

        for (int i = 0; i < a; i++) {
            System.out.print((2 * i + 1));
            if (i < a - 1) {
                System.out.print(", ");
            }
        }
    }
}
