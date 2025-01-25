import java.util.Scanner;
class Comparefloat {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double num1 = sc.nextDouble();
double num2 =sc.nextDouble();
num1 = Math.round(num1 * 1000.0) / 1000.0;
num2 = Math.round(num2 * 1000.0) / 1000.0;
if (num1 == num2) {
System.out.println("The numbers are equal up to three decimal places.");
} 
else {
System.out.println("The numbers are not equal up to three decimal places.");
}
}
}