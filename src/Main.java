import enums.Planets;
import planets.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);
        Galaxy[] planets = new Galaxy[8];
        Galaxy mercury = new Galaxy(0.383f, "Minimal", 58.65f, 0.24f, false, Planets.MERCURY);
        Galaxy venus = new Galaxy(0.949f, "CO2, N2", -243.02f, 0.62f, false, Planets.VENUS);
        Galaxy earth = new Galaxy(1.000f, "H2, O2, Ar", 1.00f, 1.00f, false, Planets.EARTH);
        Galaxy jupiter = new Galaxy(11.209f, "H2, He", 0.41f, 11.86f, true, Planets.JUPITER);
        Galaxy saturn = new Galaxy(9.449f, "H2, He", 0.44f, 29.45f, true, Planets.SATURN);
        Galaxy uranus = new Galaxy(4.007f, "H2, He, CH4", -0.72f, 84.02f, true, Planets.URANUS);
        Galaxy neptune = new Galaxy(3.883f, "H2, He, CH4", 0.67f, 164.79f, true, Planets.NEPTUNE);
        Galaxy mars = new Galaxy(0.532f, "CO2, N2, Ar", 1.03f, 1.88f, false, Planets.MARS);
        Mercury mercury2 = new Mercury("Tycho Brahe", 0.06f);
        Venus venus2 = new Venus("Avicenna", 0.81f);
        Earth earth2 = new Earth("Ptolemy", 1.00f);
        Jupiter jupiter2 = new Jupiter("Christiaan Huygens", 317.83f);
        Saturn saturn2 = new Saturn("Avempace", 95.16f);
        Uranus uranus2 = new Uranus("Nergal", 14.54f);
        Neptune neptune2 = new Neptune("Marc Kuchner", 17.15f);
        Mars mars2 = new Mars("Alan Stern", 0.11f);
        mercury.averageOrbitalSpeed();
        venus2.averageOrbitalSpeed();
        earth2.averageOrbitalSpeed();
        jupiter2.averageOrbitalSpeed();
        saturn2.averageOrbitalSpeed();
        uranus2.averageOrbitalSpeed();
        neptune2.averageOrbitalSpeed();
        mars2.averageOrbitalSpeed();
        System.out.println();
        planets[0] = mercury;
        planets[1] = venus;
        planets[2] = earth;
        planets[3] = jupiter;
        planets[4] = saturn;
        planets[5] = uranus;
        planets[6] = neptune;
        planets[7] = mars;
        for (Galaxy allPlanet : planets) {
            System.out.println(allPlanet);
        }
        System.out.print("Enter number from 1 to 8: ");
        int nameOfPlanet = scannerIn.nextInt();
        switch (nameOfPlanet) {
            case 1:
                System.out.println("Space Scientist " + mercury2.getSpaceScientists() + ", mass af planet Mercury is " + mercury2.getMass());
                break;
            case 2:
                System.out.println("Space Scientist " + venus2.getSpaceScientists() + ", mass of planet Venus is " + venus2.getMass());
                break;
            case 3:
                System.out.println("Space Scientist " + earth2.getSpaceScientists() + ", mass of planet Earth is " + earth2.getMass());
                break;
            case 4:
                System.out.println("Space Scientist " + jupiter2.getSpaceScientists() + ", mass of planet Jupiter is " + jupiter2.getMass());
                break;
            case 5:
                System.out.println("Space Scientist " + uranus2.getSpaceScientists() + ", mass of planet Uranus is " + uranus2.getMass());
                break;
            case 6:
                System.out.println("Space Scientist " + saturn2.getSpaceScientists() + ", mass of planet Saturn is " + saturn2.getMass());
                break;
            case 7:
                System.out.println("Space Scientist " + neptune2.getSpaceScientists() + ", mass of planet Neptune is " + neptune2.getMass());
                break;
            case 8:
                System.out.println("Space Scientist " + mars2.getSpaceScientists() + " mass of planet Mars is " + mars2.getMass());
                break;
            default:
                System.out.println("You entered invalid number: " + nameOfPlanet);
        }
    }
}