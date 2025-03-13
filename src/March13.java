public class March13 {
  public static void main(String[] args) {
    /*
    P A H N
    APLSIIG
    Y I R

    P  I  N
    A LS IG
    YA HR
    P  I
     */
    String word3 = "P A H N\nAPLSIIG\nY I R";
    String word4 = "P  I  N\nA LS IG\nYA HR\nP  I";
    System.out.println(zigzagzig(word3, 3)); // PAHNAPLSIIGYIR
    System.out.println(zigzagzig(word4, 4)); // PINALSIGYAHRPI
  }

  public static String zigzagzig(String str, int rows) {
    char[][] rowAndColumns = new char[rows][str.split("\n")[0].length()];
    for (int i = 0; i < str.replaceAll("\n", "").length(); i++) {
      rowAndColumns[i / rowAndColumns[0].length][i % rowAndColumns[0].length] = str.replaceAll("\n", "").charAt(i);
    }

    String result = "";
    for (int j = 0; j < rowAndColumns[0].length; j++) {
      for (int i = 0; i < rowAndColumns.length; i++) {
        if (rowAndColumns[i][j] != ' ' && rowAndColumns[i][j] != '\0') {
          result += rowAndColumns[i][j];
        }
      }
    }

    return result;
  }
}
