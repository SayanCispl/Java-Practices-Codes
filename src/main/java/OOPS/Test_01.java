package OOPS;
class Pen{
    String Colour;
    String Type;

    public void Write (){
        System.out.println("Test");
    }
}

public class Test_01 {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.Colour = "Red";
        p1.Type = "Gel";
        p1.Write();
    }
}
