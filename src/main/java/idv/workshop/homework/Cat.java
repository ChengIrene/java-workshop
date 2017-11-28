package idv.workshop.homework;

public class Cat {

    /*
     * Description:
     * A cat object should has following fields(attribute / instance variable)
     *
     * 1. name: String type
     * 2. age: int type
     * 3. weight: int type
     * 4. color: String type
     * 5. gender: String
     *
     * Request:
     * Please complete this class so that this class is a well-defined POJO.
     *
     * 1. I can create a cat object via the constructor method,
     *    and the constructor should accept all the above mentioned fields.
     *
     * 2. Please write unit tests to verified that all the passed-in fields
     *    are correct when I get them from getter method.
     *
     */

    private String name;
    private int age;
    private int weight;
    private String color;
    private String gender;

    public Cat(){
    }

    public Cat(String name, int age, int weight, String color, String gender){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getWeight(){
        return weight;
    }

    public String getColor(){
        return color;
    }

    public String getGender(){
        return gender;
    }
}
