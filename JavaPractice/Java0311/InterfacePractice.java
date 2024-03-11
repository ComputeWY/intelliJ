package Java0311;

public class InterfacePractice {
    public interface Animal {
        void move();
        void eat();
        void bark();
    }

    public static class Dog implements Animal {

        @Override
        public void move() {
            System.out.println("슥슥~~");
        }

        @Override
        public void eat() {
            System.out.println("냠냠!");
        }

        @Override
        public void bark() {
            System.out.println("멍멍!");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.move();
        dog.eat();
        dog.bark();
    }
}
