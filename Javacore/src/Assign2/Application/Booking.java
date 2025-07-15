package Assign2.Application;

import java.time.LocalDate;
import java.time.LocalTime;

public class Booking {
    private String employeeId;
    private MeetingRoom room;
    private LocalDate date;
    private LocalTime time;
    private int durationInMintues;

    public Booking(String employeeId,MeetingRoom room,LocalDate date,LocalTime time,int durationInMintues){
        this.employeeId=employeeId;
        this.room=room;
        this.date=date;
        this.time=time;
        this.durationInMintues=durationInMintues;
    }
    //getter
    public LocalDate getDate(){
        return date;
    }
    public String getDetails(){
        return "Booking for" +employeeId+"in"+room.getRoomDetails()+durationInMintues+"mins";
    }
}

