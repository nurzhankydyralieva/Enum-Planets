package planets;

import interfaces.GalaxySpeed;

public class Jupiter extends Galaxy implements GalaxySpeed {
    public Jupiter(String spaceScientists, float mass) {
        super(spaceScientists, mass);
    }

    @Override
    public void averageOrbitalSpeed() {
        System.out.println("The average orbital speed of Jupiter is 13.07 km/s.");
    }
}
