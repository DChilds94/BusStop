import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }
    public void addPassenger(Person person) {
        if (totalPassengers() < 20)
        this.passengers.add(person);
    }
    public int totalPassengers() {
        return this.passengers.size();
    }
    public Person removePassenger() {
        return this.passengers.remove(0);
    }
}
