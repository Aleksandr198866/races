package races;

 public class Horse {
    int horseNumber;
    String name;
    int minSpeed;
    int maxSpeed;
    int actualSpeed;
    int distanceTraveled;
    int position;

     Horse(int horseNumber, String name, int minSpeed, int maxSpeed, int actualSpeed, int distanceTraveled, int position) {
         this.horseNumber = horseNumber;
         this.name = name;
         this.minSpeed = minSpeed;
         this.maxSpeed = maxSpeed;
         this.actualSpeed = actualSpeed;
         this.distanceTraveled = distanceTraveled;
         this.position = position;
     }
 }
