import java.util.Scanner;

public class MainCatsDogs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        UtilsCatsDogs utils = new UtilsCatsDogs();
        Cats cats = new Cats();
        Dogs dogs = new Dogs();

        utils.startMeniu();

        boolean exit = false;

        while (exit == false) {
            while (!scan.hasNext("[abcde]")) {
                utils.choseOption();
                scan.nextLine();
            }
            char optiune = scan.next().charAt(0);

            switch (optiune) {
                case 'a':
                    System.out.print("Numele pisicii este: ");
                    scan.nextLine();
                    cats.adaugaPisica(scan.next());
                    utils.startMeniu();
                    break;
                case 'b':
                    System.out.print("Numele cainelui este: ");
                    scan.nextLine();
                    dogs.adaugaCaine(scan.next());
                    utils.startMeniu();
                    break;
                case 'c':
                    cats.afiseazaPisici();
                    scan.nextLine();
                    break;
                case 'd':
                    dogs.afiseazaCaini();
                    scan.nextLine();
                    break;
                case 'e':
                    System.out.println("Pe curand!");
                    exit = true;
                    break;
            }
        }
    }
}





