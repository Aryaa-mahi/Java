 class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
} 
//Bird class extends Animal class
 class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The bird chirps");
    }
}
// Cat-class extends Animal class
 class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}
public class KINGDOM {
        public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();
        animal.makeSound(); 
        bird.makeSound();  
        cat.makeSound();   
    }
}