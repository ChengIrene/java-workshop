package idv.workshop.homework;

public @interface AnnotationTest4 {  //也可以成員設定預設值,使用default關鍵字即可
    int timeout() default 0;  //預設屬性值為0
    String message() default "";  //預設屬性值為空字串
}
