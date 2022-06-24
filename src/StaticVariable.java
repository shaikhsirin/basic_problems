public class StaticVariable {
    static int a =10;
    static void display(){
        System.out.println("Static Method");

    }
    static {
        System.out.println("Static Block");
    }
    public static void main(String args[]){
        System.out.println(a);//in static variable directly access a without static we cannot access direct
        display();
    }

}
