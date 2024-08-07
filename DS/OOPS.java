import bank.*;
interface  Animal{
    void walk();
}
class Horse implements Animal{
    public void walk(){
        System.out.println("bhag ghode");
    }
}
public class OOPS {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
    }
} 