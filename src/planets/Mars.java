package planets;

import interfaces.GalaxySpeed;

public class Mars extends Galaxy implements GalaxySpeed {
    public Mars(String spaceScientists, float mass) {
        super(spaceScientists, mass);
    }

    @Override
    public void averageOrbitalSpeed() {
        System.out.println("The average orbital speed of Mars is 24.007 km/s.");
    }
}
