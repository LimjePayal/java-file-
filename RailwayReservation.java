class Reservation {
    int seats = 2;

    synchronized void bookTicket(String name) {
        if (seats > 0) {
            System.out.println(name + ": Ticket booked successfully");
            seats--;
        } else {
            System.out.println(name + ": No tickets available");
        }
    }
}

class Passenger extends Thread {
    Reservation r;
    String name;

    Passenger(Reservation r, String name) {
        this.r = r;
        this.name = name;
    }

    public void run() {
        r.bookTicket(name);
    }
}

public class RailwayReservation {
    public static void main(String[] args) {
        Reservation r = new Reservation();

        Passenger p1 = new Passenger(r, "User1");
        Passenger p2 = new Passenger(r, "User2");
        Passenger p3 = new Passenger(r, "User3");

        p1.start();
        p2.start();
        p3.start();
    }
}