# Event-Manager-and-Verification-System
This project is a Spring Boot and SQL-based event management system that facilitates event creation and multi-level verification. It enables students to submit events for approval and follows a hierarchical workflow for event approval by the HOD and Principal.

Project Structure -->

EventManagerProject/
│
├── src/
│   ├── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── eventmanager/
│       │               ├── controller/
│       │               │   ├── EventController.java
│       │               │   ├── VerificationController.java
│       │               │   └── UserController.java (optional for user management)
│       │               │
│       │               ├── model/
│       │               │   ├── Event.java
│       │               │   ├── User.java
│       │               │   └── Verification.java
│       │               │
│       │               ├── repository/
│       │               │   ├── EventRepository.java
│       │               │   ├── UserRepository.java
│       │               │   └── VerificationRepository.java
│       │               │
│       │               ├── service/
│       │               │   ├── EventService.java
│       │               │   ├── VerificationService.java
│       │               │   ├── UserService.java
│       │               │   │
│       │               │   └── impl/
│       │               │       ├── EventServiceImpl.java
│       │               │       ├── VerificationServiceImpl.java
│       │               │       └── UserServiceImpl.java
│       │               │
│       │               └── EventManagerApplication.java
│       │
│       └── resources/
│           ├── static/
│           │   ├── create_event.html
│           │   ├── verify_event.html
│           │   ├── pending_events.html
│           │   └── css/
│           │       └── styles.css
│           │
│           └── application.properties
|
├── pom.xml
│
└── README.md
