import java.util.Scanner;
public class CompareNumbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("first number: ");
int num1 = scanner.nextInt();
System.out.print("second number: ");
int num2 = scanner.nextInt();
if (num1 > num2) {
System.out.println("num1 is greater" + num1);
}
else if (num2 > num1) {
System.out.println("num2 is greater " + num2);
} 
else {
System.out.println("Both  are equal.");
}
scanner.close();
}
}
