package strategyPattern;

public class SimulationDuck implements FlyBehavior,QuackBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }

    @Override
    public void quack() {
        System.out.println("模拟鸭叫声");
    }
}
