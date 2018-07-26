package idv.workshop.homework;

public class CashCardDaoDataBaseIpml implements CashCardDao {

    ArrayList1 cashCards = new ArrayList1();

    @Override
    public void save(CashCard cashCard) {

        cashCards.add(cashCard);
        System.out.println(cashCard.getNumber());
        System.out.println(cashCard.getBalance());
        System.out.println(cashCard.getBonus());
    }

    @Override  //不知道要怎麼取出cashCard的卡號來比較
    public CashCard load(String cardNumber) {
        for(int i = 0; i < cashCards.size(); i++) {
            //if(cardNumber.equals());
        }

        return null;
    }

}
