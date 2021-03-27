package races;

public class ManagerHorse {

    Horse[] horses;
    Hippodrome hippodrome = new Hippodrome();

    public ManagerHorse(Horse[] horse) {

        this.horses = horse;
    }

    void showHorse(){
        for (Horse horse : horses) {
            System.out.println(horse.name);
        }
    }

    int runningSpeed(int minSpeed, int maxSpeed) {
        int result;
        result = (int) (minSpeed + Math.random() * (maxSpeed - minSpeed));
        return result;
    }

     boolean checkGame() {
         for (int i = 0; i < horses.length; i++) {
             if (horses[i].distanceTraveled > hippodrome.racecourse){
                 return false;
             }
         }
         return true;
     }

    void sortHorses() {
        for (int i = 0; i < horses.length; i++) {
            for (int k = i + 1; k < horses.length; k++) {
                if (horses[i].distanceTraveled < horses[k].distanceTraveled){
                    Horse temp = horses[i];
                    horses[i] = horses[k];
                    horses[k] = temp;
                }
            }
        }
    }
}
