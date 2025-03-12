public class SortCapitalLetters {
  public static void main(String[] args) {
    System.out.println(moveToFront("hApPy"));
  }

  public static String moveToFront(String in) {
    String uppercaseLetters = "", lowercaseLetters = "";
    for (char c : in.toCharArray()) {
      if (c >= 'a' && c <= 'z') lowercaseLetters += c;
      else uppercaseLetters += c;
    }
    return uppercaseLetters + lowercaseLetters;
  }
}
