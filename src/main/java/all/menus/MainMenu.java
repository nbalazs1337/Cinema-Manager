package all.menus;

public enum MainMenu {


    MENU("1. Available seats\n" +
            "2. Rezervation\n" +
            "3. Buy Options\n" +
            "4. Film Options\n" +
            "5. Managing Statistics\n" +
            "6. Exit\n");


    private final String text;

    MainMenu(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

