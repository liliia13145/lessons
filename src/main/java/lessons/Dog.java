package lessons;

public class Dog extends Animal{
    static Dog dogOwner = new Dog();
    public void eat(){
        System.out.println("Dog is eating");
    }
    public void bark(){
        System.out.println("I am barking");
    }

    public Dog getDogOwner() {
        return dogOwner;
    }

    public void setDogOwner(Dog dogOwner) {
        this.dogOwner = dogOwner;
    }
}
