package JavaAssignment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class House {
    String nationality;
    String color;
    String pet;
    String drink;
    String phone;
    String device;

    public House() {
        nationality = "";
        color = "";
        pet = "";
        drink = "";
        phone = "";
        device = "";
    }

    @Override
    public String toString() {
        return "House{" +
                "nationality = '" + nationality + '\'' +
                ", color='" + color + '\'' +
                ", pet='" + pet + '\'' +
                ", drink='" + drink + '\'' +
                ", phone='" + phone + '\'' +
                ", device='" + device + '\'' +
                '}';
    }
}

public class PuzzleSolver {

    public static void main(String[] args) {
        House[] houses = new House[5];

        for (int i = 0; i < houses.length; i++) {
            houses[i] = new House();
        }

        // Apply constraints
        houses[0].nationality = "American"; // Clue 9
        houses[2].drink = "Milk"; // Clue 8
        houses[1].color = "Blue"; // Clue 14
        houses[3].color = "White"; // Clue 4
        houses[3].drink = "Coffee"; // Clue 5
        houses[4].color = "Green"; // Clue 4
        houses[0].color = "Yellow"; // Clue 7
        houses[0].phone = "Oppo"; // Clue 7
        houses[2].nationality = "Filipino"; // Clue 1
        houses[2].color = "Red"; // Clue 1
        houses[1].nationality = "Indian"; // Clue 3
        houses[1].drink = "Tea"; // Clue 3
        houses[3].nationality = "Korean"; // Clue 2
        houses[3].pet = "Dogs"; // Clue 2
        houses[4].nationality = "German"; // Clue 13
        houses[4].device = "Tablet"; // Clue 13
        houses[4].phone = "iPhone"; // Clue 12
        houses[4].drink = "Root Beer"; // Clue 12

        // Remaining clues
        houses[0].pet = "Horse"; // Clue 11
        houses[1].device = "Desktop"; // Clue 10
        houses[2].pet = "Bird"; // Clue 6
        houses[2].device = "Laptop"; // Clue 6
        houses[1].pet = "Cat"; // Clue 10
        houses[0].drink = "Water"; // Clue 15

        // Identify the house with the fish by elimination
        for (House house : houses) {
            if (house.pet.isEmpty()) {
                house.pet = "Fish";
            }
        }

        // Print solution
        printSolution(houses);

        // Find the owner of the fish
        for (House house : houses) {
            if (house.pet.equals("Fish")) {
                System.out.println("The owner of the fish is: " + house.nationality);
            }
        }
    }

    public static void printSolution(House[] houses) {
        for (int i = 0; i < houses.length; i++) {
            System.out.println("House " + (i + 1) + ": " + houses[i]);
        }
    }
}

