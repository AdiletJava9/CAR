import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi", LocalDate.of(2020, 4, 6), 60000, Kuzov.SEDAN);
        Car car1 = new Car("Opel", LocalDate.of(2020, 3, 5), 40000, Kuzov.HATCHBACK);
        Car car2 = new Car("Nissan", LocalDate.of(2021, 3, 5), 90000, Kuzov.CROSSOVER);
        Car car3 = new Car("Patriot", LocalDate.of(2022, 2, 3), 80000, Kuzov.VEHICLE);
        Car car4 = new Car("Honda", LocalDate.of(2021, 6, 9), 67000, Kuzov.UNIVERSAL);
        System.out.println(car);
        car.bodyTypeIdentification();
        car.YearOfManufacture();
        System.out.println();
        System.out.println(car2);
        car2.bodyTypeIdentification();
        car2.YearOfManufacture();
    }
}