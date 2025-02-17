import java.util.*;
import java.util.function.Supplier;
import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;


class Conversation implements Chatbot {

  // Attributes
  
  String[] responses; // will store the canned responses 
  Scanner input;
  ArrayList <String> transcript; 

  /**
   * Constructor 
   *
   */

   public Conversation() {
    this.input = new Scanner (System.in);
    this.responses = new String[] {"See you later!", 
                                   "Bye, bye!", 
                                   "Goodbye!",
                                   "Adios!"
                                     };
    this.transcript = new ArrayList<String>();
   }

  // the class and is where scanner would go 
  
  // Conversation() {

  // }

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

    // convert rounds to a string
    // adds welcome message and str rounds to transcript array in respective index
    String rounds_str = String.valueOf(rounds);
    transcript.add(welcome);
    transcript.add(rounds_str);

    // asks user to give a thought, storing it in transcript array
    String question = ("What is on your mind? ");
    transcript.add(question);
    System.out.println(question);


    // loop over to ask about thoughts depending on rounds given by using a counter
    for (int i = 0; i < rounds; i++) {
      String thought = input.nextLine();
      transcript.add(thought);
      // System.out.println(thought);
      String response = thought.replaceAll("\\bI\\b", "you")
                               .replaceAll("\\bam\\b","are")
                               .replaceAll("\\bam\\b", "are")
                               .replaceAll("\\bmy\\b", "your");
      transcript.add(response);
      System.out.println("Oh you are thinking about" + " " + response);
    }

    Random random = new Random();
    int randomIndex = random.nextInt(responses.length);

    String randomResponse = responses[randomIndex];
    transcript.add(randomResponse);
    System.out.println(randomResponse);



  
  }

  /**
   * Prints transcript of conversation
   * Would loop over and print out each statement in the arrayList transcript
   */

  public void printTranscript() {
    System.out.println("\n" + "TRANSCRIPT:");
    for (String s : transcript) {
      if (s != null) {
        System.out.println(s);
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
}

