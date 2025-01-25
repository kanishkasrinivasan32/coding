import java.util.Random;
class Randomnumbers{
public static void main(String[]args){
Random rand = new Random();
int a = rand.nextInt();
int b= rand.nextInt();
int sum = a+b;
System.out.println("Value of a: "+a);
System.out.println("Value of b: "+b);
System.out.println("Sum: "+sum);
}
}