package OOPS;

class Student {
    String name;
    int age;

    public void Printinfo(String name){
        System.out.println(name);
    }
    public void Printinfo(int age){
        System.out.println(age);
    }
    public void Printinfo(String name, int age){
        System.out.println(name + " " + age);
    }
}
public class Test_02_poly {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.age = 29;
        s1.name = "Koles";
        s1.Printinfo(s1.name , s1.age);
    }
}
