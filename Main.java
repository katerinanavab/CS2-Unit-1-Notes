// Java programs are defined in a CLASS
// the class name (Main) must match the FILE name (Main.java)
// curly brackets define the start & end of a section
public class Main {

   // The main method is what runs when you press RUN
   public static void main(String []args) {
      // Below is a print STATEMENT (instruction/command)
      // Java statements end in a semicolon
      System.out.println("Hello World");
      
      // print will output on the same line
      // println will enter to the next line after printing
      System.out.print("apcs");
      System.out.print("is fun");

      // DECLARE VARIABLES
      int students;
      boolean isRaining; // camelCase for multi-word names
      double cash;

      // ASSIGN VALUES to the variables
      students = 8;
      cash = 5.00;
      isRaining = false; // false is "off", or 0

      // INSTANTIATE or INITIALIZE (declare + assign in one line)
      int numClasses = 9;
      double gpa = 3.4;
      boolean isSnowy = false;

      // ARITHMETIC OPERATORS
      System.out.println(2 + 3);
      System.out.println(2 - 3);
      System.out.println(2 * 3);
      System.out.println(2 / 3); // returns 0

      // IMPORTANT: if you divide two INTEGERS, you will get an int result
      // this is called "integer division" and it TRUNCATES (chops off)
      // the decimal part after dividing

      System.out.println(2.0 / 3); // returns 0.6666666

      // == is to test while = is to assign
      System.out.println(2 == 3); // return false (boolean)

      // != is to test if NOT equal
      System.out.println(2 != 3); // return true 

      // % operator returns the REMAINDER after division
      System.out.println(16 % 2); // returns 0 (even number)
      System.out.println(17 % 2); // returns 1 (odd number)

      System.out.println(17 % 5); // returns 2

      // COMPOUND ASSIGNMENT OPERATORS (shortcuts)
      int score = 0;
      
      // long way to increase value of score by 1
      score = score + 1;
      System.out.println(score);

      // shortcut addition assignment
      score += 5;
      System.out.println(score); // score is now 6

      // increment operator (only works for changes by 1)
      score++; // score is now 7
      score--; // score is back to 6

      // there are shortcuts for multiplication and division too
      score /= 3; // returns 2, same operation as score = score/3;
      score *= 732; // returns 1464, same op. as score = score*732; 



   }
}
