class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class UserRepository {
    public void save(User user) {
        System.out.println("Saving user: " + user.getName());
    }
}

class SRPExample {
    public static void main(String[] args) {
        User user = new User("Dipesh", "dipesh@example.com");
        UserRepository userRepository = new UserRepository();
        userRepository.save(user);
    }
}
