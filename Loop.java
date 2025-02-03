import java.util.Scanner;
class Loop {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String a = sc.next();
if(a.equals("f")){
for(;;){
System.out.println("infinite");
}
}
else if(a.equals("w")){
while(true){
System.out.println("infinite");
}
}
else{
System.out.println("invalid");
}
}
}