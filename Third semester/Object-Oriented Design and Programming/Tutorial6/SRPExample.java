/*The Single Responsibility Principle (SRP) is one of the foundational principles of software development and design, specifically a part of the SOLID principles. It states:

A class should have only one reason to change.

In simpler terms, this means that a class should only have one responsibility or job. By ensuring that a class focuses on a single responsibility, it becomes easier to understand, maintain, and extend.

Key Points:
Cohesion: SRP promotes high cohesion, where all the methods and attributes in a class are closely related to the class's purpose.
Low Coupling: By keeping classes narrowly focused, dependencies between classes are minimized.
Maintainability: When a class adheres to SRP, changes in one responsibility won't affect others, reducing the risk of introducing bugs.*/
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
