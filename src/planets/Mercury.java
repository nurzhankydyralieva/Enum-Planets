package planets;


import interfaces.GalaxySpeed;

public class Mercury extends Galaxy implements GalaxySpeed {

    public Mercury(String spaceScientists, float mass) {
        super(spaceScientists, mass);
    }

    @Override
    public void averageOrbitalSpeed() {
        super.averageOrbitalSpeed();
        System.out.println("The average orbital speed of Mercury is 47.362 km/s.");
    }
}
