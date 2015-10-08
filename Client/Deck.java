package blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    // ArrayList to hold the actual deck
    private ArrayList<Card> deck = new ArrayList<>();
    
    // Immutable sorted deck for reference
    private final Card[] refDeck = {
        new Card("\u2665", "2"),
        new Card("\u2665", "3"),
        new Card("\u2665", "4"),
        new Card("\u2665", "5"),
        new Card("\u2665", "6"),
        new Card("\u2665", "7"),
        new Card("\u2665", "8"),
        new Card("\u2665", "9"),
        new Card("\u2665", "10"),
        new Card("\u2665", "J"),
        new Card("\u2665", "Q"),
        new Card("\u2665", "K"),
        new Card("\u2665", "A"),
        new Card("\u2666", "2"),
        new Card("\u2666", "3"),
        new Card("\u2666", "4"),
        new Card("\u2666", "5"),
        new Card("\u2666", "6"),
        new Card("\u2666", "7"),
        new Card("\u2666", "8"),
        new Card("\u2666", "9"),
        new Card("\u2666", "10"),
        new Card("\u2666", "J"),
        new Card("\u2666", "Q"),
        new Card("\u2666", "K"),
        new Card("\u2666", "A"),
        new Card("\u2660", "2"),
        new Card("\u2660", "3"),
        new Card("\u2660", "4"),
        new Card("\u2660", "5"),
        new Card("\u2660", "6"),
        new Card("\u2660", "7"),
        new Card("\u2660", "8"),
        new Card("\u2660", "9"),
        new Card("\u2660", "10"),
        new Card("\u2660", "J"),
        new Card("\u2660", "Q"),
        new Card("\u2660", "K"),
        new Card("\u2660", "A"),
        new Card("\u2663", "2"),
        new Card("\u2663", "3"),
        new Card("\u2663", "4"),
        new Card("\u2663", "5"),
        new Card("\u2663", "6"),
        new Card("\u2663", "7"),
        new Card("\u2663", "8"),
        new Card("\u2663", "9"),
        new Card("\u2663", "10"),
        new Card("\u2663", "J"),
        new Card("\u2663", "Q"),
        new Card("\u2663", "K"),
        new Card("\u2663", "A")
    };
    
    // Deck constructor copies cards from refDeck to actual deck
    public Deck() {
        for (int i = 0; i < 52; i ++) {
            deck.add(i, refDeck[i]);
        }
    }
    
    // Necessary since deck is private
    public int getSize() {
        return deck.size();
    }
    
    // Removes 1 card from top of deck and returns it to player
    public Card drawCard() {
        Card newCard = deck.get(getSize() - 1);
        deck.remove(getSize() - 1);
        return newCard;
    }
    
    // Removes 5 card from top of deck and returns them as array to player
    public Card[] getHand() {
        Card[] newHand = new Card[5];
        for (int i = 0; i < 5; i++) {
            newHand[i] = drawCard();
        }
        return newHand;
    }
    
    // Shuffles cards in deck using Collections.shuffle
    public void shuffleDeck() {
        Collections.shuffle(this.deck);
    }
    
    // Determines if the deck needs to be shuffled before next hand is drawn
    public boolean needsShuffle() {
        if (getSize() < 5) return true;
        else return false;
    }
}
