package bank;
class Account{
     public String Name;
     public void setName(String name){
          this.Name=name;
     }
     public String giveName(){
          return this.Name;
     }
}
public class Bank{
     public static void main(String[] args) {
          Account acc1 = new Account();
          acc1.setName("Omkar");
          String p1=acc1.giveName();
          System.out.println(p1);

     }
}
