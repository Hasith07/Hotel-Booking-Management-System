
abstract class Room {
    private String type;
    private double price;
    private int capacity;

    public Room(String type, double price, int capacity) {
        this.type = type;
        this.price = price;
        this.capacity = capacity;
    }

    public String getType() { return type; }
    public double getPrice() { return price; }
    public int getCapacity() { return capacity; }

    public void displayInfo() {
        System.out.println("Room Type: " + type + " | Price: $" + price + " | Capacity: " + capacity + " person(s)");
    }
}

class SingleRoom extends Room {
    public SingleRoom() { super("Single Room", 100.0, 1); }
}

class DoubleRoom extends Room {
    public DoubleRoom() { super("Double Room", 180.0, 2); }
}

class SuiteRoom extends Room {
    public SuiteRoom() { super("Suite", 350.0, 4); }
}


public class UseCase2RoomInitialization {
    public static void main(String[] args) {
        System.out.println("******************************************");
        System.out.println("Book My Stay App - Version 2.0");
        System.out.println("******************************************");


        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();


        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("Available Room Types and Inventory:");
        System.out.println("------------------------------------------");

        single.displayInfo();
        System.out.println("Rooms Available: " + singleAvailable + "\n");

        doubleRoom.displayInfo();
        System.out.println("Rooms Available: " + doubleAvailable + "\n");

        suite.displayInfo();
        System.out.println("Rooms Available: " + suiteAvailable + "\n");

        System.out.println("******************************************");
    }
}