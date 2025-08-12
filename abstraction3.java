abstract class Aeroplane
{
    abstract public void takeoff();
    
    abstract public void fly();

    public void landing()  // here it not achieving complete abstraction bcz there is one concrete method
    {
        System.out.println("Aeroplane is landing");
    }
}
class Cargoplane extends Aeroplane
{
    public void takeoff()
    {
        System.out.println("Cargoplane needs a longer runway...");
    }
    public void fly()
    {
        System.out.println("Cargoplane flies at lower height..");
    }
    public void alert()
    {
        System.out.println("Alert....");
    }
}
class PassengerPlane extends Aeroplane
{
    public void takeoff()
    {
        System.out.println("Passenger plane needs a medium size runway...");
    }
    public void fly()
    {
        System.out.println("Passenger plane flies at higher height...");
    }
}
public class abstraction3 {
    public static void main(String[] args) {
        Aeroplane ref = new Cargoplane();
        ref.takeoff();
        ref.fly();
       // ref.landing();
        //ref.alert();    this will show error bcz it is not present in parent class and we are using parent type refrence
        ((Cargoplane)ref).alert();   //down casting 
        Aeroplane ref1 = new PassengerPlane();
        ref1.takeoff();
        ref1.fly();
       // ref1.landing();

    }
}

