package idv.workshop.homework;

public @interface AnnotationTest3 {  //標註屬性也可以用陣列形式指定
    String[] args();

    // @AnnotationTest3(args = {"arg1", "arg2"}
    // public void testDoSome3() { ... }
}
