package ch04;

public class Person {

    private double height;
    private double weight;
    private String sex;
    private String name;
    private int age;

    public Person(double height, double weight, String sex, String name, int age){
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.name = name;
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String showPersonInfo(){

        return "키가" + getHeight() + "이고 몸무게가" + getWeight() + " 킬로인 " + getSex() + "이 있습니다. 이름은" + getName() + "이고 나이는 " + getAge() + "세 입니다." ;
    }
}
