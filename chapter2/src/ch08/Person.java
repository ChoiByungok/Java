package ch08;

public class Person {

    String name;
    int age;

    public Person(){

        this("no name",1);
    }

    public Person(String name, int age){

        this.name = name;
        this.age = age;
    }

    public void showInfo(){

        System.out.println(name);
        System.out.println(age);
    }

    public Person getPerson(){

        return this;
    }

    public static void main(String[] args) {

        Person person = new Person("kim",25);
        person.showInfo();
        System.out.println(person);

        Person person2 = person.getPerson();
        person2.showInfo();
        System.out.println(person2);

        System.out.println(person.equals(person2));

    }
}
