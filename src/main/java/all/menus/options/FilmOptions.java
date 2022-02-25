package all.menus.options;

public enum FilmOptions {
    MENU(
            "1. Venom II \n" +
            "2. Deadpool III \n" +
            "3. Data structures in Java \n" +
            "4. Algorithms in Java  II (Restanta version) \n");

    private final String text;

    FilmOptions(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
