package planets;

import interfaces.GalaxySpeed;

public class Neptune extends Galaxy implements GalaxySpeed {
    public Neptune(String spaceScientists, float mass) {
        super(spaceScientists, mass);
    }

    @Override
    public void averageOrbitalSpeed() {
        System.out.println("The average orbital speed of Neptune is 5.43 km/s.");
    }
}
