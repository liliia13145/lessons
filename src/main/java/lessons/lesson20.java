
package lessons;

public class lesson20 {
    public static void main(String[] args) {
        Humana h1 = new Humana ("Bob", 40);
        Humana h2 = new Humana("Billy", 30);
        Humana.description = "Nice";
        h1.getAllFields();
        h2.getAllFields();
        Humana.description = "Bad";
        h1.getAllFields();
        h2.getAllFields();

        Humana.printNumberOfPeople();



    }
}
class Humana{
    private String name;
    private int age;
    public static String description;
    public static int countPeople;
    public Humana(String name, int age){

        this.name = name;
        this.age = age;
        countPeople++;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void getAllFields(){
        System.out.println(name + ","+ age + ","+ description);
    }
    public static void printNumberOfPeople(){
        System.out.println("Number of people is " + countPeople);
    }

}
