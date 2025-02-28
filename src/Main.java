import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;
        boolean isSwimming = true;

        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();

      
        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : " + tigerObject.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter speed:");
                                tigerObject.setSpeed(keyboard.nextInt());
                                System.out.println("Enter sound level:");
                                tigerObject.setSoundLevel(keyboard.nextInt());
                                System.out.println("Enter number of Stripes:");
                                tigerObject.setNumberOfStripes(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.println("The characteristics of the " + tigerObject.getNameOfAnimal() + ":");
                                System.out.println("Age: " + tigerObject.getAge());
                                System.out.println("Height: " + tigerObject.getHeight());
                                System.out.println("Weight: " + tigerObject.getWeight());
                                System.out.println("Speed: " + tigerObject.getSpeed());
                                System.out.println("Sound Level: " + tigerObject.getSoundLevel());
                                System.out.println("Number of Stripes:" + tigerObject.getNumberOfStripes());
                                break;
                            case 3:
                                tigerObject.walking();
                                break;
                            case 4:
                                tigerObject.eatingFood();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;
                case 2:
                    do {
                        System.out.println("The animal which is chosen is : " + dolphinObject.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject);
                        switch (menuChoice) {
                            case 1:

                                System.out.println("Enter Swimming speed:");
                                dolphinObject.setSwimmingSpeed(keyboard.nextDouble());
                                System.out.println("Enter color:");
                                dolphinObject.setColor(keyboard.next());
                                break;
                            case 2:
                                System.out.println("The characteristics of the " + dolphinObject.getNameOfAnimal() + ":");
                                System.out.println("Age: " + dolphinObject.getAge());
                                System.out.println("Height: " + dolphinObject.getHeight());
                                System.out.println("Weight: " + dolphinObject.getWeight());
                                System.out.println("Swimming Speed: " + dolphinObject.getSwimmingSpeed());
                                System.out.println("Color: " + dolphinObject.getColor());
                                break;
                            case 3:
                                dolphinObject.swimming();
                                break;
                            case 4:
                                dolphinObject.eatingFood();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;
                case 3:
                    do {
                        System.out.println("The animal which is chosen is : " + penguinObject.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Is the penguin swimming (true/false: ");
                                penguinObject.setSwimming(keyboard.nextBoolean());
                                System.out.println("Enter the swim speed:");
                                penguinObject.setSwimSpeed(keyboard.nextDouble());
                                System.out.println("Enter the walk level:");
                                penguinObject.setWalkSpeed(keyboard.nextDouble());
                                break;
                            case 2:
                                System.out.println("The characteristics of the " + penguinObject.getNameOfAnimal() + ":");
                                System.out.println("Age: " + penguinObject.getAge());
                                System.out.println("Height: " + penguinObject.getHeight());
                                System.out.println("Weight: " + penguinObject.getWeight());
                                System.out.println("Swimming speed" + penguinObject.getSwimSpeed());
                                System.out.println("Walking speed: " + penguinObject.getWalkSpeed());
                                System.out.println("Is penguin swimming: " + penguinObject.isSwimming());
                                break;
                            case 3:
                                penguinObject.walking();
                                break;
                            case 4:
                                penguinObject.eatingFood();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;

                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            if (keyboard.hasNextInt()){
                continueOuterLoop = keyboard.nextInt();
            }else {
                System.out.println("Invalid input! Please enter 1 or 2");
                keyboard.next();
                continueOuterLoop = 2;
            }

        } while(continueOuterLoop == 1);
        /** TODO 9: create a class "Penguin" from the "Animal" class **/

        /** TODO 10: integrate the choice to pick a "penguin" in the menu system **/

    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");


        System.out.println("Enter choice of animal:");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }
}



