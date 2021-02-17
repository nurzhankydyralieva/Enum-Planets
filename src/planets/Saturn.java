package planets;

import interfaces.GalaxySpeed;

public class Saturn extends Galaxy implements GalaxySpeed {
    public Saturn(String spaceScientists, float mass) {
        super(spaceScientists, mass);
    }

    @Override
    public void averageOrbitalSpeed() {
        System.out.println("The average orbital speed of Saturn is 9.68 km/s.");
    }

}
