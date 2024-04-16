import java.util.Scanner;

public class PetHealthTracker {
    
    // Attributes
    private String petName;
    private int age;
    private double weight;
    private int stepsTaken;
    private int mealsConsumed;
    
    // Constructor
    public PetHealthTracker(String petName, int age, double weight) {
        this.petName = petName;
        this.age = age;
        this.weight = weight;
        this.stepsTaken = 0;
        this.mealsConsumed = 0;
    }
    
    // Methods to track pet's health and fitness
    public void takeSteps(int steps) {
        stepsTaken += steps;
        System.out.println(petName + " has taken " + steps + " steps.");
    }
    
    public void feedPet() {
        mealsConsumed++;
        System.out.println(petName + " has consumed a meal.");
    }
    
    public void displayPetInfo() {
        System.out.println("Pet Name: " + petName);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Steps Taken: " + stepsTaken);
        System.out.println("Meals Consumed: " + mealsConsumed);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input pet details
        System.out.println("Enter pet's name:");
        String name = scanner.nextLine();
        System.out.println("Enter pet's age:");
        int age = scanner.nextInt();
        System.out.println("Enter pet's weight in kg:");
        double weight = scanner.nextDouble();
        
        // Create PetHealthTracker object
        PetHealthTracker pet = new PetHealthTracker(name, age, weight);
        
        // Simulate actions
        pet.takeSteps(1000);
        pet.feedPet();
        
        // Display pet's information
        System.out.println("\nPet's Information:");
        pet.displayPetInfo();
        
        scanner.close();
    }
}
