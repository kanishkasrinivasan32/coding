import java.util.Scanner;
class Multiplesof100{
public static void main (String [] args){
Scanner sc  =  new Scanner(System.in);
System.out.println("enter num:");
int num =  sc.nextInt();
if(num%100==0){
System.out.println("multiple of 100");
}
else{
System.out.println("not a multiple of 100");
}
}
}