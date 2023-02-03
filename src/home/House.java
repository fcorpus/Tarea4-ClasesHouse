package home;

import areas.*;

public class House {
    private Kitchen kitchen;
    private DinningRoom dinningRoom;
    private LivingRoom livingRoom;
    private RestRoom []restRooms;
    private BedRoom []bedRooms;
    private  Yard yard;
    void addRoom(BedRoom bedRoom){
        bedRoom=new BedRoom();
    }
    void addRoom(RestRoom restRoom){
        restRoom=new RestRoom();
    }
}
