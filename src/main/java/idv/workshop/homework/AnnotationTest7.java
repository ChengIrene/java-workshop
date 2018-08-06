package idv.workshop.homework;

public @interface AnnotationTest7 {
    String[] args() default {"arg1", "arg2"};  //必要時 { } 中可放置元素值
}
