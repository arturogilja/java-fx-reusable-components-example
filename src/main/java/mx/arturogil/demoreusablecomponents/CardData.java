package mx.arturogil.demoreusablecomponents;

public class CardData {
    public String getCardText() {
        return cardText;
    }

    public void setCardText(String cardText) {
        this.cardText = cardText;
    }

    public CardData(String cardText, String cardButtonText) {
        this.cardText = cardText;
        this.cardButtonText = cardButtonText;
    }

    private String cardText;

    public String getCardButtonText() {
        return cardButtonText;
    }

    public void setCardButtonText(String cardButtonText) {
        this.cardButtonText = cardButtonText;
    }

    private String cardButtonText;
}
