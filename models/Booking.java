package models;
import java.time.LocalDate;

public class Booking {
    private int bookingId;
    private int roomId;
    private int userId;
    private LocalDate bookingDate;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public Booking(int bookingId, int roomId, int userId, LocalDate bookingDate, LocalDate checkInDate, LocalDate checkOutDate) {
        this.bookingId = bookingId;
        this.roomId = roomId;
        this.userId = userId;
        this.bookingDate = bookingDate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public int getBookingId() { return bookingId; }
    public int getRoomId() { return roomId; }
    public int getUserId() { return userId; }
    public LocalDate getBookingDate() { return bookingDate; }
    public LocalDate getCheckInDate() { return checkInDate; }
    public LocalDate getCheckOutDate() { return checkOutDate; }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", roomId=" + roomId +
                ", userId=" + userId +
                ", bookingDate=" + bookingDate +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                '}';
    }
}
