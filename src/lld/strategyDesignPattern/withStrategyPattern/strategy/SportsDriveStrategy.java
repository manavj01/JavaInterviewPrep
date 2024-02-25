package lld.strategyDesignPattern.withStrategyPattern.strategy;

public class SportsDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Sports drive Capability");
    }
}
