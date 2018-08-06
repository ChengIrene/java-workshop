package idv.workshop.homework;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target( {ElementType.METHOD} )  //將@AnnotationTest限定只能用於方法
public @interface AnnotationTest8 {  //若嘗試方法以外地方加上@AnnotationTest8就會發生編譯錯誤
}
