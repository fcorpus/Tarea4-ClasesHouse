package home;

import areas.*;

public class House {
    public static final int MAX_REST_ROOMS = 10;
    public static final int MAX_BED_ROOMS = 10;
    private Kitchen kitchen;
    private DinningRoom dinningRoom;
    private LivingRoom livingRoom;
    private RestRoom []restRooms= new RestRoom[MAX_REST_ROOMS];
    private BedRoom []bedRooms = new BedRoom[MAX_BED_ROOMS];
    private  Yard yard;
    private int i = 0;
    private  int j = 0;
    public void addRoom(BedRoom bedRoom, int i){
      if(i<10) {
          bedRooms[i] = bedRoom;
      }
      i++;
    }
    public void addRoom(RestRoom restRoom, int j){
        if(j<10) {
            restRooms[j] = restRoom;
        }
        j++;
    }
}
