package planets;

public class Galaxy {
    private float equatorialDiameter;
    private String atmosphere;
    private float rotationPeriodDays;
    private float orbitalPeriodYears;
    private boolean rings;
    private enums.Planets planets;
    private String spaceScientists;
    private float mass;

    public Galaxy(float equatorialDiameter, String atmosphere, float rotationPeriodDays, float orbitalPeriodYears, boolean rings, enums.Planets planets) {
        this.equatorialDiameter = equatorialDiameter;
        this.atmosphere = atmosphere;
        this.rotationPeriodDays = rotationPeriodDays;
        this.orbitalPeriodYears = orbitalPeriodYears;
        this.rings = rings;
        this.planets = planets;
    }

    public float getEquatorialDiameter() {
        return equatorialDiameter;
    }

    public void setEquatorialDiameter(float equatorialDiameter) {
        this.equatorialDiameter = equatorialDiameter;
    }

    public String getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(String atmosphere) {
        this.atmosphere = atmosphere;
    }

    public float getRotationPeriodDays() {
        return rotationPeriodDays;
    }

    public void setRotationPeriodDays(float rotationPeriodDays) {
        this.rotationPeriodDays = rotationPeriodDays;
    }

    public float getOrbitalPeriodYears() {
        return orbitalPeriodYears;
    }

    public void setOrbitalPeriodYears(float orbitalPeriodYears) {
        this.orbitalPeriodYears = orbitalPeriodYears;
    }

    public boolean isRings() {
        return rings;
    }

    public void setRings(boolean rings) {
        this.rings = rings;
    }

    public enums.Planets getPlanets() {
        return planets;
    }

    public void setPlanets(enums.Planets planets) {
        this.planets = planets;
    }

    public Galaxy(String spaceScientists, float mass) {
        this.spaceScientists = spaceScientists;
        this.mass = mass;
    }

    public String getSpaceScientists() {
        return spaceScientists;
    }

    public void setSpaceScientists(String spaceScientists) {
        this.spaceScientists = spaceScientists;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }
    public void averageOrbitalSpeed() {
        System.out.println("The average orbital speed of planets");
    }
    @Override
    public String toString() {
        return planets + " " +
                "\nequatorialDiameter: " + equatorialDiameter +
                ", atmosphere: '" + atmosphere + '\'' +
                ", rotationPeriodDays: " + rotationPeriodDays +
                ", orbitalPeriodYears: " + orbitalPeriodYears +
                ", rings: " + rings + ".";
    }
}
