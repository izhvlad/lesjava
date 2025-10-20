public class Main{

public static Car[] getCarByBrend(Car[] cars, String brend){
if(cars == null){
return new Car[0];
    }
if(brend == null || brend.isEmpty()){
return new Car[0];
    }
     int temp_car = 0;
for (int i = 0; i < cars.length; i++) {
    Car car = cars[i];
    if (car.getBrend().equalsIgnoreCase(brend)) {
        temp_car++;
    }
}   
    


    
Car[] result = new Car[temp_car]; 
int flag = 0;
    for(int i = 0; i < cars.length; i++){
        Car car = cars[i];
        if (car.getBrend().equalsIgnoreCase(brend)) {
            result[flag++] = car;
        }
    }
    return result;
}

public static void main(String[] args) {
Car[] cars = {
    new Car(1, "Toyota", "Camry", 2020, "Black", 3500000, "A123BC"),
    new Car(2, "BMW", "X5", 2021, "White", 5000000, "B456DE"),
    new Car(3, "Toyota", "Corolla", 2019, "Red", 2000000, "C789FG"),
    new Car(4, "Mazda", "CX-5", 2022, "Silver", 2800000, "D098EF"),
    new Car(5, "Mazda", "3", 2011, "White", 850000, "E109GH"),
    new Car(6, "Mazda", "6", 2021, "Gray", 2600000, "F110IJ"),
    new Car(7, "Mazda", "MX-5", 2020, "Red", 3000000, "G121KL"),
    new Car(8, "Mazda", "CX-30", 2022, "White", 2400000, "H132MN")
    };

    
Car[] Mazda = getCarByBrend(cars, "Mazda");
System.out.println("Найдено машин Mazda: " + Mazda.length);
    for(int i = 0; i < Mazda.length; i++) {
        System.out.println("- " + Mazda[i].getModel());
    }

    
}
}