package races;

import java.util.Scanner;

public class Player {

    int rate;

    int chooseHorse(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста, выбирете номер лошади: ");
        rate = scanner.nextInt();
        System.out.println();
        return rate;
    }
}
