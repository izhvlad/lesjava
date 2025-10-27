package com.sibsutis.devices;
import com.sibsutis.Printable;
public abstract class Device {
    private int id;
    private int price;
    private String ip;

public Device(int id, int price, String ip){
    if(id >= 0){
        this.id = id;
        }else{ 
            throw new IllegalArgumentException("id < 0");}
    if(price >= 0){
        this.price = price;
        }else{ 
            throw new IllegalArgumentException("price < 0");}
    this.ip = ip;
    }
    public int getId(){
        return id;
    }
    public int getPrice(){
        return price;
    }
    public String getIp(){
        return ip;
    }
    public String print(){
        if(ip == null){
        return String.format("id = %d, price = %d, ip = Null, type = %s", id, price, getDeviceType());
        }
        return String.format("id = %d, price = %d, ip = %s, type = %s", id, price, ip, getDeviceType());
    }



public abstract String getDeviceType(); 
}



