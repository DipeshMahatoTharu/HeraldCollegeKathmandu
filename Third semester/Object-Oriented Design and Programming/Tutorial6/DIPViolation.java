/*NotificationSender directly depends on EmailService, making it harder to replace or test.
 Using an interface decouples the high-level and low-level modules, 
adhering to DIP*/
class EmailService {
    public void sendNotification(String message) {
        System.out.println("Sending email: " + message);
    }
}

class NotificationSender {
    private EmailService emailService = new EmailService();

    public void notify(String message) {
        emailService.sendNotification(message);
    }
}

public class DIPViolation {
    public static void main(String[] args) {
        NotificationSender sender = new NotificationSender();
        sender.notify("Hello, Dipesh!");
    }
}
