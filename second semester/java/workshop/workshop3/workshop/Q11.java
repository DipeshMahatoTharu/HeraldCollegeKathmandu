class Q11 {
    double width;
    double height;
    double depth;

    // Constructor for a cube (takes length only)
    Q11(double length) {
        width = length;
        height = length;
        depth = length;
    }

    // Constructor for a cuboid (takes length, breadth, and height)
    Q11(double length, double breadth, double height) {
        width = length;
        height = breadth;
        depth = height;
    }

    // No-argument constructor (sets length = 10, breadth = 8, height = 12)
    Q11() {
        width = 10;
        height = 8;
        depth = 12;
    }

    // Method to calculate and print the volume
    void getVolume() {
        double volume = width * height * depth;
        System.out.println("Volume of the box: " + volume);
    }

    public static void main(String[] args) {
        // For a cube (length = 5)
        Q11 cube = new Q11(5);
        cube.getVolume();

        // For a cuboid (length = 6, breadth = 4, height = 3)
        Q11 cuboid = new Q11(6, 4, 3);
        cuboid.getVolume();

        // For no parameters
        Q11 defaultBox = new Q11();
        defaultBox.getVolume();
    }
}
