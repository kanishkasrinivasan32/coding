import java.util.Scanner;
class Simpleinterest{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("p= ");
double P = sc.nextDouble();
System.out.print("R= ");
double R = sc.nextDouble();
System.out.print("T= ");
double T = sc.nextDouble();
double SI = (P*T*R)/100;
System.out.println("simple interest: "+SI);
sc.close();
}
}