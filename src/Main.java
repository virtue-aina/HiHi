import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Message newMessage = new Message();
       newMessage.sendMessage();
       newMessage.replyMessage();
       boolean flag = true;
       Scanner readScanner = new Scanner(System.in);
       String read = readScanner.nextLine();

       while(flag){
           newMessage.sendMessage();
           newMessage.replyMessage();
           if(read.equalsIgnoreCase(
                   "Goodbye")||
                   read.equalsIgnoreCase("Take care")||
                   read.equalsIgnoreCase("Bye")||
                   read.equalsIgnoreCase("Cheers")||
                   read.equalsIgnoreCase("Later")
            ){
               flag = false;
           }else if(read.equals("no")){
//               System.out.println("Message not read");
//               flag = false;
           }else{
//               System.out.println("Invalid input");
           }
       }


    }
}