package lotto;

public class LottoTicketBox {
    public static void buyTickets(int money) {
        if (money < 1000) {
            throw new IllegalArgumentException("입력된 금액이 1000원 미만일 수 없습니다.");
        }

        if (money % 1000 != 0) {
            throw new IllegalArgumentException("입력된 금액이 1000원 단위가 아닙니다.");
        }
    }
}
