import java.util.Scanner;
class WashingMachine {
public static void main(String[] args) {
int time = 0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter weight : ");
int weight = sc.nextInt();
System.out.print("Enter level: ");
String level = sc.next();
if (weight < 0) {
System.out.println("INVALID INPUT");
} 
else if (weight == 0) {
System.out.println("Time Estimated: 0 minutes");
} 
else if (weight > 7000) {
System.out.println("OVERLOADED");
}
else {
if (level.equals("L") && weight <= 2000) {
time = 25;
} 
else if (level.equals("M") && weight >= 2001 && weight <= 4000) {
time = 35;
} 
else if (level.equals("H") && weight > 4000) {
time = 45;
} 
else {
System.out.println("INVALID INPUT");
return; 
}
System.out.println("Time Estimated: " + time + " minutes");
}
}
}