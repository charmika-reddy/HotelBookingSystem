package services;
import models.*;
import java.util.*;

public class RoomService {
    private List<Room> rooms;

    public RoomService() {
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getStatus() == RoomStatus.AVAILABLE) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public void updateRoomStatus(int roomId, RoomStatus status) {
        for (Room room : rooms) {
            if (room.getRoomId() == roomId) {
                room.setStatus(status);
                break;
            }
        }
    }
}
