package idv.workshop.homework;

public @interface AnnotationTestClass {
    Class[] value();

    // 可以使用 @AnnotationTestClass(Value = {Some.class, Other.class}) 指定
    // 也可以使用 @AnnotationCTestClass({Some.class, Other.class}) 指定
}
