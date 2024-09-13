import java.time.LocalTime;
import java.util.Scanner;

public class Message {
    private Long id;
    private String MessageId;
    private String message;
    private User sender;
    private String receiverId;
    boolean isRead;
    private LocalTime timestamp;

    public Message(String messageId, String message, User sender, String receiverId, boolean isRead, LocalTime timestamp) {
        MessageId = messageId;
        this.message = message;
        this.sender = sender;
        this.receiverId = receiverId;
        this.isRead = isRead;
        this.timestamp = timestamp;
    }
    public void sendMessage() {
        // Send a message
        System.out.println("Type your message: ");
        Scanner sendScanner = new Scanner(System.in);
        this.message = sendScanner.nextLine();
        this.timestamp = LocalTime.now();
        System.out.println("Message sent at: " + message + " at " + timestamp);
    }

    public void replyMessage() {
        // Reply to a message
        System.out.println("Type your reply: ");
        Scanner replyScanner = new Scanner(System.in);
        String reply = replyScanner.nextLine();
        LocalTime replyTimestamp = LocalTime.now();
        System.out.println("Reply sent at: " + reply + " at " + replyTimestamp);
    }

    public boolean isRead() {

        return isRead;
    }


}
