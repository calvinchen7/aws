public class Person {

    String name;
    int age = 25;
    
    Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Test1");
        Person person2 = new Person("Test2", 25);
    }
}
