import driver.DriverCategoryB;
import driver.DriverCategoryC;
import driver.DriverCategoryD;
import transport.Bus;
import transport.Car;
import transport.Transport;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car kia = new Car("KIA", "Soul", 2);
        System.out.println(kia);
        Car audi = new Car("Audi", "Q8", 3);
        System.out.println(audi);
        Car toyota = new Car("Toyota", "Sienna", 2.5);
        System.out.println(toyota);
        Car corvette = new Car("Chevrolet Corvette", "C6", 6.2);
        System.out.println(corvette);
        Truck valdai = new Truck("Валдай", "Next", 2.8);
        System.out.println(valdai);
        Truck kamaz = new Truck("КамАЗ", "54901", 12);
        System.out.println(kamaz);
        Truck gazel = new Truck("ГАЗель", "NN", 2.7);
        System.out.println(gazel);
        Truck dongFeng = new Truck("DongFeng", "Captain-T", 2.2);
        System.out.println(dongFeng);
        Bus liaz = new Bus("ЛиАЗ", "Курсор-4292", 4.43);
        System.out.println(liaz);
        Bus hyundai = new Bus("Hyundai", "Aero Town", 7.5);
        System.out.println(hyundai);
        Bus volvo = new Bus("Volvo", "8900", 7.7);
        System.out.println(volvo);
        Bus scania = new Bus("Scania", "OmniLink", 9);
        System.out.println(scania);

        makeDiagnostics(kia, audi, toyota, corvette,
                valdai, kamaz, gazel, dongFeng,
                liaz, hyundai, volvo, scania);
    }

    private static void makeDiagnostics(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);



        }
    }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.goThroughDiagnostics()) {
                throw new RuntimeException("Траспортное средство " + transport.getBrand() +
                        " не прошло диагностику!");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}