package races;

public class Races {
    public static void main(String[] args) {
        final int SIZE = 6;
        Horse[] horse = new Horse[SIZE];
        int rate;
        int place;

        Hippodrome hippodrome = new Hippodrome();

        horse[0] = new Horse(1,"1. Star", 20, 40, 0,0,0);
        horse[1] = new Horse(2,"2. Quick", 25, 38,0,0,0);
        horse[2] = new Horse(3,"3. Right", 23, 34,0,0,0);
        horse[3] = new Horse(4,"4. Wind", 27, 33,0,0,0);
        horse[4] = new Horse(5,"5. Pegasus", 29, 36,0,0,0);
        horse[5] = new Horse(6,"6. Storm", 21, 33,0,0,0);

        ManagerHorse managerHorse = new ManagerHorse(horse);
        Player player = new Player();
        managerHorse.showHorse();
        rate = player.chooseHorse();
        System.out.println("Вы выбрали: " + managerHorse.horses[rate - 1].name);
        System.out.println();
        System.out.println("Старт заезда");
        System.out.println();

        int j = 0;
        do {
            for (int i = 0; i < managerHorse.horses.length; i++) {
                Horse horseTemp = managerHorse.horses[i];
                horseTemp.actualSpeed = managerHorse.runningSpeed(horseTemp.minSpeed, horseTemp.maxSpeed);
                horseTemp.distanceTraveled = horseTemp.actualSpeed * j + horseTemp.distanceTraveled;

                System.out.println("Дистанция "+ horseTemp.name + " равна " + horseTemp.distanceTraveled);
            }
            if (hippodrome.racecourse > managerHorse.horses[j].distanceTraveled) {
                System.out.println("Новый круг");
            } else {
                System.out.println("Конец заезда");
            }
            j++;
        } while (managerHorse.checkGame());

        managerHorse.sortHorses();

        System.out.println();
        System.out.println("Результаты заезда.");
        System.out.println();

        place = 0;
        while (place < managerHorse.horses.length) {
            Horse horseTemp = managerHorse.horses[place];
            System.out.println("Место " + horseTemp.horseNumber + "   " + (horseTemp.position + place + 1) + " лошадь " + horseTemp.name +
                    ", пройденная дистанция " + horseTemp.distanceTraveled);
            horseTemp.position = horseTemp.position + place + 1;
            place ++;
            /*if (horseTemp.horseNumber == rate){
                System.out.println("Ваша лошадь " + managerHorse.horses[rate - 1].name + " заняла " +
                        managerHorse.horses[rate - 1].position + " место.");
            }*/
        }
        /*System.out.println("Ваша лошадь " + managerHorse.horses[rate - 1].position + " заняла " +
                managerHorse.horses[rate - 1].horseNumber + " место.");*/

        for (int i = 0; i < managerHorse.horses.length; i++) {
            if (rate == managerHorse.horses[i].horseNumber){
                /*System.out.println("Ваша лошадь " + managerHorse.horses[rate - 1].name + " заняла " +
                        managerHorse.horses[rate - 1].position + " место.");*/
                System.out.println("Ваша лошадь " + managerHorse.horses[rate - 1].name);
            }
        }
    }
}
