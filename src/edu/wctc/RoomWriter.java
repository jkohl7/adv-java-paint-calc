package edu.wctc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.Serializable;

public class RoomWriter implements Serializable{
    public void writeRoomFile(String fileName, ArrayList<Room> roomList) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for(Room r: roomList){
            oos.writeObject(r);
        }
        oos.close();

    }

}
