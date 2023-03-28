public class Car {
    private String name;
    private String year;
    public static  int numberOfCars;

    public Car(String name, String year) {
        this.name = name;
        this.year = year;
        numberOfCars++;
    }
    public void display (){
        System.out.println(this.name + " " + this.year);
    }

}
