package idv.workshop.homework;

public class Car {

    /*
    * Spec(Specification):
    *
    * Please create a well-defined Car class, as described in the following content:
    *
    * attribute:
    * 1. brand: String type
    * 2. color: String type
    * 3. generation: int type (70, 80)
    * 4. carAge: int type
    * 5. numberOfWheel: int type
    * 6. hasWeapon: boolean type
    * 7. weaponName: String type (null is no weapon)
    * 8. maxSpeed: int type
    *
    * method:
    * 1. getter/setter for all attributes.
    * 2. Constructor can access all attributes.
    * 3. A method that can distinguish this car has weapon or not. -> Hint: public boolean isHasWeapon(){return hasWeapon;}
    * 4. A method can distinguish this car is a four-wheel car or not.
    * 5. A method can distinguish this car is a racing car or not. (maxSpeed > 200km)
    * 6. A method can distinguish this car is an old-generation (older than 90) cart or not.
    * 7. A method can distinguish this car is old or new, old means car age > 10.
    *
    * */

    private String name;
    private String color;
    private int generation;
    private int carAge;
    private int numberOfWheel;
    private boolean hasWeapon;
    private String weaponName;
    private int maxSpeed;

    public Car(){
    }

    public Car(String name, String color, int generation, int carAge, int numberOfWheel, boolean hasWeapon, String weaponName, int maxSpeed){
        this.name = name;
        this.color = color;
        this.generation = generation;
        this.carAge = carAge;
        this.numberOfWheel = numberOfWheel;
        this.hasWeapon = hasWeapon;
        this.weaponName = weaponName;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGenertation(int genertation) {
        this.generation = genertation;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public int getNumberOfWheel() {
        return numberOfWheel;
    }

    public void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    public boolean isHasWeapon() {
        return hasWeapon;
    }

    public void setHasWeapon(boolean hasWeapon) {
        this.hasWeapon = hasWeapon;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean hasFourWheel(){
        if (numberOfWheel == 4) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isRacingCar(){
        if(maxSpeed >= 200){
            return true;
        } else {
            return false;
        }
    }

    public boolean isOldGenerationCar(){
        if(generation < 90){
            return true;
        } else {
            return false;
        }
    }

    public boolean isOldAgeCar(){
        if(carAge >= 10){
            return true;
        } else {
            return false;
        }
    }
}
