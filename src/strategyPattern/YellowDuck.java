package strategyPattern;

public class YellowDuck extends Duck{

    public YellowDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
}
