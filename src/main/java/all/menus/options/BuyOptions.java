package all.menus.options;

public enum BuyOptions {

    MENU("1. Popcorn Medium $3\n" +
            "2. Popcorn Huge $5\n" +
            "3. Coke $3\n" +
            "4. Bucegi 2.5L $2\n");

    private final String text;

    BuyOptions(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
