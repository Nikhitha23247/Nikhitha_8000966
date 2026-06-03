class Animal {

    // method in parent class
    void makeSound() {

        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // overriding parent method
    void makeSound() {

        System.out.println("Bark");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        // creating animal object
        Animal animal = new Animal();

        // creating dog object
        Dog dog = new Dog();

        System.out.println("Animal sound:");
        animal.makeSound();

        System.out.println();

        System.out.println("Dog sound:");
        dog.makeSound();
    }
}