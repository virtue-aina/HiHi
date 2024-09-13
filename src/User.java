import java.util.List;

public class User {
    private String userName;
    private Long userId;
    private  String email;
    private List<Chats> chats;
    public String getUserName() {
        return userName;
    }

    public User(String userName, Long userId, String email, List<Chats> chats) {
        this.userName = userName;
        this.userId = userId;
        this.email = email;
        this.chats = chats;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Long getUserId() {
        return userId;
    }
    public String getEmail() {
        return email;
    }
    public List<Chats> getChats() {
        return chats;
    }
    public void setChats(List<Chats> chats) {
        this.chats = chats;
    }
    public Chats createChat() {
        // Create a new chat
        return null;
    }public Chats deleteChat() {
        // Delete a chat
         return null;
     }
    public Chats sendMessage() {
        // Send a message
        return null;
    }

}
