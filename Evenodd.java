import java.util.Scanner;
class Evenodd{
public static void main (String [] args){
Scanner sc  =  new Scanner(System.in);
System.out.println("enter num1: ");
int num1 =  sc.nextInt();
System.out.println("enter num2: ");
int num2 = sc.nextInt();
int tot = num1+num2;
if(tot%2==0){
System.out.println("multiple of 2 and it is even");
}
else{
System.out.println("not a multiple of 2 and it is odd");
}
}
}