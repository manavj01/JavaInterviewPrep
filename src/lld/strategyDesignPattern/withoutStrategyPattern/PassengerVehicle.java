package lld.strategyDesignPattern.withoutStrategyPattern;

public class PassengerVehicle extends Vehicle{
    @Override
    public void drive(){
        System.out.println("Passenger drive capability");
    }
}
