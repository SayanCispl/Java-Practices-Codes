package OOPS;

class employee {
    int salary = 20000;
}
class engineer extends employee{
    int benefits = 10000;
}

 class Inheritance {
     public static void main(String[] args) {
         engineer E1 = new  engineer();
         System.out.println("Salary : " + E1.salary
                 + "\nBenefits : " + E1.benefits);

     }
}
