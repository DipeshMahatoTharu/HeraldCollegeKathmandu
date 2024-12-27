class UserWithPersistence {
    private String name;
    private String email;

    public UserWithPersistence(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void save() {
        System.out.println("Saving user: " + this.name);
    }
}

class SRPViolation {
    public static void main(String[] args) {
        UserWithPersistence user = new UserWithPersistence("Dipesh", "dipesh@example.com");
        user.save();
    }
}
