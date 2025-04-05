import java.util.Scanner;

public class Runner {
    //prints all the information
    public static void main(String[] args) {
        Pet2 myPet = new Pet2();

        //first run
        System.out.println("Pet information: \n" + "Type: " + myPet.getType());
        System.out.println("Name: " + myPet.getName());
        System.out.println("Sound: " + myPet.getSound());
        System.out.println("Age: " + myPet.getAge());

        //second run
        myPet.setType("Cat");
        myPet.setName("Silver");
        myPet.setSound("Meow");
        myPet.setAge(5);
        System.out.println("\nPet information: \n" + "Type: " + myPet.getType());
        System.out.println("Name: " + myPet.getName());
        System.out.println("Sound: " + myPet.getSound());
        System.out.println("Age: " + myPet.getAge());
        System.out.println();

        //inputs
        Scanner typeInputScanner = new Scanner(System.in);
        System.out.println("Enter animal type: ");
        String typeInput = typeInputScanner.nextLine();
        Scanner nameInputScanner = new Scanner(System.in);
        System.out.println("Enter animal name: ");
        String nameInput = nameInputScanner.nextLine();
        Scanner ageInputScanner = new Scanner(System.in);
        System.out.println("Enter animal age: ");
        int ageInput = Integer.parseInt(ageInputScanner.nextLine());

        String dog = "Dog";
        String cat = "Cat";

        //third run
        myPet.setType(typeInput);
        myPet.setName(nameInput);
        myPet.setSound("Noise");
        myPet.setAge(ageInput);
        System.out.println("\nPet information: \n" + "Type: " + myPet.getType());
        System.out.println("Name: " + myPet.getName());
        if (typeInput.equals(dog)) {
            myPet.setSound("Woof");
        }
        if (typeInput.equals(cat)) {
            myPet.setSound("Meow");
        }
        System.out.println("Sound: " + myPet.getSound());
        System.out.println("Age: " + myPet.getAge());
    }
}
