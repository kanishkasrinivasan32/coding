import java.util.Scanner;
class GreatestNumber {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int a = sc.nextInt();

int b = sc.nextInt();

int c = sc.nextInt();

if(a>b && a>c){
System.out.println("A is greater");
}
else if(b>c && b>a){
System.out.println("B is greater");
}
else if(c>a && c>b){
System.out.println("C is greater");
}
else{
System.out.println("three numbers are equal");
}
}
}
