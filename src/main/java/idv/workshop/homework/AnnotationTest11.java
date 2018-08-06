package idv.workshop.homework;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
public @interface AnnotationTest11 {

    //以下標註範例都是可以的

    // List<@AnnotationTest11 Comparable> list1 = new ArrayList<>();
    // List<? extends Comparable> list2 = new ArrayList<@Annotation Comparable>();
    // @AnnotationTest11 String text;
    // text = (@AnnotationTest11 String) new Object();
    // java.util. @AnnotationTest11 Scanner console;
    // console = new java. util. @AnnotationTest11 Scanner(System.in);

    // 這幾個範例都僅對@AnnotationTest11 右邊的型態名稱進行標註
}
