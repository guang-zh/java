//Assignment 4: Hangman Game
//Student name: Guang
//Student number: 1942372

public class HangmanGame{
  public static void main(String[] args){
    runGame();
  }
  //Converts String into Array of Characters
  //Input the word needs to be guessed
  //Return array of characters for the word
  public static char[] toCharArray(String word){
   char[] wordChars = new char[word.length()];
   for (int i=0; i<word.length(); i++){
    wordChars[i] = word.charAt(i); 
   }
   return wordChars;
  }
  //Convert given character to Uppercase
  //Input one character
  //Return uppercase of the character
  public static char toUpperCase(char c){
    if (c>='a' && c<='z'){
     c = (char) (c - ('a' - 'A'));
     return c;
    }
    else {
      return c;
    }
  }
  
  //Check if given letter exists in the array of characters
  //Input array of characters and one character
  //Return boolean value for if character exists in the array
  public static boolean isLetterInWord(char[] word, char c){
   boolean result = false;
   for (int i=0; i<word.length; i++){
     if (c == word[i]){
      result = true; 
     }
   }
   return result;
  }
  
  //Print out the characters guessed
  //Input array of boolean values
  //Output the letters with true values in the array
  public static void printGuesses(boolean[] guesses){
   for (int i=0; i<guesses.length; i++){
    if (guesses[i] == true){
     char guessesLetters = (char)('A' + i);
     System.out.print(guessesLetters+",");
    }
   }
   System.out.println();
  }
  
  //Print out the word with guessed characters
  //Input characters array, booleans array
  //Output word with characters already guesses and underscores
  public static void printWord(char[] word, boolean[] guesses)
  {
    for (int i=0; i<word.length; i++)
    {
     int j = (int)(word[i]- 'A');
     if (guesses[j]==true) {
      System.out.print(word[i]+" ");
     }
     else {
      System.out.print("_ ");
     }
    }
    System.out.println();
  }
  
  //Check if the Hangman Game is over by checking conditions
  //Input characters array, booleans array, integer value
  //Return boolean value after checking misses and characters in array
  public static boolean isGameOver(char[] word, boolean[] guesses, int misses)
  {
    boolean check = false;
    if (misses>=6) 
    {
      return true;
    }
    else if (misses<6) 
    {
      for (int i=0; i<word.length; i++)
      {
        int j = (int)(word[i]- 'A');
        if (guesses[j]==false) {
          return false;
        }
        else {
          check = true;
        }
      }
    }
    return check;
  }
  
  //Run the Hangman Game
  //Create boolean array for keeping track of 26 letters guessed or not
  //Ask user to input the word to be guessed
  //Check if the game is not over, continuesly ask users input characters
  //Print out characters array for the word with guessed characters
  //Print out guesses characters
  //Print out Hangman figure depending on number of misses
  //End with printing out "Win" or "Lose" upon conditions
  public static void runGame()
  {
   boolean[] guesses = new boolean[26];
   java.util.Scanner reader = new java.util.Scanner(System.in);
   System.out.println("Input the word to guess: ");
   String wordToGuess = reader.next();
   char[] word = toCharArray(wordToGuess);
   for (int i=0; i<word.length; i++) {
    word[i]=toUpperCase(word[i]);
   }
   
   int misses = 0;
   while (isGameOver(word, guesses, misses)==false) 
    {
    System.out.println("Input a Letter for guessing: ");
    String letter = reader.next();
    char c = toUpperCase(letter.charAt(0));
    int indexc = (int)(c-'A');
    if (isLetterInWord(word, c)==false) 
    {
     misses += 1;
     guesses[indexc]= true;
    }
    else 
    {
     guesses[indexc]=true;
    }
  printWord(word, guesses);
  printGuesses(guesses);
  printHangman(misses);
     }
   if (misses>=6) {
    System.out.println("You lose!");
   }
   else {
    System.out.println("You win!");
   }
  }
  //printHanging takes as input the number of misses the player has made,
  //and prints out the hangman corresponding to the number of misses they have made
  //printHanging does not return any values
  public static void printHangman(int misses){
    //Initially, no part of the hangman should be drawn, leave blank spaces for each
    String head = " ", body = " ", larm = " ", rarm = " ", lleg = " ", rleg = " ";
    switch (misses){
      default: head = "0"; //After making 6 or more misses, we add on the head - the player has lost
      case 5: rleg = "\\"; //After making 5 or more misses, we draw the right leg
      case 4: lleg = "/";  //After making 4 or more misses, we draw the left leg
      case 3: rarm = "\\"; //After making 3 or more misses, we draw the right arm
      case 2: larm = "/";  //After making 2 or more misses, we draw the left arm
      case 1: body = "|";  //After making 1 or more misses, we draw the left arm
      case 0: ;            //With 0 misses, nothing should be drawn
    }    
    //Print statement which draws the hangman
    System.out.println("___________\n" +
                       "|         |\n" +
                       "|         " + head +"\n" +
                       "|        " + larm + body + rarm + "\n" +
                       "|       " + larm + " " + body + " " + rarm + "\n" +
                       "|        " + lleg + " " + rleg + "\n" +
                       "|       " + lleg + "   " + rleg + "\n" +
                       "|__________\n");
  } 
}