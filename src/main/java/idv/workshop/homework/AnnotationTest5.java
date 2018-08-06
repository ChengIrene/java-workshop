package idv.workshop.homework;

public @interface AnnotationTest5 {
    Class expected() default Default.class;
    class Default {}

    // Class設定的屬性比較特別,default之後不能接上null,會發生編譯錯誤,必須自訂一個類別作為預設值
}
