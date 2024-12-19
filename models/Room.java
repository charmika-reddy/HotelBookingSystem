package models;
public class Room {
    private int roomId;
    private String type;
    private double price;
    private RoomStatus status;

    public Room(int roomId, String type, double price) {
        this.roomId = roomId;
        this.type = type;
        this.price = price;
        this.status = RoomStatus.AVAILABLE;
    }

    public int getRoomId() { return roomId; }
    public String getType() { return type; }
    public double getPrice() { return price; }
    public RoomStatus getStatus() { return status; }
    public void setStatus(RoomStatus status) { this.status = status; }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
