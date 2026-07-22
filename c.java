class A{
public A(){
    System.out.println("IN A");
}
public A(int a){
System.out.println("INT IN A");
}
}
class B extends A{
public B(){
super();
    System.out.println("IN B");
}
public B(int a){
    this();
//extends to the super class
System.out.println("INT IN B");
}
}
public class c {
    public static void main(String args[]){
B obj=new B(5);
    }
}
