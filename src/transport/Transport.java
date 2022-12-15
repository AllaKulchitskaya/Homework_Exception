package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        if (StringUtils.isValid(brand)) {
            brand = "марка не указана";
        }
        this.brand = brand;
        if (StringUtils.isValid(model)) {
            model = "модель не указана";
        }
        this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 1.6;
        }
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract boolean goThroughDiagnostics();

    @Override
    public String toString() {
        return brand + ", модель " + model + ", объем двигателя - " + engineVolume + " л";
    }
}
