 import com.sibsutis.Printable;
 import com.sibsutis.devices.PersonalComputer;
 import com.sibsutis.devices.Phone;
public class Main{ 
    public static void main(String[] args){
        PersonalComputer pc1 = new PersonalComputer(1, 1000,"192.168.1.0" );
        PersonalComputer pc2 = new PersonalComputer(2, 1200, "192.168.1.4");
        PersonalComputer pc3 = new PersonalComputer(1, 1000, null);
        
        Phone phone1 = new Phone(3, 500, "192.168.1.1");
        Phone phone2 = new Phone(3, 500, "192.168.1.1");
        Phone phone3 = new Phone(2, 500, null);


        System.out.println(pc1.equals(pc2)+ " " + pc2.print());
        System.out.println(pc1.equals(pc3)+ " " + pc3.print());
        System.out.println(phone1.equals(phone2)+ " " + phone2.print());
        System.out.println(phone1.equals(phone3)+ " " + phone3.print());
    }
} 
