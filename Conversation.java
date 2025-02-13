import java.util.*;
import java.util.function.Supplier;


class Conversation implements Chatbot {

  // Attributes
  
  ArrayList <String> canned = new ArrayList <String>();
  String answer;
  int rounds;


  /**
   * Constructor 
   *
   */

   public Conversation(ArrayList<String> canned, String a, int roun){
    this.canned = canned;
    this.canned.add("Uh-huh");
    this.canned.add("See you later!");
    this.canned.add("Bye, bye!");
    this.answer = a;
    this.rounds = roun;
   }

  Conversation() {
    
  }

  /**
   * Starts and runs the conversation with the user
   */
  public void chat() {

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
