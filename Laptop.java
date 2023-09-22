public class Laptop {
    private String manufacturer;
    private String operativeSystem;
    private int ram;
    private int hdd;
    private String color;
    private double diagonal;

    public Laptop(String manufacturer, String operativeSystem, int ram, 
    int hdd, String color, double diagonal){
        this.manufacturer = manufacturer;
        this.operativeSystem = operativeSystem;
        this.ram = ram;
        this.hdd = hdd;
        this.color = color;
        this.diagonal = diagonal;
    }
    @Override
    public String toString(){
        return String.format("Производитель: %s\nОперативная система: %s\nОЗУ:%d Гб\nОбъем ЖД: %d Гб\nЦвет: %s\nДиагональ:%f", this.manufacturer, this.operativeSystem, this.ram, this.hdd,this.color,this.diagonal);
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Laptop){
            return this.manufacturer.equals(((Laptop)obj).manufacturer)&& this.operativeSystem == ((Laptop)obj).operativeSystem
            && this.ram ==((Laptop)obj).ram && this.hdd ==((Laptop)obj).hdd && this.diagonal ==((Laptop)obj).diagonal;
        }
        return false;
    }
    public String getManufacturer(){
        return this.manufacturer;
    }
    public String getOperativeSystem(){
        return this.operativeSystem;
    }
    public int getRam(){
        return this.ram;
    }
    public int getHdd(){
        return this.hdd;
    }
    public String getColor(){
        return this.color;
    }
    public double getDiagonal(){
        return this.diagonal;
    }
}
