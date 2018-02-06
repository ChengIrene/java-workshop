package idv.workshop.homework;

public interface CashCardDao {

    /*
    * CashCardDao ... An interface, which define some methods
    *
    * CashCardDaoDataBaseImpl ... A class, which define the concrete implementation of methods on CashCarDao interface
    * CashCardDaoFileImpl ... A class, .........
    *
    * */

    public void save(CashCard cashCard);
    public CashCard load(String number);
}
