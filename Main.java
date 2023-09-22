import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String [] args) throws Exception{
            Laptop laptop1 = new Laptop("Lenovo", "Windows 10", 8, 512, "Black", 13.3);
            Laptop laptop2 = new Laptop("Apple", "MacOS", 16, 512, "Silver", 14.5);
            Laptop laptop3 = new Laptop("Asus", "Windows 11", 64, 1000, "Red", 18.3);
            Laptop laptop4 = new Laptop("HP", "Windows 10", 16, 512, "Silver", 16.2);
            
            Set<Laptop>unicLaptop = new HashSet<Laptop>();
            unicLaptop.add(laptop1);
            unicLaptop.add(laptop2);
            unicLaptop.add(laptop3);
            unicLaptop.add(laptop4);
            System.out.printf("Всего ноутбуков: %d\n",unicLaptop.size());

            Map<Integer,String>mapCrit = new HashMap<>();
            mapCrit.put(1, "Производитель");
            mapCrit.put(2, "Операционная система");
            mapCrit.put(3, "Объем ОЗУ");
            mapCrit.put(4, "Объем ЖД");
            mapCrit.put(5, "Цвет");
            mapCrit.put(6, "Диагональ");

            Scanner sc = new Scanner(System.in);
            System.out.print("Введите желаемые характеристики:");
            System.out.print("\n1. ОЗУ: ");
            int ramUser = sc.nextInt();
            System.out.print("2. ЖД: ");
            int hddUser = sc.nextInt();
            System.out.print("3. Диагональ: ");
            final double diglUser = sc.nextDouble();
            for(Laptop lap: unicLaptop){
                if((lap.getRam() >= ramUser) && (lap.getHdd() >= hddUser) && (lap.getDiagonal() >= diglUser)){
                        System.out.println(lap.toString());
                }
            }
            sc.close();
    }
}



