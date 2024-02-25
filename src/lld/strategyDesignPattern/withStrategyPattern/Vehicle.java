package lld.strategyDesignPattern.withStrategyPattern;

import lld.strategyDesignPattern.withStrategyPattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject ;

    // this known as constructor injection
    Vehicle(DriveStrategy driveObj){
        this.driveObject = driveObj;
    }

    public void drive(){
        driveObject.drive();
    }

}
