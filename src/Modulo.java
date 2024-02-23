public class Modulo {
  public static void main(String[] args) {

    int students = 26;
    int leftOut = students % 3;

    System.out.println(leftOut);

    double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    double creditsAfterSeminar = creditsEarned - creditsToGraduate;
    System.out.println(creditsEarned > creditsToGraduate);
    System.out.println(creditsOfSeminar > creditsAfterSeminar);
  }
}
