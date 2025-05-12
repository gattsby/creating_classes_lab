public class Car {
    //the base blueprint that all of the specific instances are based on
    String make;
    String model;
    String color;
    int year;

    public String getCarDetails() {
        return "Make: " + make + "\nModel: " + model + "\nColor: " + color + "\nYear: " + year;

}
}
