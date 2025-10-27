package com.sibsutis.devices;
import com.sibsutis.devices.Device;
public  class PersonalComputer extends Device{
public PersonalComputer(int id, int price){
    super(id, price, null);
    
}
public PersonalComputer(int id, int price, String ip){
    super(id, price, ip);
    
   
}
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof PersonalComputer)) return false;
    PersonalComputer other = (PersonalComputer) obj;
    return this.getId() == other.getId();
}

public int hashCode() {
    return this.getId();
}

public String getDeviceType(){
    return "PersonalComputer";
}
}

