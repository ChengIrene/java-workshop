package idv.workshop.homework;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GarageTest {

    @Test
    public void testCreate(){
        Garage garage = new Garage();
        assertEquals(0, garage.getNumberOfCars());
    }

    @Test
    public void testGarage(){
        Garage garage = new Garage();

        // 1.TOYOTA
        Car car1 = new Car("Toyota", "green", 80, 20, 4, false, "no weapon", 180);
        // add into array
        garage.parkCarIntoGarage(car1);
        assertEquals(1, garage.getNumberOfCars());

        ArrayList<Car> allCars = garage.getAllCars();
        assertEquals(1, allCars.size());

        assertEquals(car1, allCars.get(0));

        // 2.MITSUBISHI
        Car car2 = new Car("Mitsubishi", "black", 70, 20, 4, false, "no weapon", 180);
        // add into array
        garage.parkCarIntoGarage(car2);
        assertEquals(2, garage.getNumberOfCars());
        assertEquals(2, allCars.size());
        assertEquals(car1, allCars.get(0));
        assertEquals(car2, allCars.get(1));

        // 3.NISSAN
        Car car3 = new Car("Nissan", "gary", 90, 10, 4, false, "no weapon", 190);
        // add into array
        garage.parkCarIntoGarage(car3);
        assertEquals(3, garage.getNumberOfCars());
        assertEquals(3, allCars.size());
        assertEquals(car1, allCars.get(0));
        assertEquals(car2, allCars.get(1));
        assertEquals(car3, allCars.get(2));
    }

    @Test
    public void testRemoveCarFromGarage() {
        Garage garage = new Garage();

        // Car1:TOYOTA
        Car car1 = new Car("Toyota", "green", 80, 20, 4, false, "no weapon", 180);
        // add into array
        garage.parkCarIntoGarage(car1);
        // Car2:MITSUBISHI
        Car car2 = new Car("Mitsubishi", "black", 70, 20, 4, false, "no weapon", 180);
        // add into array
        garage.parkCarIntoGarage(car2);
        // Car3:NISSAN
        Car car3 = new Car("Nissan", "gary", 90, 10, 4, false, "no weapon", 190);
        // add into array
        garage.parkCarIntoGarage(car3);

        // remove cars from array
        garage.removeACarFromGarage(car1);
        garage.removeACarFromGarage(car2);
        garage.removeACarFromGarage(car3);
        assertFalse(garage.isCarInGarage(car1));
        assertFalse(garage.isCarInGarage(car2));
        assertFalse(garage.isCarInGarage(car3));
    }

    @Test
    public void removeAllCarsFromGarage() {
        Garage garage = new Garage();

        // Car1:TOYOTA
        Car car1 = new Car("Toyota", "green", 80, 20, 4, false, "no weapon", 180);
        // add into array
        garage.parkCarIntoGarage(car1);
        // Car2:MITSUBISHI
        Car car2 = new Car("Mitsubishi", "black", 70, 20, 4, false, "no weapon", 180);
        // add into array
        garage.parkCarIntoGarage(car2);
        // Car3:NISSAN
        Car car3 = new Car("Nissan", "gary", 90, 10, 4, false, "no weapon", 190);
        // add into array
        garage.parkCarIntoGarage(car3);

        // create a new list
        List<Car> removedList = new ArrayList<>();
        // Suppose we want to remove car1 and car3
        removedList.add(car1);
        removedList.add(car3);

        // remove all cars from array
        assertTrue(garage.removeAllCarsFromGarage(removedList));
        assertEquals(1, garage.getNumberOfCars());
        assertEquals(car2, garage.getAllCars().get(0));
    }

    @Test
    public void isCarInGarage() {
        Garage garage = new Garage();

        // Car1:TOYOTA
        Car car1 = new Car("Toyota", "green", 80, 20, 4, false, "no weapon", 180);
        // add into array
        garage.parkCarIntoGarage(car1);
        // Car2:MITSUBISHI
        Car car2 = new Car("Mitsubishi", "black", 70, 20, 4, false, "no weapon", 180);
        // add into array
        garage.parkCarIntoGarage(car2);
        // Car3:NISSAN
        Car car3 = new Car("Nissan", "gary", 90, 10, 4, false, "no weapon", 190);
        // add into array
        garage.parkCarIntoGarage(car3);

        assertTrue(garage.isCarInGarage(car1));
        assertTrue(garage.isCarInGarage(car2));
        assertTrue(garage.isCarInGarage(car3));
    }

    @Test
    public void getIndexOfCar() {
        Garage garage = new Garage();

        // Car1:TOYOTA
        Car car1 = new Car("Toyota", "green", 80, 20, 4, false, "no weapon", 180);
        // add into array
        garage.parkCarIntoGarage(car1);
        // Car2:MITSUBISHI
        Car car2 = new Car("Mitsubishi", "black", 70, 20, 4, false, "no weapon", 180);
        // add into array
        garage.parkCarIntoGarage(car2);
        // Car3:NISSAN
        Car car3 = new Car("Nissan", "gary", 90, 10, 4, false, "no weapon", 190);
        // add into array
        garage.parkCarIntoGarage(car3);

        assertEquals(0, garage.getIndexOfCar(car1));
        assertEquals(1, garage.getIndexOfCar(car2));
        assertEquals(2, garage.getIndexOfCar(car3));
    }

    @Test
    public void garageIsEmpty() {
        Garage garage = new Garage();

        // Car1:TOYOTA
        Car car1 = new Car("Toyota", "green", 80, 20, 4, false, "no weapon", 180);
        // add into array
        garage.parkCarIntoGarage(car1);
        // Car2:MITSUBISHI
        Car car2 = new Car("Mitsubishi", "black", 70, 20, 4, false, "no weapon", 180);
        // add into array
        garage.parkCarIntoGarage(car2);
        // Car3:NISSAN
        Car car3 = new Car("Nissan", "gary", 90, 10, 4, false, "no weapon", 190);
        // add into array
        garage.parkCarIntoGarage(car3);

        assertFalse(garage.isGarageEmpty());
    }
}