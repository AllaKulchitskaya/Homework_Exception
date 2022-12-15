package driver;


public class DriverCategoryC {
    private final String name;
    private boolean doesHaveDriverLicense;
    private int experience;

    public DriverCategoryC(String name, boolean doesHaveDriverLicense, int experience) {
        this.name = name;
        this.doesHaveDriverLicense = doesHaveDriverLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public boolean isDoesHaveDriverLicense() {
        return doesHaveDriverLicense;
    }

    public void setDoesHaveDriverLicense(boolean doesHaveDriverLicense) {
        this.doesHaveDriverLicense = doesHaveDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
