package strategyPattern;

public class QuackNoWay implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我不能说话");
    }
}
