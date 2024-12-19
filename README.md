INTRODUCTION
    The Online Hotel Booking Management System is the biggest, strongest, and the most holistic solution which will help to bring modernity and efficiency to the simplest day-to-day operations in a hotel. Its intent, while digitalization moves in through hospitality industries, this online booking management system targets traditional flows with low-key intervention for increased and advanced work process performance in enhancing its delivery for both users-administrators of hotels, creating an easy experience in a client-friendly environment.

    It has focused much on some areas including room booking, processing payment, status updating of the rooms, and others related to the service. This would therefore enable the system to make hotel operations simpler and even ensure that it is precise, transparent, and accurate in terms of real-time monitoring of crucial hotel functions.

    For the hotel staff and management, it is a system that helps them make better resource-use decisions by providing them with a reduction in administrative overhead. Customers found it easy and fast to make room bookings, ascertain its availability, and even to pay for services used via the online interface.


REQUIREMENT ANALYSIS

    Functional Requirements
    •	Supports the customers to book, change, and cancel their bookings.
    •	Supports search hotels or apartments based on name (e.g. Radisson, Singapore)
    •	Shows search results containing address, ratings, price, and availability for selected dates.
    •	Booking details can be changed by staff including check-in / check-out dates, room preferences/bed preferences, and cancellation of booking.
    •	Online payment through credit / debit cards.
    •	Booking confirmation emails after successful payments.
    •	Customers can comment about the hotels or apartments along with ratings.
    •	Customers can track their booking status and promotion / deals.
    •	Customers can give feedback or contact the company for help.
    •	Customers can check for latest promotion or deal.

Non-Functional Requirements
    •	It handles sensitive data (e.g., card details, CVV) in a safe manner.
    •	Customers can check for latest promotion or deal.
    •	Allows multiple bookings at one time.
    •	Offer 24/7 online booking.
    •	Completely supports IE, Safari, Chrome, Firefox.
    •	Converts prices into USD and SGD.
    •	Provides newsletters about promotion to the users who registered with them.
    •	Booking must be canceled at least 24 hours before check-in time to avoid charge.
    •	Promotion credit cards get charged promptly.



3.System Architecture for Online Hotel Booking System

    BookingService
        Role: Manages bookings in the system.
        Key Methods:
        •	createBooking(): Adds a new booking.
        •	getUserBookings(): Retrieves bookings for a specific user.
    RoomService
        Role: Handles room operations and status management.
        Key Methods:
        •	addRoom(): Adds a room to the system.
        •	getAvailableRooms(): Fetches available rooms.
        •	updateRoomStatus(): Updates a room's status.
    PaymentService
        Role: Processes payments for bookings.
        Key Methods:
        •	processPayment(): Logs and confirms a payment.
    UserManager
        Role: Manages user accounts and information.
        Key Methods:
        •	addUser(): Adds a new user.
        •	getUser(): Retrieves user details.

    Display
        Role: Provides user interface for displaying room, booking, and payment details.

        Core Classes
        •	Room: Represents a hotel room with attributes like ID, type, price, and status.
        •	User: Represents a user with ID, name, and contact information.
3.1 OnlineHotelBookingSystem
    Purpose:
    Acts as the central hub coordinating all other components like RoomService, BookingService, PaymentService, and UserManager.
    Responsibilities:
    •	Manage active bookings and users.
    •	Set and retrieve room status and availability.
    •	Provide access to RoomService, BookingService, PaymentService, and user-related operations.
    Key Methods:
    •	getRoomService(): Returns the RoomService instance to manage room-related operations.
    •	getBookingService(): Returns the BookingService instance to handle bookings.
    •	getPaymentService(): Returns the PaymentService instance to process payments.
    •	getUserManager(): Retrieves the instance managing user information and accounts.
    •	setActiveBooking(User user, Booking booking): Links an active booking to a user.
    •	addActiveUser(User user): Registers a user as currently active in the system.
    •	removeActiveUser(User user): Logs out a user or marks them as inactive.

3.2 RoomService
    Purpose:
    Manages storage and retrieval of room information in the system.
    Responsibilities:
    •	Add new rooms to the system.
    •	Update the status of rooms (e.g., AVAILABLE, RESERVED).
    •	Retrieve details of available rooms.
    •	Provide access to the full list of rooms.
    Key Methods:
    •	addRoom(Room room): Adds a new room to the system.
    •	updateRoomStatus(int roomId, RoomStatus status): Updates the status of a specific room using its ID.
    •	getAvailableRooms(): Retrieves all rooms that are currently available.
    •	getRooms(): Returns all rooms managed by the system.

3.3 User Management
    Purpose:
    Handles user account information and management, including retrieval of user details.
    Responsibilities:
    •	Add new users to the system with relevant details like name and contact information.
    •	Locate and retrieve user accounts using their unique ID.
    •	Manage user information and provide necessary user-related functionalities.
    Key Methods:
    •	User(int userId, String name, String contactInfo): Constructs a user object with a unique ID, name, and contact information.
    •	getUserId(): Returns the unique ID of a user.
    •	getName(): Retrieves the name of the user.
    •	getContactInfo(): Retrieves the contact information of the user.
3.4 Display
    Purpose:
    Handles the representation of system data, such as user details and room or booking information.
    Responsibilities:
    •	Display detailed user information, including their name and contact details.
    •	Show room details such as room type, price, and availability status.
    •	Present booking details including user ID, room ID, and dates.
    •	Provide a user-friendly view of payment and room statuses.
    Key Features:
    •	toString() in each class (User, Room, Booking, Payment): Formats object data into a readable string for display purposes.
    •	Displays real-time data updates for the current status of rooms, bookings, or payments.
    •	Provides clarity on the user and room statuses via concise information formatting.
3.5 Book
    Purpose:
    Represents a single room entity with attributes and methods to manage its state.
    Attributes:
    •	roomId: Unique identifier for the room.
    •	type: The type of the room (e.g., single, double, suite).
    •	price: Cost of booking the room.
    •	status: The current status of the room (e.g., AVAILABLE, RESERVED, CHECKED_IN).
    Responsibilities:
    •	Maintain information about the room, including its type, price, and availability.
    •	Provide mechanisms to update and retrieve room status.
    •	Support interaction with other system components like RoomService for booking or updating purposes.
    Key Methods:
    •	getRoomId(): Retrieves the unique ID of the room.
    •	getType(): Returns the type of the room.
    •	getPrice(): Returns the price of the room.
    •	getStatus(): Retrieves the current status of the room.
    •	setStatus(RoomStatus status): Updates the status of the room.

3.6 User
    Purpose:
    Represents a user in the hotel booking system.
    Attributes:
    •	userId: Unique identifier for the user.
    •	name: Name of the user.
    •	contactInfo: Contact information of the user (e.g., email, phone).
    Responsibilities:
    •	Store and manage user-specific information.
    •	Provide mechanisms to retrieve user details and represent the user in the system.
    •	Support interaction with booking and payment systems.
    Key Methods:
    •	getUserId(): Retrieves the unique ID of the user.
    •	getName(): Returns the name of the user.
    •	getContactInfo(): Provides the contact details of the user.

4. WORKFLOW
    1. User Interaction:
        •	Login: Authenticate users via UserManager.login(userId).
        •	View Rooms: Display available rooms using RoomService.getAvailableRooms().
        •	Book Room: Reserve rooms via BookingService.createBooking(Booking booking).
        •	Check Room Status: Show room status (AVAILABLE, RESERVED, etc.) via Room.getStatus().
    2. Room Service Usage:
        •	Add Rooms: Register new rooms using RoomService.addRoom(Room room).
        •	Update Status: Change room status with RoomService.updateRoomStatus(roomId, RoomStatus status).
        •	Retrieve Availability: List all available rooms via RoomService.getAvailableRooms().
    3. Payment Processing:
        •	Process Payments: Use PaymentService.processPayment(Payment payment) to handle transactions.
        •	Store Details: Maintain payment records within booking details.
    4. Booking Management:
        •	View Bookings: List user-specific bookings via BookingService.getUserBookings(userId).
        •	Modify/Cancel Bookings: Update or remove bookings as needed.


