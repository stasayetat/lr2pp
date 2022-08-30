package Main;
import java.util.Scanner;
import com.yarets.datahouse.DataHouse;

public class Main {

    private int arrSizeHouse;
    private DataHouse[] mainArrHouse;

    public void setArrSizeHouse(int arrSizeHouse) {
        this.arrSizeHouse = arrSizeHouse;
        this.mainArrHouse = new DataHouse[arrSizeHouse];
        for (int i = 0; i < this.arrSizeHouse; i++) {
            mainArrHouse[i] = new DataHouse();
        }
    }

    public void getGivNumRoom() {
        System.out.println("\nВведіть кількість кімнат, яку потрібно вивести на екран: ");
        Scanner sc= new Scanner(System.in);
        int givNumRoom = (sc.nextInt());
        System.out.println("Квартири, які підходять під цей параметр: ");
        for (int i = 0; i < this.arrSizeHouse; i++) {
            if(mainArrHouse[i].getApartNumRoom() == givNumRoom)
                System.out.println(mainArrHouse[i].toString());
        }
    }


    public void getGivNumRoomAndLocFloor() {
        System.out.println("\nВведіть кількість кімнат, яку потрібно вивести на екран: ");
        Scanner sc = new Scanner(System.in);
        int givNumRoom = (sc.nextInt());
        System.out.println("\nВведіть на якому проміжку поверхів повинна знаходитись квартира: ");
        int minLocFloor = (sc.nextInt());
        int maxLocFloor = (sc.nextInt());
        System.out.println("Квартири, які підходять під цей параметр: ");
        for (int i = 0; i < this.arrSizeHouse; i++) {
            if(mainArrHouse[i].getApartNumRoom() == givNumRoom) {
                if(mainArrHouse[i].getApartFloor() > minLocFloor && mainArrHouse[i].getApartFloor() < maxLocFloor)
                    System.out.println(mainArrHouse[i].toString());
            }
        }
    }

    public void getAreaMoreThan() {
        System.out.println("\nВведіть мінімальну площу квартир: ");
        Scanner sc = new Scanner(System.in);
        double minArea = (sc.nextDouble());
        System.out.println("Квартири, які підходять під цей параметр: ");
        for (int i = 0; i < this.arrSizeHouse; i++) {
            if(mainArrHouse[i].getApartArea() > minArea)
                System.out.println(mainArrHouse[i].toString());
        }
    }

    public static void main(String[] args) {
        Main houseNew = new Main();
        houseNew.setArrSizeHouse(2);
        houseNew.getAreaMoreThan();

    }
}
