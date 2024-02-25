package lld.strategyDesignPattern.withStrategyPattern;

import lld.strategyDesignPattern.withStrategyPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
