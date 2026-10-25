package poker.montecarlo;
public enum Rank{
        TWO((byte)2, "2"),
        THREE((byte)3, "3"),
        FOUR((byte)4, "4"),
        FIVE((byte)5, "5"),
        SIX((byte)6, "6"),
        SEVEN((byte)7, "7"),
        EIGHT((byte)8, "8"),
        NINE((byte)9, "9"),
        TEN((byte)10, "10"),
        JACK((byte)11, "J"),
        QUEEN((byte)12, "Q"),
        KING((byte)13, "K"),
        ACE((byte)14, "A");

        private final String symbol;
        private final byte value;

        Rank(byte value, String symbol){
            this.value=value;
            this.symbol=symbol;
        }

        public String symbol(){
            return this.symbol;
        }

        public byte value(){
            return this.value;
        }

}
