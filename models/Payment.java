package models;
public class Payment {
    private int paymentId;
    private int bookingId;
    private double amount;
    private String method;

    public Payment(int paymentId, int bookingId, double amount, String method) {
        this.paymentId = paymentId;
        this.bookingId = bookingId;
        this.amount = amount;
        this.method = method;
    }

    public int getPaymentId() { return paymentId; }
    public int getBookingId() { return bookingId; }
    public double getAmount() { return amount; }
    public String getMethod() { return method; }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", bookingId=" + bookingId +
                ", amount=" + amount +
                ", method='" + method + '\'' +
                '}';
    }
}
