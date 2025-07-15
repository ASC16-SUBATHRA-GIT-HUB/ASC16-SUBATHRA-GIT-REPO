package Assign2.Application;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        MeetingRoom room=new MeetingRoom("s12",10,2);
        ZoomMeetingRoom zoomRoom=new ZoomMeetingRoom("suba",33,2,"1222333444","asg");
        BookingManager manager=new BookingManager();
        manager.bookRow("Emp1",room, LocalDate.of(2025,12,9), LocalTime.of(1,13,3),90);
        manager.bookRow("Emp2",zoomRoom, LocalDate.of(2025,11,19), LocalTime.of(2,13,31),67);
        manager.getbookingByDate( LocalDate.of(2025,12,9));
      }
}
