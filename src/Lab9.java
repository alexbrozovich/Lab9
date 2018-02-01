import java.util.Scanner;

public class Lab9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the car detail program!");
		System.out.println("How many cars would you like to enter?");
		int numCars = scan.nextInt();
		scan.nextLine();
		
		String make;
		String model;
		int year;
		double price;
		Car[] carList = new Car[numCars];
		
		for (int i = 0; i < numCars; i++	) {
			System.out.println("Please enter the make of the car: ");
			make = scan.nextLine();
			System.out.println("Please enter the model of the car: ");
			model = scan.nextLine();
			System.out.println("Please enter the year of the car: ");
			year = scan.nextInt();
			System.out.println("Please enter the price of the car: ");
			price = scan.nextDouble();
			scan.nextLine();
			carList[i] = new Car(make, model, year, price);
		}
		for (int i = 0; i < numCars; i++) {
			System.out.println(carList[i]);
		}
		System.out.println("Thanks for using the program!");
		scan.close();
	}

}
