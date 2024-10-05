public class Customer {
    String name;
    String driverLicenseNumber;
    int yearsOfDrivingExperience;
    String address;
    String city;
    String zipcode;
    String email;
    String phoneNumber;
    String mobilePhoneNumber;

    public Customer(String name, String driverLicenseNumber, int driverSinceDate, String address, String city,
                    String zipcode, String email, String phoneNumber, String mobilePhoneNumber){
        this.name = name;
        this.driverLicenseNumber = driverLicenseNumber;
        this.yearsOfDrivingExperience = yearsOfDrivingExperience;
        this.address = address;
        this.city = city;
        this.zipcode = zipcode;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }
    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }
    public int getYearsOfDrivingExperience() {
        return yearsOfDrivingExperience;
    }
    public void setYearsOfDrivingExperience(int yearsOfDrivingExperience) {
        this.yearsOfDrivingExperience = yearsOfDrivingExperience;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }
    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }
}
