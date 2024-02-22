import java.util.Scanner;

public class App {
    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Welcome to Mad Libs!\n");

System.out.print("Enter a adjective: ");
String adjective = scanner.nextLine();

System.out.print("Enter a verb: ");
String verb = scanner.nextLine();

System.out.print("Enter a noun: ");
String noun = scanner.nextLine();

System.out.print("Enter a second noun: ");
String nounOne = scanner.nextLine();

System.out.print("Enter a number: ");
String number = scanner.nextLine();

System.out.print("Enter a bodyPart: ");
String bodyPart = scanner.nextLine();

System.out.print("Enter a third noun: ");
String nounTwo = scanner.nextLine();

System.out.print("Enter a adjective: ");
String adjectiveOne = scanner.nextLine();

System.out.print("Enter a noun: ");
String adjectiveTwo = scanner.nextLine();

String story = "Look, I guarantee there`ll be "+adjective+" times. I guarantee that at some "+noun+" ,"+number+" or both of us is gonna want to get out of this  "+nounOne+" But I also guarantee that if I don`t ask you to be "+adjectiveOne+" I`ll "+verb+" it for the rest of my "+nounTwo+" because I know, in my "+bodyPart+", you`re the "+adjectiveTwo+" one for me.";

System.out.println("\nYour Mad Libs story:\n"+story);

}
}
