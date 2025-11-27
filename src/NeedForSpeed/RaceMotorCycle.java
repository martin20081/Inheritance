package NeedForSpeed;

public class RaceMotorCycle extends Motorcycle{

    private static final  double DEFAULT_FUEL_CONSUMPTION = 8;
    public RaceMotorCycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
