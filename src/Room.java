/**
 * A meeting room that can be booked.
 * Immutable: name and capacity are set once in the constructor and have no setters.
 */
public class Room {
    private int capacity;
    private String name;

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public Room(int capacity, String name) {
        if (capacity <= 0){
            throw new IllegalArgumentException("Capacity must be positive");
        }
        this.capacity = capacity;
        this.name = name;
    }
    
}
