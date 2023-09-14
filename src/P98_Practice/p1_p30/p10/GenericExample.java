package P98_Practice.p1_p30.p10;

public class GenericExample {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv());
        product1.setModel("SmartTv");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        System.out.println(tvModel);

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();
        System.out.println(carModel);
    }
}
