package strategyPattern;

public class mainOne {


    /**
     *
     * 策略模式
     *
     * */
    public static void main(String[] args){
        Duck duck = new YellowDuck();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new QuackNoWay());
        duck.performFly();
        duck.performQuack();
        SimulationDuck simulationDuck = new SimulationDuck();
        simulationDuck.fly();
        simulationDuck.quack();
    }
}
