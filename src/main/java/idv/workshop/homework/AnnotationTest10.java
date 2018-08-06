package idv.workshop.homework;

import java.lang.annotation.Inherited;

//在定義標註型態並使用於程式碼時,預設父類別設定的標註,不會被繼承至子類別
//可以在定義標註時設定 java.lang.annotation.Inherited 標註,就可以讓標註被子類別繼承

@Inherited
public @interface AnnotationTest10 {
}
