interface Bird {
    void fly();
    void swim();
}

class Penguin implements Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}

class ISPViolation {
    public static void main(String[] args) {
        Bird penguin = new Penguin(); // Unnecessary method implementation
        penguin.swim();
    }
}
