import java.util.Map;

import static java.util.Map.entry;

public class Blackjack {

    private Map<String, Integer> map = Map.ofEntries(entry("ace", 11), entry("two", 2)
            , entry("three", 3), entry("four", 4), entry("five", 5), entry("six", 6),
            entry("seven", 7), entry("eight", 8), entry("nine", 9), entry("ten", 10), entry("queen", 10),
            entry("king", 10), entry("jack", 10), entry("other", 0));

    public int parseCard(String card) {
        return map.get(card);
    }

    public boolean isBlackjack(String card1, String card2) {
        return parseCard(card1) + parseCard(card2) == 21;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack && dealerScore < 10)
            return "W";
        else
            return "S";
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        } else if (handScore <= 11) {
            return "H";
        } else {
            if (dealerScore >= 7) {
                return "H";
            }
            return "S";
        }
    }

    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);
        if (handScore == 22)
            return "P";
        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
