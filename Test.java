import java.util.ArrayList;
import java.util.Date;
import  java.util.Scanner;


public class Test {
    public static void main(String[] args) {
    ArrayList<Airport> ArrivalAirportList= new ArrayList<>();
    ArrayList<Airport> DepartueAirportList= new ArrayList<>();
    ArrayList<Flight> FlightList= new ArrayList<>();
    ArrayList<Passenger> passengersList= new ArrayList<>();
    ArrayList<Ticket> TicketList= new ArrayList<>();
    Airport a1 = new Airport("Allama Iqbal Airport", "1092", "Lahore", "Pakistan");
    ArrivalAirportList.add(a1);
    Airport a2 =new Airport("Benezir Intl Airport", "1091", "Karachi", "Pakistan");
    DepartueAirportList.add(a2);
    // AirportList.add(new Airport("Islamabad Intl Airport", "1090", "Islamabad", "Pakistan"));
    Date d1 = new Date();
     FlightList.add(new Flight("LH101", d1, d1, ArrivalAirportList, DepartueAirportList));
//   FlightList.add(new Flight("LH102", d1, d1, AirportList, AirportList));
//   FlightList.add(new Flight("LH103", d1, d1, AirportList, AirportList));
  
    passengersList.add(new Passenger("Mian Danial", "danialwajid112@gmail.com", 9232008988576L, 20, "Economy"));
    passengersList.add(new Passenger("Mian Sufian", "sufianwajid112@gmail.com", 92328858576L, 30, "Busniness"));
    passengersList.add(new Passenger("Mian Wajid", "wajid112@gmail.com", 92320455886L, 29, "First Class"));
    ArrayList<Reservation> ReservationList=  new ArrayList<>();
    TicketList.add(new Ticket("Lh922", "L10822", passengersList, FlightList));
    ReservationList.add(new Reservation("Lh922", FlightList, passengersList, TicketList));
    ArrayList<Feedback> FeedbackList= new ArrayList<>();
    FeedbackList.add(new Feedback("Danial", "Satisfied", 10, d1))    ;

    Scanner  input = new Scanner(System.in);

    System.out.println("------------Airline management System------------");
    Economic e1= new Economic("Mian Danial", "danialwajid112@gmail.com", 9232008988576L, 20, "Economy", 20000,10000,1000);
    while (true) {
        System.out.println("Enter 1 to Display Flight Schedule");
        System.out.println("Enter 2 to Book Flight ");
        System.out.println("Enter 3 to Give Feedback ");
        System.out.println("Enter 0 to terminate the program");
        int choice= input.nextInt();
        if(choice==0){
            System.out.println("-----------------------------------------");
            System.out.println("the program has been terminated");
            System.out.println("-----------------------------------------");
            break;
        }
        else{
            if (choice==1) {
                System.out.println("----Flight Schedule----");
                for (int i = 0; i < FlightList.size(); i++) {
                    System.out.println("flight no          :" + FlightList.get(i).getFlightNumber());
                    System.out.println("Arrival Airport    :"+ FlightList.get(i).getArrivalAirportList().get(i).getAirportName());
                    System.out.println("Departue Airport   :"+FlightList.get(i).getDepartueAirportList().get(i).getAirportName());
                    System.out.println("Arrival Time       :" + FlightList.get(i).getArrivalTime());
                    System.out.println("Departure Time     :" + FlightList.get(i).getDepartureTime());
                }
            }
               // Inside the 'choice==2' block in the 'Test' class
       else if (choice == 2) {
       System.out.println("-----------------Booking Menu-----------------");
       System.out.println("-------------Personel Information--------------");
       System.out.println("Enter you name");
       String passName = input.nextLine();
       System.out.println("enter you age ");
       int age = input.nextInt();
       System.out.println("Enter your Email " );
       String email= input.nextLine();
       System.out.println("Enter your PhoneNumber");
       Long number= input.nextLong();
       System.out.println("Enter Ticket Class ");
       String TicketClass= input.nextLine();
       Passenger p1=  new Passenger(passName, email, choice, age, TicketClass);
       System.out.println("-----------Flight Information-----------");
       System.out.println("Enter Departure Airport");
       String depAirport = input.nextLine();
       
       

    for (Reservation reservation : ReservationList) {
        for (Passenger passenger : reservation.getPassengersList()) {
            if (passenger instanceof Economic) {
                Economic economicPassenger = (Economic) passenger;
                System.out.println("Name: " + passenger.getName());
                System.out.println("Email: " + passenger.getEmail());
                System.out.println("Ticket Class: " + passenger.getTicketClass());
                System.out.println("Fare: " + economicPassenger.CalculateFare());
            }
            // Similar handling for Business and FirstClass passengers
            // Use respective instance checks and casting for Business and FirstClass
        }
    }
}

else if (choice == 3) {
    System.out.println("---------Feedback-----------");
    input.nextLine(); 
    System.out.println("Please enter your name: ");
    String name = input.nextLine();
    System.out.println("Please enter Feedback Content: ");
    String content = input.nextLine();
    System.out.println("Please rate our service (1-10): ");
    int rate = input.nextInt();
    input.nextLine(); 

    Feedback f1 = new Feedback(name, content, rate, d1);
    FeedbackList.add(f1);

    System.out.println("Thank you for your feedback!");
   System.out.println("-------------Our Reviews-------------");
   int index=0;
    for (Feedback f : FeedbackList) {
        index++;
        System.out.println("Feedback content  " + (index) +":" + f.getFeedBackContent());
        System.out.println("Rating            " + (index) +":"+f.getRating());
    }
}

            
        }
        
    }

    


    }
    
}
