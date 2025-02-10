package carlos.springboot;



public class Alien {

    private int age ;
    private Laptop laptop;

    public Alien(){
        System.out.println("Object created");
    }

    public Alien(int age) {
        this.age = age;
    }

    public void code(){
        System.out.println("I'm coding");
        //laptop.compile();
    }

    public int getAge() {
        return age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
