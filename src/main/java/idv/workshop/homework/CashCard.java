package idv.workshop.homework;

public class CashCard {
    private String number;
    private int balance;
    private int bonus;

    CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;  //残高
        this.bonus = bonus;
    }

    //封裝儲值流程
    public void store(int money) {  //儲存時呼叫的方法
        if(money > 0) {
            this.balance += money;
            System.out.println(money);
            if(money >= 1000) {
                this.bonus++;
            }
        } else {
            System.out.println("マイナス金額チャージするつもり?　やめなさいよ～本気でチャージしよう～");
        }
    }

    public void charge(int money) {  //扣款時呼叫的方法
        if (money > 0) {
            if (money <= this.balance) {
                this.balance -= money;
            } else {
                System.out.println("もう足りないよ～");
            }
        } else {
            System.out.println("マイナス金額を引き落とす?　それはチャージじゃないか?");
        }
    }

    public int exchange(int bonus) {  //兌換紅利點數時呼叫的方法
        if(bonus > 0) {
            this.bonus -= bonus;
        }
        return this.bonus;
    }

    //提供取值方法
    public String getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public int getBonus() {
        return bonus;
    }
}
