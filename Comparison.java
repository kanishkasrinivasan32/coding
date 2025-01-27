import java.util.Scanner;
public class Comparison {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("first number: ");
int num1 = scanner.nextInt();
System.out.print("second number: ");
int num2 = scanner.nextInt();
System.out.println("equal to: " + (num1 == num2));
System.out.println("not equal to:  " + (num1 != num2));
System.out.println("greater than:  " + (num1 > num2));
System.out.println("lesser than:  " + (num1 < num2));
System.out.println("greater than equal to:  " + (num1 >= num2));
System.out.println("lesser than equal to:  " + (num1 <= num2));

scanner.close();
}
}
