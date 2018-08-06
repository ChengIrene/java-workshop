package idv.workshop.homework;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


//JDK8的ElementType多了兩個列舉成員 TYPE_PARAMETER TYPE_USE
//他們是用來限定哪個型態可以進行標註
//舉例來說想要對泛型的型態參數(TYPE_PARAMETER)進行標註: public class MailBox<@Email T> { ... }
//那麼,在定義@Email時,必須在@Target 設定 ElementType.TYPE_PARAMETER,表示這個標註可用來標註型態參數

//ElementType.TYPE_USE 可用於標住在各式型態,因此也可以將以下改為ElementType.TYPE_USE
//一個標註如果被設定為 ElementType.TYPE_USE ,只要是型態名稱都可以進行標註

@Target(ElementType.TYPE_PARAMETER)
public @interface AnnotationEmail {
}
