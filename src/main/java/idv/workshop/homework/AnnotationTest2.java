package idv.workshop.homework;

public @interface AnnotationTest2 {  //這表示標註將會有個timeout屬性可以設定int值
    int timeout();

    // @AnnotationTest2(timeout = 10)
    // public void testDoSome2() { ... }
}
