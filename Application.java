import java.util.Scanner;

public class Application {
    public static void menu() {
        System.out.println("Flight Reservation");
        System.out.println("1.Reserve Ticket");
        System.out.println("2.Cancel Reservation ");
        System.out.println("3.Check Reservation");
        System.out.println("4.Print Passenger");
        System.out.println("5.Exit");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Flight f1 = new Flight();
        menu();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your selection: ");
        int opt = Integer.parseInt(reader.nextLine());
        while (opt != 5) {
            switch (opt) {
                case 1:
                    System.out.println("Please enter reservation name: ");
                    String name = reader.nextLine();
                    if(f1.reservationSeat(name)){
                        System.out.println("The seat is reserved by: " + name);
                    }else{
                        System.out.println("All seats are full. ");
                    }
                    break;
                case 2:
                    System.out.println("Please enter reservation name to cancel reservation: ");
                    String deletedName = reader.nextLine();
                    System.out.println(f1.cancelReservation(deletedName));
                    break;
                case 3:
                    System.out.println("Please enter reservation name to search: ");
                    String reservationName = reader.nextLine();
                    System.out.println(f1.checkName(reservationName));
                    break;
                case 4:
                    f1.printPassenger();
                    break;
            }
            menu();
            System.out.println("Enter your selection: ");
            opt = Integer.parseInt(reader.nextLine());
        }
    }
}