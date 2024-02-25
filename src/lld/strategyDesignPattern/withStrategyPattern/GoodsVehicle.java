package lld.strategyDesignPattern.withStrategyPattern;

import lld.strategyDesignPattern.withStrategyPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
