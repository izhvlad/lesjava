package com.sibsutis.devices;
import com.sibsutis.devices.Device;
public  class Phone extends Device{
public Phone(int id, int price){
    super(id, price, null);
}

public Phone(int id, int price, String ip){
   super(id, price, ip);
}

public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Phone)) return false;
    Phone other = (Phone) obj;
    return this.getId() == other.getId();
}

public int hashCode() {
    return this.getId();
}
public String getDeviceType(){
    return "Phone";
}
}

