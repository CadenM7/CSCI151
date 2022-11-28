package Game;

public enum CardValues {
    // Values
    C2("Clubs",2),D2("Diamonds",2),H2("Hearts",2),S2("Spades",2),
    C3("Clubs",3),D3("Diamonds",3),H3("Hearts",3),S3("Spades",3),
    C4("Clubs",4),D4("Diamonds",4),H4("Hearts",4),S4("Spades",4),
    C5("Clubs",5),D5("Diamonds",5),H5("Hearts",5),S5("Spades",5),
    C6("Clubs",6),D6("Diamonds",6),H6("Hearts",6),S6("Spades",6),
    C7("Clubs",7),D7("Diamonds",7),H7("Hearts",7),S7("Spades",7),
    C8("Clubs",8),D8("Diamonds",8),H8("Hearts",8),S8("Spades",8),
    C9("Clubs",9),D9("Diamonds",9),H9("Hearts",9),S9("Spades",9),
    C10("Clubs",10),D10("Diamonds",10),H10("Hearts",10),S10("Spades",10),
    CJ("Clubs",10),DJ("Diamonds",10),HJ("Hearts",10),SJ("Spades",10),
    CQ("Clubs",10),DQ("Diamonds",10),HQ("Hearts",10),SQ("Spades",10),
    CK("Clubs",10),DK("Diamonds",10),HK("Hearts",10),SK("Spades",10),
    CA("Clubs",11),DA("Diamonds",11),HA("Hearts",11),SA("Spades",11);


    private int value;

    private String cardType;

    public int getValue() {return value;}

    public String getCardType() {
        return cardType;
    }

    private CardValues(String cardType, int value) {
        this.cardType = cardType;
        this.value = value;
    }
}
