package strategyPattern;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("我能叫出声来");
    }
}
