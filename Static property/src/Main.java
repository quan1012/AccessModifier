public class Main {
    public static void main(String[] args) {
        Car car1 =new Car("Mazda 3","2020");
        System.out.println(Car.numberOfCars);
        Car car2= new Car("Mazda 6", "2030");
        System.out.println(Car.numberOfCars);
        car1.display();
        car2.display();
    }
}