package main;

import controllers.HotelController;
import services.RoomService;
import models.Room;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelController controller = new HotelController();

        // Adding some initial rooms to the system
        controller.addRoom(new Room(1, "Single", 1000.0));
        controller.addRoom(new Room(2, "Double", 2000.0));

        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Hotel Management System ---");
            System.out.println("1. Show Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Check-In");
            System.out.println("4. Check-Out");
            System.out.println("5. View User Bookings");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    controller.showAvailableRooms();
                    break;

                case 2:
                    System.out.print("Enter booking ID: ");
                    int bookingId = scanner.nextInt();
                    System.out.print("Enter room ID to book: ");
                    int roomId = scanner.nextInt();
                    System.out.print("Enter user ID: ");
                    int userId = scanner.nextInt();
                    System.out.print("Enter booking date (YYYY-MM-DD): ");
                    String bookingDateStr = scanner.next();
                    LocalDate bookingDate = LocalDate.parse(bookingDateStr);
                    System.out.print("Enter check-in date (YYYY-MM-DD): ");
                    String checkInDateStr = scanner.next();
                    LocalDate checkInDate = LocalDate.parse(checkInDateStr);
                    System.out.print("Enter check-out date (YYYY-MM-DD): ");
                    String checkOutDateStr = scanner.next();
                    LocalDate checkOutDate = LocalDate.parse(checkOutDateStr);
                    controller.bookRoom(bookingId, roomId, userId, bookingDate, checkInDate, checkOutDate);
                    break;

                case 3:
                    System.out.print("Enter booking ID to check-in: ");
                    int checkInBookingId = scanner.nextInt();
                    controller.checkIn(checkInBookingId);
                    break;

                case 4:
                    System.out.print("Enter booking ID to check-out: ");
                    int checkOutBookingId = scanner.nextInt();
                    System.out.print("Enter room ID for check-out: ");
                    int checkOutRoomId = scanner.nextInt();
                    System.out.print("Enter amount for payment: ");
                    double amount = scanner.nextDouble();
                    System.out.print("Enter payment method: ");
                    String paymentMethod = scanner.next();
                    controller.checkOut(checkOutBookingId, checkOutRoomId, amount, paymentMethod);
                    break;

                case 5:
                    System.out.print("Enter user ID to view bookings: ");
                    int viewUserId = scanner.nextInt();
                    controller.viewUserBookings(viewUserId);
                    break;

                case 6:
                    exit = true;
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
