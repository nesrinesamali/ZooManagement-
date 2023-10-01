import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ZooManagement zoo =new ZooManagement();
        System.out.println(zoo.zooName+"comporte"+zoo.nbrCages);

    Scanner scanner = new Scanner(System.in);


    System.out.println("Veuillez saisir le nombre de cages souhaité : ");
    int nbrCages = scanner.nextInt();

        scanner.nextLine();


        System.out.print("Veuillez saisir le nom du zoo : ");
    String zooName = scanner.nextLine();


    ZooManagement zm = new ZooManagement(nbrCages, zooName);


        System.out.println(zm.zooName + " comporte " + zm.nbrCages + " cages");


        scanner.close();
}}












