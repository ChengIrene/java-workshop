package idv.workshop.homework;

public @interface AnnotationIgnore {  //在定義標註屬性時,如果屬性名稱為 value ,則可以省略屬性名稱,直接指定值
    String value();

    // 可以使用 @AnnotationIgnore(value = "message") 指定
    // 也可以使用 @AnnotationIgnore("message") 指定
}
