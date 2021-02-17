package planets;

import interfaces.GalaxySpeed;

public class Earth extends Galaxy implements GalaxySpeed {
    public Earth(String spaceScientists, float mass) {
        super(spaceScientists, mass);
    }

    @Override
    public void averageOrbitalSpeed() {
        System.out.println("The average orbital speed of Earth is 29.78 km/s.");
    }
}
