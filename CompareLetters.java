import java.util.Scanner;
public class CompareLetters {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("first letter: ");
char l1 = scanner.next().charAt(0);
System.out.print("second letter: ");
char l2 = scanner.next().charAt(0);
System.out.println("equal to: " + (l1 == l2));
System.out.println("not equal to:  " + (l1 != l2));
System.out.println("greater than:  " + (l1 > l2));
System.out.println("lesser than:  " + (l1 < l2));
System.out.println("greater than equal to:  " + (l1 >= l2));
System.out.println("lesser than equal to:  " + (l1 <= l2));

scanner.close();
}
}
