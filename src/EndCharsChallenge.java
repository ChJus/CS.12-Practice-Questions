public class EndCharsChallenge {
  public static void main(String[] args) {
    flipEndChars("Cat, dog, and mouse.");
    flipEndChars("ada");
    flipEndChars("Ada");
    flipEndChars("z");
  }

  public static void flipEndChars(String str) {
    if (str.length() < 2) {
      System.out.println("Incompatible.");
      return;
    } else if (str.charAt(0) == str.charAt(str.length() - 1)) {
      System.out.println("Two's a pair.");
      return;
    }
    System.out.println(str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0));
  }
}
