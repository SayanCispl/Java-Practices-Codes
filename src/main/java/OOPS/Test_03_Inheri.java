package OOPS;

class Shape {
    public void Square(){
        System.out.println("Test1");
    }
}
class test extends Shape{
    public void Testing(){
        System.out.println("Test2");

    }
}
public class Test_03_Inheri {
    public static void main(String[] args){
        Shape s1 = new Shape();
        s1.Square();
        test t1 = new test();
        t1.Testing();
    }
}
