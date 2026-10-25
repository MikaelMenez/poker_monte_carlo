package poker.montecarlo;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HandEvaluator{
    public static Optional<HandCategory> evaluate(List<Card> hand){
        if (hand.isEmpty() || hand.size()<5 ||hand.size()>7){
            return Optional.empty();
        }
        if
    }
    private boolean isRoyalFlush(List<Card> hand){
        if (isStraightFlush(hand)&&hand.stream().max(Comparator.comparing(Card::rank)).get().rank().equals(Rank.ACE)) return true;
        return false;
    }
    private boolean isStraightFlush(List<Card> hand){
        if (isStraight(hand)&&isFlush(hand)) return true;
        return false;
    }
}
