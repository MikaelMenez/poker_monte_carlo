package poker.montecarlo;
public enum HandCategory {
    HIGH_CARD(1,"Highest card"),
    ONE_PAIR(2,"One pair"),
    TWO_PAIR(3,"Two pair"),
    THREE_OF_A_KIND(4,"Three of a kind"),
    STRAIGHT(5,"Straight"),
    FLUSH(6,"Flush"),
    FULL_HOUSE(7,"Full house"),
    FOUR_OF_A_KIND(8,"Four of a kind"),
    STRAIGHT_FLUSH(9,"Straight flush"),
    ROYAL_FLUSH(10,"Royal flush");
    private final int value;
    private final String name;
    HandCategory(int value,String name){
        this.name=name;
        this.value=value;
    }

    public String getName() {
        return name;
    }
    public int getValue() {
        return value;
    }
}
