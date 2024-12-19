package controllers;

import models.*;
import services.*;
import java.time.LocalDate;
import java.util.*;

public class HotelController {
    private RoomService roomService;
    private BookingService bookingService;
    private PaymentService paymentService;

    public HotelController() {
        roomService = new RoomService();
        bookingService = new BookingService();
        paymentService = new PaymentService();
    }

    public void addRoom(Room room) {
        roomService.addRoom(room);
    }

    public void showAvailableRooms() {
        List<Room> availableRooms = roomService.getAvailableRooms();
        for (Room room : availableRooms) {
            System.out.println(room);
        }
    }

    public void bookRoom(int bookingId, int roomId, int userId, LocalDate bookingDate, LocalDate checkInDate, LocalDate checkOutDate) {
        roomService.updateRoomStatus(roomId, RoomStatus.RESERVED);
        Booking booking = new Booking(bookingId, roomId, userId, bookingDate, checkInDate, checkOutDate);
        bookingService.createBooking(booking);
        System.out.println("Room booked successfully: " + booking);
    }

    public void checkIn(int roomId) {
        roomService.updateRoomStatus(roomId, RoomStatus.CHECKED_IN);
        System.out.println("Room checked in successfully.");
    }

    public void checkOut(int roomId, int bookingId, double amount, String paymentMethod) {
        roomService.updateRoomStatus(roomId, RoomStatus.CHECKED_OUT);
        Payment payment = new Payment(bookingId, bookingId, amount, paymentMethod);
        paymentService.processPayment(payment);
        System.out.println("Check-out completed.");
    }

    public void viewUserBookings(int userId) {
        List<Booking> bookings = bookingService.getUserBookings(userId);
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }
}
