package idv.workshop.homework;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)  // RetentionPolicy為RUNTIME,可以在執行時期讀取標註資訊
public @interface AnnotationDebug {
    String name();
    String value();
}
