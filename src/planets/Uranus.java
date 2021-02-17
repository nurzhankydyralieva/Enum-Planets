package planets;

import interfaces.GalaxySpeed;

public class Uranus extends Galaxy implements GalaxySpeed {
    public Uranus(String spaceScientists, float mass) {
        super(spaceScientists, mass);
    }

    @Override
    public void averageOrbitalSpeed() {
        System.out.println("The average orbital speed of Uranus is 6.80 km/s.");
    }
}
