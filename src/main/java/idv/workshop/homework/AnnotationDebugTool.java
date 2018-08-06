package idv.workshop.homework;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationDebugTool {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<AnnotationOther> c = AnnotationOther.class;
        Method method = c.getMethod("doOther");
        if(method.isAnnotationPresent(AnnotationDebug.class)) {
            System.out.println("已設定 @Debug 標註");
            showDebugAnnotation(method);
        } else {
            System.out.println("沒有設定 @Debug 標註");
        }
        showAllAnnotations(method);
    }

    private static void showDebugAnnotation(Method method) {
        //取得 @Debug 實例
        AnnotationDebug debug = method.getAnnotation(AnnotationDebug.class);
        System.out.printf("value: %s%n", debug.value());
        System.out.printf("name : %s%n", debug.name());
    }

    private static void showAllAnnotations(Method method) {
        Annotation[] annotations = method.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType().getName());
        }
    }
}
