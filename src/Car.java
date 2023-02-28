import java.time.LocalDate;
import java.time.Period;

public class Car implements Type {
    private String brand;
    private LocalDate dateOfBirth;
    private long price;
    private Kuzov typeKuzov;

    public Car(String brand, LocalDate dateOfBirth, long price, Kuzov typeKuzov) {
        this.brand = brand;
        this.dateOfBirth = dateOfBirth;
        this.price = price;
        this.typeKuzov = typeKuzov;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Kuzov getTypeKuzov() {
        return typeKuzov;
    }

    public void setTypeKuzov(Kuzov typeKuzov) {
        this.typeKuzov = typeKuzov;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", price=" + price +
                ", typeKuzov=" + typeKuzov +
                '}';
    }

    @Override
    public void bodyTypeIdentification() {
        if (typeKuzov.equals(Kuzov.SEDAN)) {
            System.out.println("Legkovoy");
        } else if (typeKuzov.equals(Kuzov.HATCHBACK)) {
            System.out.println("Legkovoy");
        } else if (typeKuzov.equals(Kuzov.CROSSOVER)) {
            System.out.println("Vnedorojnik");
        } else if (typeKuzov.equals(Kuzov.VEHICLE)) {
            System.out.println("Vnedorojnik");
        } else {
            System.out.println("Universal");
        }
    }

    @Override
    public String YearOfManufacture() {
        Period a = Period.ofYears(Period.between(LocalDate.now(), dateOfBirth).getYears());
        System.out.println(a);
        return "";
    }

}
