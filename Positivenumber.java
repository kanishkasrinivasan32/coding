import java.util.Scanner;
class Postivenumber{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("Addition: "+(a+b));
System.out.println("Subtraction: "+(a>b?a-b:b-a));

}

}
