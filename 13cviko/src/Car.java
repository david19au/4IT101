public class Car implements Vehicle, AutoCloseable { // Shift+F6 - refactoring

    public Car() {

        VehicleType vehicleType = VehicleType.CAR;

    }

    @Override
    public void drive() {

    }

    @Override
    public void close() throws Exception {

    }
}
