/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanager;

/**
 *
 * @author Hoang Anh
 */
public class Room {
    private String id;
    private String type;
    private String description;
    private String name;
    private String displayPrice;
    private String hotelID; 

    public Room(String id, String type, String description, String name, String displayPrice, String hotel) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.name = name;
        this.displayPrice = displayPrice;
        this.hotelID=hotel;
    }

    public String getHotelID() {
        return hotelID;
    }

    public void setHotelID(String hotelID) {
        this.hotelID = hotelID;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayPrice() {
        return displayPrice;
    }

    public void setDisplayPrice(String displayPrice) {
        this.displayPrice = displayPrice;
    }

    public Room() {
    }
    
}
