interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("Feeding the gorilla.");
            return true;
        } else {
            System.out.println("It's not time to eat.");
            return false;
        }
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla: pet at your own risk!");
    }
}

public class Task129 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        // Testing the methods
        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}


