package OOPS;

class Account{
    public String Name;
    protected String Email;
    private String Password;
    //Getter and setter
    public String getPassword(){
        return this.Password;
    }
    public void setPassword(String password){
        this.Password= password;
    }
}
public class Test_04_Access_Modifier {
    public static void main(String args[]){
        Account A1 = new Account();
        A1.Name = "Koles";
        A1.Email = "koles@gmail.com";
        A1.setPassword("Test");
        System.out.println(A1.getPassword());

    }
}
