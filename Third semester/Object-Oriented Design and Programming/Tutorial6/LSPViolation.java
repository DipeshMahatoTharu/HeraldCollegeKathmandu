class BirdWithException {
    public void fly() {
        System.out.println("Flying");
    }
}

class Ostrich extends BirdWithException {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly");
    }
}

class LSPViolation {
    public static void main(String[] args) {
        BirdWithException bird = new Ostrich(); // Causes exception
        bird.fly();
    }
}
