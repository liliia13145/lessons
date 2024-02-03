package lessons;

public class Lesson25 {
    public static void main(String[]args){
        Dog dogMother = new Dog();

        Dog child = dogMother.getDogOwner();

        child.eat();
        child.sleep();
        child.bark();


    }
}
