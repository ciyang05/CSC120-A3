import java.util.*;
import java.util.function.Supplier;
import java.util.Scanner;


class Conversation implements Chatbot {

  // Attributes
  
  ArrayList <String> canned = new ArrayList <String>();
  int answer;
  String rounds;


  /**
   * Constructor 
   *
   */

   public Conversation(ArrayList<String> canned, int a){
    this.canned = canned;
    canned.add("Uh-huh");
    canned.add("See you later!");
    canned.add("Bye, bye!");
    this.answer = a;
   }

  Conversation() {
    
  }

  /**
   * Starts and runs the conversation with the user
   */
  public void chat() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many rounds would you like to do?");
    rounds = scanner.nextLine();
    }
  }

  /**
   * Prints transcript of conversation
   */
  public void printTranscript() {

  }

  /**
   * Gives appropriate response (mirrored or canned) to user input
   * @param inputString the users last line of input
   * @return mirrored or canned response to user input  
   */
  public String respond(String inputString) {
    String returnString = ""; 
    return returnString; 
  }

  public static void main(String[] arguments) {

    Conversation myConversation = new Conversation();
    myConversation.chat();
    myConversation.printTranscript();

  }
}
