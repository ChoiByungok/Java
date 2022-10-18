package ch05;

import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
class Human extends Animal{
    @Override
    public void move() {
        System.out.println("사람이 움직입니다.");
    }

    public void readBook(){

        System.out.println("사람이 책을 읽습니다.");
    }
}
class Tiger extends Animal{

    @Override
    public void move() {
        System.out.println("호랑이가 움직입니다.");
    }

    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
class Eagle extends Animal{

    @Override
    public void move() {
        System.out.println("독수리가 움직입니다.");
    }

    public void flying(){

        System.out.println("독수리가 날아다닙니다.");
    }
}
public class AnimalTest {

    public static void main(String[] args) {

        Animal human = new Human();
        Animal tiger = new Tiger();
        Animal eagle = new Eagle();

        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(human);
        animals.add(tiger);
        animals.add(eagle);

//        for(Animal animal : animals){
//            animal.move();
//        }
        testDownCasting(animals);
    }
    public static void testDownCasting(ArrayList<Animal> list){

        for(int i = 0; i < list.size(); i++){

            Animal animal = list.get(i);

            if(animal instanceof Human){

                Human human = (Human)animal;
                human.readBook();

            } else if(animal instanceof Tiger){

                Tiger tiger = (Tiger)animal;
                tiger.hunting();

            } else if (animal instanceof Eagle) {

                Eagle eagle = (Eagle)animal;
                eagle.flying();
            }
        }

    }
}
