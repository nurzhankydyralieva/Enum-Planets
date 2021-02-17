package planets;

import interfaces.GalaxySpeed;

public class Venus extends Galaxy implements GalaxySpeed {
    public Venus(String spaceScientists, float mass) {
        super(spaceScientists, mass);
    }

    @Override
    public void averageOrbitalSpeed() {
        System.out.println("The average orbital speed of Venus is 35.02 km/s.");
    }
}
