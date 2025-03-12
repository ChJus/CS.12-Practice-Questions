public class Unmix {
  public static void main(String[] args) {
    unmix("123456");
    unmix("hTsii  s aimex dpus rtni.g");
    unmix("badce");
  }

  public static void unmix(String str) {
    int loc = 1;
    while (loc < str.length()) {
      if (loc == str.length() - 1 && str.length() % 2 == 1) {
        break;
      }
      str = str.substring(0, loc - 1) + str.charAt(loc) + str.charAt(loc - 1) + str.substring(loc + 1);
      loc += 2;
    }
    System.out.println(str);
  }
}
