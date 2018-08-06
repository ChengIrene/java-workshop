package idv.workshop.homework;

public class AnnotationSecurityTool {
    public static void main(String[] args) {
        AnnotationFilter2[] filters = AnnotationSecurityFilter.class.getAnnotationsByType(AnnotationFilter2.class);
        for (AnnotationFilter2 filter : filters) {
            System.out.println(filter.value());
        }

        System.out.println(AnnotationSecurityFilter.class.getAnnotation(AnnotationFilter2.class));
        //被標註為@Repeatable的@Filter, getAnnotation() 回傳值會是 null
    }
}
