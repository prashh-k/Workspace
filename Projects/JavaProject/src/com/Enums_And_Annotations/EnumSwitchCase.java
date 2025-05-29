package com.Enums_And_Annotations;

// Enum class for seasons
enum Season {
    SPRING, SUMMER, FALL, WINTER;
}

// Main class to demonstrate Switch Case
public class EnumSwitchCase {
    public static void main(String[] args) {
        // Example usage of Enum with switch case
        Season currentSeason = Season.WINTER;

        // Print messages based on the season
        switch (currentSeason) {
            case SPRING:
                System.out.println("Spring is blooming with flowers!");
                break;
            case SUMMER:
                System.out.println("Summer is hot and sunny!");
                break;
            case FALL:
                System.out.println("Fall brings beautiful autumn leaves!");
                break;
            case WINTER:
                System.out.println("Winter calls for warm clothes!");
                break;
            default:
                System.out.println("Unknown season.");
        }
    }
}
