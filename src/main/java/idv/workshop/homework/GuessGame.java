package idv.workshop.homework;

//取得使用者輸入、顯示結果的環境未定,但還是可以先把部分實作
public abstract class GuessGame {  //這個類別不完整,print()和nextInt()都是抽象方法
    public void go() {
        int number = (int) (Math.random() * 50);
        int guess;
        do {
          print("輸入數字: ");
            guess = nextInt();
        } while (guess != number);
        println("猜中了YAAAAAA");
    }

    public void println(String text) {
        print(text + "\n");
    }

    public abstract void print(String text);
    public abstract int nextInt();
}
