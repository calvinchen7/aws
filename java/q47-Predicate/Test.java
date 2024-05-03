import java.util.*;
import java.util.function.*;

class Person
{
    String name;
    int age;
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    int getAge()
    {
        return this.age;
    }

}

public class Test {
    public static void checkAge(List<Person> personList, Predicate<Person> pearsonPredicate){
        for(Person p : personList){
        if(pearsonPredicate.test(p)){
            System.out.println(p.name + " ");
        }
    }
    }
    public static void main(String[] args){
        List<Person> personList = Arrays.asList(new Person("Hank", 45),
            new Person("Charlie", 40),
            new Person("Smith", 38)
        );
        checkAge(personList, p -> p.getAge() > 40);
    }
}