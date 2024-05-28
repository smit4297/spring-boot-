package assignment;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Person{
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
public class Predicate12 {

    static Predicate<Person> agePredicate = (Person p) -> {
        return p.getAge() > 30;
    };

    static Predicate<Person> cityPredicate = (Person p) -> {
        return p.getCity().equals("banglore");
    };

    static Predicate<Person> ageAndCityPredicate = agePredicate.and(cityPredicate);
    static Predicate<Person> ageOrCityPredicate = agePredicate.or(cityPredicate);


    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(new Person("smit", 24, "mumbai"),new Person("smit2", 34, "banglore"),new Person("smit3", 44, "mumbai"),new Person("smit4", 20, "mumbai"));
        filterBasedOnPredicate(Predicate12.ageAndCityPredicate,personList);

    }

    public static void filterBasedOnPredicate(Predicate<Person> predicate, List<Person> personList){
        personList.stream().filter(predicate).forEach(System.out::println);
    }
}
