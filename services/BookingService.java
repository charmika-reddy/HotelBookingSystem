package services;
import models.*;
import java.util.*;

public class BookingService {
    private List<Booking> bookings;

    public BookingService() {
        bookings = new ArrayList<>();
    }

    public void createBooking(Booking booking) {
        bookings.add(booking);
    }

    public List<Booking> getUserBookings(int userId) {
        List<Booking> userBookings = new ArrayList<>();
        for (Booking booking : bookings) {
            if (booking.getUserId() == userId) {
                userBookings.add(booking);
            }
        }
        return userBookings;
    }
}
