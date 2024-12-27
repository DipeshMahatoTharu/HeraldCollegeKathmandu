class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Sparrow extends Bird {
}

class LSPExample {
    public static void main(String[] args) {
        Bird bird = new Sparrow(); 
        bird.fly();
    }
}
