package category;

import transport.StringUtils;

public abstract class Category {
    private final String category;

    public Category(String category) {
        if (StringUtils.isValid(category)) {
            category = "Категория не указана";
        }
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
