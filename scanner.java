import java.util.Scanner;
public class scanner {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Name");
  String name=sc.nextLine();
System.out.println("Enter Your Age"); 
        int age=sc.nextInt();
System.out.println("Enter Your Salary");
double salary=sc.nextDouble();
System.out.println("Enter Your Grade");
char grade=sc.next().charAt(0);
System.out.println(name+" "+age+" "+salary+" "+grade);
        sc.close();
    }
}
