import java.util.ArrayList;
import java.util.Scanner;


public class Driver {
	private static ArrayList<Dog> dogList = new ArrayList<>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<>();
    private static String input;

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        while (true) {
            displayMenu();
            input = scnr.next();

            switch (input) {
                case "1":
                    intakeNewDog(scnr);
                    break;
                case "2":
                    intakeNewMonkey(scnr);
                    break;
                case "3":
                    reserveAnimal(scnr);
                    break;
                case "4":
                    printAnimals(dogList);
                    break;
                case "5":
                    printAnimals(monkeyList);
                    break;
                case "6":
                    printNonReservedAnimals(dogList, monkeyList);
                    break;
                case "q":
                    scnr.close();
                    return;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    // removed initialization classes

    public static void intakeNewDog(Scanner scanner) {
        while (true) {
            System.out.println("What is the dog's name?");
            String name = scanner.next();

            // Check for the dog in the array list
            boolean isDuplicate = false;
            for (Dog dog : dogList) {
                if (dog.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis dog is already in our system\n\n");
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                // Create a new Dog object
                Dog newDog = new Dog(name, null, null, null, null, null, null, null, false, null);

                // Set the breed using the setBreed method
                System.out.println("Enter the dog's breed");
                newDog.setBreed(scanner.next());

                // Continue to set other properties as needed
                System.out.println("Enter the dog's gender");
                newDog.setGender(scanner.next());

                System.out.println("Enter the dog's age");
                newDog.setAge(scanner.next());

                System.out.println("Enter the dog's weight");
                newDog.setWeight(scanner.next());

                System.out.println("Enter the dog's acquisition date");
                newDog.setAcquisitionDate(scanner.next());

                System.out.println("Enter the dog's acquisition location");
                newDog.setAcquisitionLocation(scanner.next());

                System.out.println("Enter the dog's training status");
                newDog.setTrainingStatus(scanner.next());

                boolean reserve = false;

                // Verify that input equals a boolean value
                while (true) {
                    System.out.println("Enter the dog's reserve status (true/false)");
                    if (scanner.hasNextBoolean()) {
                        reserve = scanner.nextBoolean();
                        break; // Break out of the loop when a valid boolean is entered
                    } else {
                        System.out.println("Incorrect input. Please enter 'true' or 'false'.");
                        scanner.next(); // Clear the invalid input from the scanner
                    }
                }

                newDog.setReserved(reserve);

                System.out.println("Enter the dog's service country");
                newDog.setInServiceCountry(scanner.next());

                // Add the newDog object to the list
                dogList.add(newDog);

                System.out.println("The dog has been added to the list");
            }

            System.out.println("Do you want to add another dog? (yes/no)");
            String another = scanner.next();
            if (!another.equalsIgnoreCase("yes")) {
                break;
            }
        }

        // After adding the dog(s), return to the main menu
        displayMenu();
    }


    //check for monkey in the array list
    public static void intakeNewMonkey(Scanner scanner) {
        while (true) {
            System.out.println("What is the monkey's name?");
            String name = scanner.next();

            // Check for the monkey in the array list
            boolean isDuplicate = false;
            for (Monkey monkey : monkeyList) {
                if (monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\nThis monkey is already in our system\n");
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                // Create a new Monkey object
                Monkey newMonkey = new Monkey(name, null, null, null, null, null, null, null, false, null, null, null, null);

                // Set the species
                System.out.println("Enter the monkey's species: Capuchin, Guenon, Macaque, Marmoset, Squirrel Monkey, or Tamarin");
                newMonkey.setSpecies(scanner.next());

                // Continue to set other properties as needed
                System.out.println("Enter the monkey's gender");
                newMonkey.setGender(scanner.next());

                System.out.println("Enter the monkey's age");
                newMonkey.setAge(scanner.next());

                System.out.println("Enter the monkey's weight");
                newMonkey.setWeight(scanner.next());

                System.out.println("Enter the monkey's acquisition date");
                newMonkey.setAcquisitionDate(scanner.next());

                System.out.println("Enter the monkey's acquisition location");
                newMonkey.setAcquisitionLocation(scanner.next());

                System.out.println("Enter the monkey's training status");
                newMonkey.setTrainingStatus(scanner.next());

                boolean reserve = false;

                // Verify that input equals a boolean value
                while (true) {
                    System.out.println("Enter the monkey's reserve status (true/false)");
                    if (scanner.hasNextBoolean()) {
                        reserve = scanner.nextBoolean();
                        break; // Break out of the loop when a valid boolean is entered
                    } else {
                        System.out.println("Incorrect input. Please enter 'true' or 'false'.");
                        scanner.next(); // Clear the invalid input from the scanner
                    }
                }

                newMonkey.setReserved(reserve);

                System.out.println("Enter the monkey's service country");
                newMonkey.setInServiceCountry(scanner.next());

                System.out.println("Enter the monkey's Tail length");
                newMonkey.setTailLength(scanner.next());

                System.out.println("Enter the monkey's Body Length");
                newMonkey.setBodyLength(scanner.next());

                System.out.println("Enter the monkey's Height");
                newMonkey.setHeight(scanner.next());

                // Add the newMonkey object to the list
                monkeyList.add(newMonkey);

                System.out.println("The monkey has been added to the list");
            }

            System.out.println("Do you want to add another monkey? (yes/no)");
            String another = scanner.next();
            if (!another.equalsIgnoreCase("yes")) {
                break;
            }
        }

        // After adding the monkey(s), return to the main menu
        displayMenu();
    }

    public static void reserveAnimal(Scanner scanner) {
        while (true) {
            System.out.println("Which type animal are you looking for, Monkey or Dog? Press 'q' to exit");
            String type = scanner.next();

            if (type.equalsIgnoreCase("Monkey")) {
                System.out.println("What is the monkey's service country?");
                String service = scanner.next();

                boolean foundAvailableMonkey = false;

                for (Monkey monkey : monkeyList) {
                    if (monkey.getInServiceCountry().equalsIgnoreCase(service) && !monkey.getReserved()) {
                        System.out.println(monkey.getName() + " is available in this location.");
                        monkey.setReserved(true);
                        foundAvailableMonkey = true;
                        break;
                    }
                }

                if (!foundAvailableMonkey) {
                    System.out.println("There were no service monkeys for that country.");
                }
                break; // Exit the loop after reserving or not finding a monkey
            } else if (type.equalsIgnoreCase("Dog")) {
                System.out.println("What is the dog's service country?");
                String service = scanner.next();

                boolean foundAvailableDog = false;

                for (Dog dog : dogList) {
                    if (dog.getInServiceCountry().equalsIgnoreCase(service) && !dog.getReserved()) {
                        System.out.println(dog.getName() + " is available in this location.");
                        dog.setReserved(true);
                        foundAvailableDog = true;
                        break;
                    }
                }

                if (!foundAvailableDog) {
                    System.out.println("There were no service dogs for that country.");
                }
                break; // Exit the loop after reserving or not finding a dog
            } else if (type.equalsIgnoreCase("q")) {
                System.out.println("Exiting animal reservation.");
                break; // Exit the loop if the user chooses to exit
            } else {
                System.out.println("Invalid input. Please enter Monkey or Dog, or press 'q' to exit.");
            }
        
        // to end loop that repeats
       if (type.equalsIgnoreCase("q")) {
    	   System.exit(0);
       }
        }
    }

    
    public static void printAnimals(ArrayList<? extends RescueAnimal> animalList) {
    	// check if there are any animals in array list
        if (animalList.isEmpty()) {
            System.out.println("No animals in the list.");
            return;
        }
    // generic rescue animal + dog
        for (RescueAnimal animal : animalList) {
            System.out.println("Name: " + animal.getName());
            System.out.println("Gender: " + animal.getGender());
            System.out.println("Age: " + animal.getAge());
            System.out.println("Weight: " + animal.getWeight());
            System.out.println("Acquisition Date: " + animal.getAcquisitionDate());
            System.out.println("Acquisition Location: " + animal.getAcquisitionLocation());
            System.out.println("Training Status: " + animal.getTrainingStatus());
            System.out.println("Reserved: " + (animal.getReserved() ? "Yes" : "No"));
            System.out.println("Service Country: " + animal.getInServiceCountry());
    
            // Check the type of animal and print additional details if it's a monkey
            if (animal instanceof Monkey) {
                Monkey monkey = (Monkey) animal;
                System.out.println("Species: " + monkey.getSpecies());
                System.out.println("Tail Length: " + monkey.getTailLength());
                System.out.println("Body Length: " + monkey.getBodyLength());
                System.out.println("Height: " + monkey.getHeight());
            }

        }
    }
    public static void printNonReservedAnimals(ArrayList<? extends RescueAnimal> dogList, ArrayList<? extends RescueAnimal> monkeyList) {
        boolean foundNonReserved = false;

        for (RescueAnimal animal : dogList) {
            if (!animal.getReserved()) {
                if (!foundNonReserved) {
                    foundNonReserved = true;
                    System.out.println("Non-Reserved Dogs:");
                }

                System.out.println("Name: " + animal.getName());
                System.out.println("Gender: " + animal.getGender());
                System.out.println("Age: " + animal.getAge());
                System.out.println("Weight: " + animal.getWeight());
                System.out.println("Acquisition Date: " + animal.getAcquisitionDate());
                System.out.println("Acquisition Location: " + animal.getAcquisitionLocation());
                System.out.println("Training Status: " + animal.getTrainingStatus());
                System.out.println("Reserved: " + (animal.getReserved() ? "Yes" : "No"));
                System.out.println("Service Country: " + animal.getInServiceCountry());

                // Check the type of animal and print additional details if it's a monkey
                if (animal instanceof Monkey) {
                    Monkey monkey = (Monkey) animal;
                    System.out.println("Species: " + monkey.getSpecies());
                    System.out.println("Tail Length: " + monkey.getTailLength());
                    System.out.println("Body Length: " + monkey.getBodyLength());
                    System.out.println("Height: " + monkey.getHeight());
                }
            }
        }

        for (RescueAnimal animal : monkeyList) {
            if (!animal.getReserved()) {
                if (!foundNonReserved) {
                    foundNonReserved = true;
                    System.out.println("Non-Reserved Monkeys:");
                }

                System.out.println("Name: " + animal.getName());
                System.out.println("Gender: " + animal.getGender());
                System.out.println("Age: " + animal.getAge());
                System.out.println("Weight: " + animal.getWeight());
                System.out.println("Acquisition Date: " + animal.getAcquisitionDate());
                System.out.println("Acquisition Location: " + animal.getAcquisitionLocation());
                System.out.println("Training Status: " + animal.getTrainingStatus());
                System.out.println("Reserved: " + (animal.getReserved() ? "Yes" : "No"));
                System.out.println("Service Country: " + animal.getInServiceCountry());

                // Check the type of animal and print additional details if it's a monkey
                if (animal instanceof Monkey) {
                    Monkey monkey = (Monkey) animal;
                    System.out.println("Species: " + monkey.getSpecies());
                    System.out.println("Tail Length: " + monkey.getTailLength());
                    System.out.println("Body Length: " + monkey.getBodyLength());
                    System.out.println("Height: " + monkey.getHeight());
                }
            }
        }

        if (!foundNonReserved) {
            System.out.println("No non-reserved animals in the list.");
        }
    }
}