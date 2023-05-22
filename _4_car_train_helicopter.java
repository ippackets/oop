import java.util.Scanner;

// Vehicle interface
interface Vehicle {
    void move();
}

// Helicopter class
class Helicopter implements Vehicle {
    @Override
    public void move() {
        System.out.println("The Helicopter flies in the air.");
    }
}

// Car class
class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("The Car drives on the road.");
    }
}

// Train class
class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("The Train runs on the track.");
    }
}

// VehicleFactory class
class VehicleFactory {
    public static Vehicle createVehicle(String vehicleType) {
        switch (vehicleType.toLowerCase()) {
            case "helicopter":
                return new Helicopter();
            case "car":
                return new Car();
            case "train":
                return new Train();
            default:
                return null;
        }
    }
}

// Main class
public class _4_car_train_helicopter {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for vehicle type
        System.out.print("Enter the type of vehicle you want to order (Helicopter/Car/Train): ");
        String vehicleType = scanner.nextLine();

        // Create the vehicle object using the factory
        Vehicle vehicle = VehicleFactory.createVehicle(vehicleType);

        // Check if the vehicle type is valid
        if (vehicle != null) {
            // Move the vehicle
            vehicle.move();
        } else {
            System.out.println("Invalid vehicle type.");
        }

        scanner.close();
    }
}

