package P98_Practice.p11;

public class CarAgency implements Rentable<Car>{
    @Override
    public Car rent() {
        return new Car();
    }
}
