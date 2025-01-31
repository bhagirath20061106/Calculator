import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double Add, Sub, Div, Mul; int opt;
        String menu = "1. Addition\n2. Subtraction\n3. Multiply\n4. Division";
        
        try (Scanner get = new Scanner(System.in)) {

            System.out.println("Enter your 1st Value: ");
            double A = get.nextDouble();
            System.out.println("Enter your 2nd Value: ");
            double B = get.nextDouble();
            System.out.println("\n*****Menu*****");
            System.out.println(menu);
            System.out.println("\nEnter your choice: ");
            opt = get.nextInt();
            
            switch (opt) {
                case 1 -> {
                    Add = A+B;
                    System.out.printf("\nAddition: %d",(int) Add);
                }
                case 2 -> {
                    Sub = A-B;
                    System.out.printf("\nSubtraction: %d",(int) Sub);
                }
                case 3 -> {
                    Mul = A*B;
                    System.out.printf("\nMultiplication: %d",(int) Mul);
                }
                case 4 -> {
                    Div = A/B;
                    System.out.printf("\nDivision: %.2f", Div);
                }
            }
        }
    }
}
