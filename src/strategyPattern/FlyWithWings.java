package strategyPattern;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("我能用翅膀飞起来");
    }
}
