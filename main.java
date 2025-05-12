import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car myFirstCar = new Car();

        myFirstCar.make = "Toyota";
        myFirstCar.model = "Corolla";
        myFirstCar.color = "Black";
        myFirstCar.year = 2019;

        myFirstCar.getCarDetails();

        //
        Car[] cars = new Car[5];

        Scanner keyBoard = new Scanner(System.in);

        for (int index = 0; index < 5; index++) {
            cars[index] = new Car();

            System.out.println("Enter details for car " + (index + 1));

            System.out.println("Make: ");
            cars[index].make = keyBoard.nextLine();

            System.out.println("Model: ");
            cars[index].model = keyBoard.nextLine();

            System.out.println("Color:");
            cars[index].color =keyBoard.nextLine();

            System.out.println("Year: ");
            cars[index].year = keyBoard.nextInt();

            keyBoard.nextLine();
        }
        System.out.println("Your Car Collection");
        for (int index = 0; index <5; index++) {
            String carDetails = cars[index].getCarDetails();
            System.out.println(carDetails);
        }
    }
}
