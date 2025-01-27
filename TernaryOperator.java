import java.util.Scanner;
class TernaryOperator{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("1st no: ");
int n1 = sc.nextInt();
System.out.println("2nd no: ");
int n2 = sc.nextInt();
System.out.println("3rd no: ");


int n3 = sc.nextInt();
int greatnumber = (n1>=n2 && n1>=n3)?n1:(n2>=n3)?n2:n3;
System.out.println("greatest number: "+greatnumber);
}
}
