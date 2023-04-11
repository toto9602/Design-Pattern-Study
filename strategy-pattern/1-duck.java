p.50 - 1
interface FlyBehavior {
    public void fly();
}

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
};
