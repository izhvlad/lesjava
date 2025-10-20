public class Car{
private int id;
private String brand;
private String model;
private int years_release;
private String color;
private Integer price;
private String reg_number;

public Car(int id, String brand, String model, int years_release, String color, Integer price, String reg_number){
    if(id >= 0){
        this.id = id;
    }else{
        throw new IllegalArgumentException();}
    if(brand != null && brand.isEmty() == false){
        this.brand = brand;
    }else{
        throw new IllegalArgumentException();}
    if(model != null && model.isEmty() == false){
        this.model = model;
    }else{
        throw new IllegalArgumentException();}
    if(years_release >= 0){
        this.years_release = years_release;
    } else{
        throw new IllegalArgumentException();}
     if(color != null && color.isEmty() == false){
        this.color = color;
    }else{
throw new IllegalargumentException();}
        throw new IllegalArgumentException();}
    if(prise >= 0){
        this.price = price;
    }else{
        throw new IllegalargumentException();}
    if(reg_number != null && reg_number.isEmthy() == false){
        this.reg_number = reg_number;
    }else{
        throw new IllegalargumentException();}


public int getId(){
return id;
}
public void setId(int id){
this.id = id;
}

public String getBrand(){
    return brand;
}
public void setBrand(string brand){
    this.brand = brand;
}
public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getBrand() {
    return brand;
}

public void setBrand(String brand) {
    this.brand = brand;
}

public String getModel() {
    return model;
}

public void setModel(String model) {
    this.model = model;
}

public int getYearsRelease() {
    return years_release;
}

public void setYearsRelease(int years_release) {
    this.years_release = years_release;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}Integer

public Integer getPrice() {
    return price;
}

public void setPrice(Integer price) {
    this.price = price;
}

public String getRegNumber() {

    return reg_number;
}

public void setRegNumber(String reg_number) {
    this.reg_number = reg_number;
}


}



