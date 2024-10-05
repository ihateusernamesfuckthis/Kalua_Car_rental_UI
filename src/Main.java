import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        addCar(scan);
        addCustomer(scan);

        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an option:");
            System.out.println("1. Add car");
            System.out.println("2. Add customer");


            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    addCar(scan);
                    break;
                case 2:
                    addCustomer(scan);
                    break;
                case 3:
                    System.out.println("Exiting program..");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    public static Car addCar(Scanner scan) {

        System.out.println("Enter car brand:");
        String brand = scan.nextLine();

        System.out.println("Enter car model: ");
        String model = scan.nextLine();

        System.out.println("Enter fueltype: ");
        String fueltype = scan.nextLine();

        System.out.println("Enter registration number: ");
        String registrationNumber = scan.nextLine();

        System.out.println("Enter Year and month of registration: ");
        String registrationYearMonth = scan.nextLine();

        System.out.println("Enter amount of miles driven: ");
        int odometer = scan.nextInt();

        System.out.println("Enter type of transmission (automatic/manual): ");
        String transmission = scan.nextLine();

        System.out.println("Enter horsepower amount: ");
        int enginepower = scan.nextInt();

        System.out.println("Enter engine capacity (in CC)");
        int engineCapacity = scan.nextInt();

        Car car = new Car(brand, model, fueltype, registrationNumber, registrationYearMonth,
                odometer, transmission, enginepower, engineCapacity);

        classifyCar(car);

        return car;
    }

    public static Customer addCustomer(Scanner scan) {
        System.out.println("Enter name");
        String name = scan.nextLine();

        System.out.println("Enter driver license number");
        String driverLicenseNumber = scan.nextLine();

        System.out.println("Enter the amount of years you've had a drivers license: ");
        int yearsOfDrivingExperience = scan.nextInt();

        System.out.println("Enter your address: ");
        String address = scan.nextLine();

        System.out.println("Enter your city of residence: ");
        String city = scan.nextLine();

        System.out.println("Enter your zipcode: ");
        String zipcode = scan.nextLine();

        System.out.println("Enter your email: ");
        String email = scan.nextLine();

        System.out.println("Enter your phone number");
        String phoneNumber = scan.nextLine();

        System.out.println("Enter your mobilephone number: ");
        String mobilePhoneNumber = scan.nextLine();


        return new Customer(name, driverLicenseNumber, yearsOfDrivingExperience,
                address, city, zipcode, email, phoneNumber, mobilePhoneNumber);

    }

    public static void classifyCar (Car car){
        if (car.getTransmission().equals("Automatic") && car.getEngineCapacity() > 3000){
            car.setType("Luxury");
        } else if (car.getTransmission().equals("Manual") && car.getEnginePower() > 200){
            car.setType("Sport");
        } else if (car.getTransmission().equals ("Manual") && car.getEnginePower() <= 200){
            car.setType("Family");
        } else {
            car.setType("Unknown");
        }
    }
}