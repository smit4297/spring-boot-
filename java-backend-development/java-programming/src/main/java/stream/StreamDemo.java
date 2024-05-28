package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

class Person{
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }
}

public class StreamDemo {



    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        Integer[] arr1 = {1,2,3,4,5,6,7,8,9,10,11};

        Predicate<Integer> isEven = (Integer i) -> {
            return i % 2 == 0;
        };

        Predicate<String> isNull = String::isEmpty;

        Arrays.asList(arr).stream().filter(isEven).forEach(System.out::println);

        String[] strList = {"smit", "fdhgsdgfhHJSFHJKSDHFJK"};

        Function<String, String> toUpperCase = String::toUpperCase;

        List<String> changedList = Arrays.stream(strList).map(toUpperCase).toList();

        System.out.println(changedList);


        List<Person> personList = Arrays.asList(new Person("smit", "patel"), new Person("sujit", "kairamkonda"));
        System.out.println(personList.stream().map( p -> p.getFullName()).toList());
        System.out.println(compareArr(arr, arr1));
    }

    public static boolean compareArr(Integer[] arr1, Integer[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(!Objects.equals(arr1[i], arr2[i]))
                return false;
        }
        return true;
    }
}
