/*Definition:
The Dependency Inversion Principle states:

High-level modules should not depend on low-level modules. Both should depend on abstractions.
Abstractions should not depend on details. Details should depend on abstractions.
Advantages:
Reduces coupling between modules.
Makes code more flexible and easier to refactor.
Improves testability by enabling dependency injection.*/
interface NotificationService {
    void sendNotification(String message);
}

class EmailService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email: " + message);
    }
}

class NotificationSender {
    private NotificationService notificationService;

    public NotificationSender(NotificationService service) {
        this.notificationService = service;
    }

    public void notify(String message) {
        notificationService.sendNotification(message);
    }
}

public class DIPExample {
    public static void main(String[] args) {
        NotificationService emailService = new EmailService();
        NotificationSender sender = new NotificationSender(emailService);
        sender.notify("Hello, Dipesh!");
    }
}
