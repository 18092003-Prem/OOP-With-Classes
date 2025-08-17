public class Task3_OOPExample {

    // ----- Base class -----
    static class Animal {
        protected String name;

        Animal(String name) {
            this.name = name;
        }

        public void makeSound() {
            System.out.println("The animal makes a sound.");
        }

        public void displayInfo() {
            System.out.println("Animal Name: " + name);
        }
    }

    // ----- Subclass: Dog -----
    static class Dog extends Animal {
        Dog(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " says: Woof Woof!");
        }
    }

    // ----- Subclass: Cat -----
    static class Cat extends Animal {
        Cat(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " says: Meow!");
        }
    }

    // ----- Main -----
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal");
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        genericAnimal.displayInfo();
        genericAnimal.makeSound();

        dog.displayInfo();
        dog.makeSound();

        cat.displayInfo();
        cat.makeSound();
    }
}
