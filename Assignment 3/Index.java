import java.util.Scanner;

public class Index {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    System.out.print("Enter a character (A-Z or a-z): ");
    char ch = sc.nextLine().charAt(0);

    boolean charFound = false;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ch) {
        System.out.println(str.substring(i + 1));
        charFound = true;
        break;
      }
    }
      if (!charFound) {
        System.out.println("Character not found in the string.");
      }
      sc.close();
  }
}
