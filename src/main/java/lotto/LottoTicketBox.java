package lotto;

public class LottoTicketBox {
    public static final int UNIT_PRICE = 1000;

    public static void buyTickets(int money) {
        InputValidator.validateMoney(money);
        getBuyableQuantity(money);
    }

    public static int getBuyableQuantity(int money) {
        return money / UNIT_PRICE;
    }

}
