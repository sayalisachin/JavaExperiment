package standard_code_practise;

    abstract class Animal{
        protected String name;

        protected Animal (String name){
            this.name=name;

        }
        public abstract void makeSound();

        public void display(){
            System.out.println("Name is"+name);
        }
    }
        //different animal info
        class Dog extends Animal{
            public Dog(String name){
                super(name);
            }
            public void makeSound(){
                System.out.println("Bark");
            }
        }
        class Cat extends Animal{
            public Cat (String name){
                super(name);
            }
            public void makeSound(){
                System.out.println("Meow");
            }
        
        }
        class Hen extends Animal{
            public Hen(String name){
                super(name);
            }
            public void makeSound(){
                System.out.println("Cluck");
            }
        }
public class Animalsound{

    public static void main(String[] args) {
        Dog dog=new Dog("Wolf");
        dog.display();
        dog.makeSound();

        Cat cat=new Cat("Whisker");
        cat.display();
        cat.makeSound();

        Hen hen=new Hen("Henrey");
        hen.display();
        hen.makeSound();
     }
        }


    
    

