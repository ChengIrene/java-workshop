package idv.workshop.homework;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Filters.class)  //使用@Repeatable 時告訴編譯器,使用@Filters來作為收集重複標註資訊的內容,而每個@Fileter儲存各自指定的字串值
public @interface AnnotationFilter2 {
    String[] value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Filters {
    AnnotationFilter2[] value();
}