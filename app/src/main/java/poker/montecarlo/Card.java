package poker.montecarlo;
public record Card(Rank rank,Suit suit){
    @Override
    public String toString(){
        return rank.symbol()+suit.symbol();
    }
    public String toEmoji(){
        int base=switch(suit){
            case SPADES -> 0x1F0A0;
                        case HEARTS -> 0x1F0B0;
                        case DIAMONDS -> 0x1F0C0;
                        case CLUBS -> 0x1F0D0;
        };
        int offset= switch(rank){
            case ACE -> 1;
                        case TWO -> 2;
                        case THREE -> 3;
                        case FOUR -> 4;
                        case FIVE -> 5;
                        case SIX -> 6;
                        case SEVEN -> 7;
                        case EIGHT -> 8;
                        case NINE -> 9;
                        case TEN -> 10;
                        case JACK -> 11;
                        case QUEEN -> 13;
                        case KING -> 14;
        };
        return Character.toString(base+offset);
    }
}
