package Assign2.Application;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class BookingManager {
    ArrayList<Booking> bookings=new ArrayList<>();

public void bookRow(String employeeId, MeetingRoom room, LocalDate date,java.time.LocalTime time,int duration)
{
    Booking booking=new Booking(employeeId,room,date, time,duration);
    bookings.add(booking);
    System.out.println("Booking successful:"+booking.getDetails());
}
public void getbookingByDate(LocalDate date){
    System.out.println("\n Booking on"+date+":");
     boolean found= false;
     for(Booking booking:bookings){
         if(booking.getDate().equals(date)){
             System.out.println(booking.getDetails());
             found=true;
         }

     }
     if(found==false){
         System.out.println("No bookings found:");
     }
}
}
