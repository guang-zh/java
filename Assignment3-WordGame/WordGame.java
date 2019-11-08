public class WordGame {
  public static void main(String[] args) {
    playGame(); //Call the method to run the game
  }

  public static void playGame() { //get inputs from both players then loop until reaching 20 points
    java.util.Scanner reader = new java.util.Scanner(System.in);
    int player1 = 0;
    int player2 = 0;
    while (player1 < 20 && player2 < 20) { //loop only when both players are under 20 points
      String player1String = getRandomString(); // call method to get available characters in hands
      System.out.println("Payer 1, it is your turn with the letters: " + player1String);
      System.out.println("Player 1's word: ");
      String player1Word = reader.next(); // get input word from player 1
      if (confirmAnswer(player1String, player1Word)) { //accumulate player 1 points if the word is valid
        player1 = player1 + player1Word.length(); // accumulate player 1 points
        System.out.println(player1Word + " is valid! Player 1 has " + player1 + " points.");
      } else {
        System.out.println(player1Word + " is INVALID! Player 1 still has " + player1 + " points.");
      }

      String player2String = getRandomString(); // call method to get available characters in hands
      System.out.println("Payer 2, it is your turn with the letters: " + player2String);
      System.out.println("Player 2's word: ");
      String player2Word = reader.next(); // get input word from player 2
      if (confirmAnswer(player2String, player2Word)) { // accumulate player 2 points if the word is valid
        player2 = player2 + player2Word.length(); // accumulate player 2 points
        System.out.println(player2Word + " is valid! Player 2 has " + player2 + " points.");
      } else {
        System.out.println(player2Word + " is INVALID! Player 2 still has " + player2 + " points.");
      }
    }
    if (player1 >= 20 && player2 < 20) { // only player 1 has reached 20 points
        System.out.println("Player 1 wins with " + player1 + " points.");
      } else if (player2 >= 20 && player1 < 20) { // only player 2 has reached 20 points
        System.out.println("Player 2 wins with " + player2 + " points.");
      } else if (player1 >= 20 && player2 >= 20) { // both players reached 20 points in same turn
        System.out.println("Player 1 and Player 2 Tied!");
      }
  }

  public static String getRandomString() { // use random generator to create available characters in String for hands
    final int handsLength=10; // create constant for number of characters in hands String
    String word = ""; // initialize the hands String
    for (int i = 0; i < handsLength; i++) { // loop until determined length of characters generated in hands String
      java.util.Random randGen = new java.util.Random();
      int num = randGen.nextInt(26);
      char c = (char) ('A' + num); // generate characters based on the generated random numbers
      word = word + c; // add each newly generated characters to the String
    }
    return word;
  }

  public static int countLetterInString(String words, char c) { // count number of times the character is in String
    int stringLength = words.length(); // number of characters in the given String for # times in looping
    int numLetters = 0; // initialize number of times for the occurance of character
    for (int i = 0; i < stringLength; i++) { // loop through all characters in the words
      if (c == words.charAt(i)) { // accumulate occurences if the character exists in each position of given String
        numLetters = numLetters + 1;
      }
    }
    return numLetters; // return number of occurences of the given character in the given String
  }

  public static boolean confirmAnswer(String playerhands, String playerwords) { // check if player string is valid
    boolean check = true; // initialize return value
    int numHands = 0; // initialize number of occurences for that character in the Hands String
    int numWords = 0; // initialize number of occurences for that character in the Player String
    for (int i = 0; i < playerwords.length(); i++) { // loop through all the characters in the Player Input Words
      char c = playerwords.charAt(i); // check each position of Player Input Words
      numWords = countLetterInString(playerwords, c);
      numHands = countLetterInString(playerhands, c);
      if (numWords > numHands) { // return false if characters in hands less than characters in player input words
        return false;
      } else {
        check = true; // return true if characters in hands more than characters in player input words
      }
    }
    return check; // return true or false for the validity of comparing player and hand strings
  }
}