import java.util.*;
import java.util.function.Supplier;
import java.util.Scanner;
import java.util.ArrayList;


class Conversation implements Chatbot {

  // Attributes
  
  String[] responses; // will store the canned responses 
  ArrayList <String> transcript; // where the entire conversation will be stored
  Scanner input;


  /**
   * Constructor 
   *
   */

   public Conversation(ArrayList<String> text){
    this.transcript = text;
    this.input = new Scanner (System.in);
    this.responses = new String[] {"See you later!", "Bye, bye!", "Uh-huh"};
   }

  // the class and is where scanner would go 
  
  Conversation() {

  }

  /**
   * Starts and runs the conversation with the user
   * Gets the transcript running 
   */
  public void chat() {
    
    // prints welcome message and asks user how many rounds wanted 
    System.out.println("Welcome to the chatbot! How many rounds would you like to do?" + " ");
    // gets answer from user about number of rounds 
    int rounds = input.nextInt();
    
    // loop over to ask about thoughts depending on rounds given by using a counter
    String question = ("What is on your mind? ");
    transcript.add(question);
    String thought1 = input.nextLine();
    transcript.add(thought1);
    System.out.println(question);
    
    
    int counter = 0;
    while (rounds >= counter){
      String thought_1 = input.nextLine();
      transcript.add(thought_1);

    }


    // Begins conversation
    System.out.println("What is on your mind right now:" + " ");
    String thought = input.nextLine();
      }
  }

  /**
   * Prints transcript of conversation
   * Would loop over and print out each statement in the arrayList transcript
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

