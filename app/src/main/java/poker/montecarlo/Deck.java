package poker.montecarlo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Deck {
    private List<Card> deck;
    Deck(){
        this.deck=new ArrayList<Card>(52);
        newDeck();
    }
    public void newDeck(){
        this.deck.clear();
        for (var suit:Suit.values()){
            for(var rank: Rank.values()){
                deck.add( new Card(rank,suit));
            }
        }
    }
    public void suffle(){
        Collections.shuffle(deck);
    }
    public String toString(){
        StringBuilder all=new StringBuilder();
        for (var card:deck){
            all.append(card.toString()+" ");
        }
        return all.toString();
    }
    public List<Card> getCards(){
        return Collections.unmodifiableList(deck);
    }
    public String toEmojis(){
        StringBuilder all=new StringBuilder();
        for (var card:deck){
            all.append(card.toEmoji()+" ");
        }
        return all.toString();
    }
    public Optional<Card> drawOne(){
        if (deck.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(this.deck.removeLast());
    }
}
