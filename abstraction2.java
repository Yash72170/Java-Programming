abstract class Aeroplane
{
    abstract public void takeoff();
    
    abstract public void fly();

    void landing()  // here it not achieving complete abstraction bcz there is one concrete method
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
public class abstraction2 {
    public static void main(String[] args) {
        Aeroplane ref = new Cargoplane();
        ref.takeoff();
        ref.fly();
        ref.landing();
        Aeroplane ref1 = new PassengerPlane();
        ref1.takeoff();
        ref1.fly();
        ref1.landing();

    }
}
