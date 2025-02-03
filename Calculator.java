import java.util.Scanner;
class Calculator {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.print("Enter num1 : ");
int num1 = sc.nextInt();
System.out.print("Enter num2: ");
int num2 = sc.nextInt();
System.out.println("enter operator:");
char operator=sc.next().charAt(0);
switch(operator){
case 'a':
System.out.println("Add: "+(num1+num2));
break;
case 's':
System.out.println("Sub: "+(num1-num2));
break;
case 'm':
System.out.println("Mul: "+(num1*num2));
break;
case 'd':
System.out.println("Div:" +(num1/num2));
break;
case'u':
System.out.println("Mod: "+(num1%num2));
break;

default:
System.out.println("Invalid");
}
}
}