package Assign2.Application;

public class MeetingRoom {
    private String roomId;
    private int capacity;
    private int floor;

 public MeetingRoom(String roomId,int capacity,int floor){
    this.roomId=roomId;
    this.capacity=capacity;
    this.floor=floor;
 }
 //getter
 public String getRoomId(){
     return roomId;
    }
    public int getCapacity(){
     return capacity;
    }
    public int getFloor(){
     return floor;
    }
    public String getRoomDetails(){
     return "Room Id : " + roomId + " capacity " + capacity + " floor " + floor;

    }

}



