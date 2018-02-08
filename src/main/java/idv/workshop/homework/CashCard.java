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

        assert money >= 0 : "マイナス金額チャージするつもり?　やめなさいよ～本気でチャージしよう～";

            this.balance += money;
            System.out.println(money);
            if(money >= 1000) {
                this.bonus++;
            }

        //if(money <= 0) {
            //throw new IllegalArgumentException("必須大於0");
        //}
    }

    public void charge(int money) throws InsufficientException {  //扣款時呼叫的方法

        assert money >= 0 : "マイナス金額を引き落とす?　それはチャージじゃないか?";

        checkBalance(money);
        this.balance -= money;

        assert this.balance >= 0 : "残高はマイナスですか？それは不可能です。";

        //if(money <= 0) {
            //throw new IllegalArgumentException("不應該小於0");
        //}
    }

    private void checkBalance(int money) throws InsufficientException {
        if(money > this.balance) {
            throw new InsufficientException("もう足りないよ～残高：" + this.balance, this.balance);
        }
    }


    public int exchange(int bonus) throws InsufficientException {  //兌換紅利點數時呼叫的方法

        checkBonus(bonus);

        if(bonus > 0) {
            this.bonus -= bonus;
        }
        return this.bonus;
    }

    private void checkBonus(int bonus) throws InsufficientException {
        if(this.bonus < bonus) {
            throw new InsufficientException("ポイント足りないよ～残高：" + this.bonus, this.bonus);
        }
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


    //例外拋出,我是不是應該另外開一個class
    public class InsufficientException extends Exception {
        private int remain;
        public InsufficientException(String message, int remain) {
            super(message);
            this.remain = remain;
        }
        public int getRemain() {  //這個方法我沒用到,大概是寫錯哪邊了OTZ!!!
            return remain;
        }
    }
}
