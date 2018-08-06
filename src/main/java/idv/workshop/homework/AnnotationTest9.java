package idv.workshop.homework;

import java.lang.annotation.Documented;

//在製作JavaDoc文件時,預設並不會將標註資料加於文件中,如果想要將標註資料加入文件,可以使用java.lang.annotation.Documented
//如果在文件中使用到@AnnotationTest9,則產生JavaDoc後,文件中就會包括@AnnotationTest9的資訊

@Documented
public @interface AnnotationTest9 {

}
