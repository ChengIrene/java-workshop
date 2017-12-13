package idv.workshop.homework;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    /*
    * As a garage, it can contains lots of cars,
    * please implement this Garage class so that it can:
    *
    * 1. add a car into the garage (add) ...v
    * 2. remove a car from the garage by index (remove) ...v
    * 3. remove all cars in the garage (removeCars) ...v
    * 4. to check a car is in the garage or not (contains?) ...v
    * 5. get the index of specified car (???) indexOf ...OK
    * 6. the garage is empty or not (isEmpty?) ...v
    * 7. get the total number of cars in this garage (size) car.size()
    *
    * */

    private ArrayList<Car> cars = new ArrayList<>();

    //1. add a car into the garage (add)
    public void park(Car car) {
        cars.add(car);
    }

    //2. remove a car from the garage by index
    public boolean remove(Car car) {
        return cars.remove(car);
    }

    /*3. remove cars in the garage
     *
     * public boolean removeSpecifiedCars(List carsNeedToBeRemoved)
     * public boolean removeByList(List carsNeedToBeRemoved)
     * public boolean removeCars(List carsNeedToBeRemoved)
     *
     * */
    public boolean removeCars(List<Car> carsNeedToBeRemoved) {
        return this.cars.removeAll(carsNeedToBeRemoved);
    }

    //4. to check a car is in the garage or not
    public boolean isCarPresent(Car car) {
        return cars.contains(car);
    }

    //5. get the index of specified car
    public int getIndexOf(Car car) {
        return cars.indexOf(car);
    }

    //6. the garage is empty or not
    public boolean isEmpty() {
        return cars.isEmpty();
    }

    //7. get the total number of cars in this garage
    public int getNumberOfCars(){
        return cars.size();
    }

    public ArrayList<Car> getAllCars() {
        return cars;
    }

    //8. remove all cars
    public void removeAll() {
       cars.clear();
    }
}
