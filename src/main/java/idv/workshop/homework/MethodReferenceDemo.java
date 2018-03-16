package idv.workshop.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
}

public class MethodReferenceDemo {
    private  static <P, R> List<R> map(List<P> list, Function<P, R> mapper) {  //mapper就是一個函數
        List<R> mapped = new ArrayList<>();
        for(P element : list) {
            mapped.add(mapper.apply(element));
            //apply是Function這個interface上定義的function, 可以想成把element這個變數 傳給mapper這個方法(就是Person的建構子)
            //mapped.add(mapper.apply(element))這句話的意思在這個範例程式裡面就是說:
            //迭代名字清單, 為每一個名字建立一個person instance, 然後加入mapped清單裡
        }
        return mapped;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList(args);
        List<Person> person = map(names, Person::new);  //Person class的建構子就是被傳進去的參數(函數)
        person.forEach(System.out::println);
    }
}
