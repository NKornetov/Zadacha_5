import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int x = 1;

        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число: ");
            int number = in.nextInt();

            System.out.println(number + " * " + x + " = " + (number*x));
            x++;
            System.out.println(number + " * " + x + " = " + (number*x));
            x++;
            System.out.println(number + " * " + x + " = " + (number*x));
            x++;
            System.out.println(number + " * " + x + " = " + (number*x));
            x++;
            System.out.println(number + " * " + x + " = " + (number*x));
            x++;
            System.out.println(number + " * " + x + " = " + (number*x));
            x++;
            System.out.println(number + " * " + x + " = " + (number*x));
            x++;
            System.out.println(number + " * " + x + " = " + (number*x));

        } catch (java.util.InputMismatchException e) {
            System.out.println("Введенное значение не является числом");
        }

    }
}
