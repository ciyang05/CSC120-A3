import java.util.*;
import java.util.function.Supplier;


class Conversation implements Chatbot {

  // Attributes
  
  String[] responses; // will store the canned responses 
  Scanner input;

  /**
   * Constructor 
   *
   */

   public Conversation() {
    this.input = new Scanner (System.in);
    this.responses = new String[] {"See you later!", 
                                   "Bye, bye!", 
                                   "Uh-huh",
                                   "How interesting...",
                                   "Sounds good."};
   }

  // the class and is where scanner would go 
  
  //Conversation() {

  //}

  /**
   * Starts and runs the conversation with the user
   * Gets the transcript running 
   */
  public void chat() {
    
    // store welcome message in a variable, then print 
    String welcome = ("Welcome to the chatbot! How many rounds of conversation would you like to do?");
    System.out.println(welcome);

    // gets answer from user about number of rounds, initializing the transcript array
    int rounds = input.nextInt(); 
    input.nextLine(); 
    String[] transcript = new String[2 * rounds + 3];

    // convert rounds to a string
    // adds welcome message and str rounds to transcript array in respective index
    String rounds_str = String.valueOf(rounds);
    transcript[0] = (welcome);
    transcript[1] = (rounds_str);

    // asks user to give a thought, storing it in transcript array
    String question = ("What is on your mind? ");
    transcript[2] = (question);
    System.out.println(question);


    // loop over to ask about thoughts depending on rounds given by using a counter
    for (int i = 0; i <= rounds; i++) {
      String thought = input.nextLine();
      transcript[3 + i * 2] = (thought);
      // System.out.println(thought);
      String response = thought.replaceAll("\\bI\\b", "you")
                               .replaceAll("\\bam\\b","are")
                               .replaceAll("\\bam\\b", "are")
                               .replaceAll("\\bmy\\b", "your");
      transcript[4 + i * 2] = response;
      System.out.println(response);
    }



      }
  }

  /**
   * Prints transcript of conversation
   * Would loop over and print out each statement in the arrayList transcript
   */
  public void printTranscript() {
    System.out.println("\n" + "TRANSCRIPT:");
    for (String line : transcript) {
      if (line != null); {
        System.out.println(line);
      }
    }

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

