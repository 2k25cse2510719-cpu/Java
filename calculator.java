class basic{
    public int sum(int a,int b){
        return a+b;
    }
    public int diff(int a,int b){
        return a-b;
    }
}
public class calculator {
    public static void main(String args[]){
        veryAdvCal bs=new veryAdvCal();//we called veryAdvCal because 
        int a=10;//basic only know two methods i.e. sum and diff.
        int b=3;
        int store1=bs.sum(a,b);
        int store2=bs.diff(a,b);
        int store3=bs.multi(a,b);
        double store4=bs.div(a,b);
        double store5=bs.square(a);
        System.out.println(store1);
        System.out.println(store2);
        System.out.println(store3);
        System.out.println(store4);
        System.out.println(store5);
    }
}
