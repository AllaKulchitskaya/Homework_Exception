package driver;

import category.Category;
import transport.StringUtils;

public class Driver <C extends Category> {
    private final String name;
    private boolean doesHaveDriverLicense;
    private int experience;
    private C category;

    public Driver(String name, boolean doesHaveDriverLicense, int experience, C category) {
        if (StringUtils.isValid(name)) {
            System.out.println("Имя не указано");
        }
        this.name = name;
        this.doesHaveDriverLicense = doesHaveDriverLicense;
        setExperience(experience);
        setCategory(category);
    }

    public String getName() {
        return name;
    }

    public boolean DoesHaveDriverLicense() {
        return doesHaveDriverLicense;
    }

    public void setDoesHaveDriverLicense(boolean doesHaveDriverLicense) {
        this.doesHaveDriverLicense = doesHaveDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience <= 0) {
            experience = 2;
        }
        this.experience = experience;
    }

    public C getCategory() {
        return category;
    }

    public void setCategory(C category) {
        if (category == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав");
        }
        this.category = category;
    }
}
