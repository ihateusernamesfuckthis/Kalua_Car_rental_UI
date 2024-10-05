public class Car {

    String type;
    String brand;
    String model;
    String fueltype;
    String registrationNumber;
    String registrationYearMonth;
    int odometer;
    String transmission;
    int enginePower;

    int engineCapacity;

    public Car(String brand, String model, String fueltype, String registrationNumber, String registrationYearMonth,
               int odometer, String transmission, int enginePower, int engineCapacity) {

        this.brand = brand;
        this.model = model;
        this.fueltype = fueltype;
        this.registrationNumber = registrationNumber;
        this.registrationYearMonth = registrationYearMonth;
        this.odometer = odometer;
        this.transmission = transmission;
        this.enginePower = enginePower;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationYearMonth() {
        return registrationYearMonth;
    }

    public void setRegistrationYearMonth(String registrationYearMonth) {
        this.registrationYearMonth = registrationYearMonth;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
