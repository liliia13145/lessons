package lessons;
public class ClassesAndObjects {
    public static void main(String [] args) {
        Person person1 = new Person();
        person1.setName("Какое-то имя");
        person1.setAge(12);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: "+ person1.getAge());
        person1.getAge();
        person1.speak();
    }
}
class Person {
   private String name;
   private int age;
   public void setName(String username) {
       if (username.isEmpty()) {
           System.out.println("Ты ввел пустое имя");
       } else {
           name = username;
       }
   }
   public String getName(){
       return name;
   }
   public void setAge(int userAge) {
           if(userAge<0){
               System.out.println("Возраст должен быть положительным");
           } else {
               age = userAge;
           }
   }
   public int getAge(){
       return age;

}

    void speak() {
        for(int i=0;i<3;i++){
        System.out.println("Меня зовут " + name + "," + " Мне " + age + " лет");}
    }

}