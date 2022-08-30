package com.yarets.datahouse;

import java.util.Scanner;

public class DataHouse {
    private int id;
    private int apartNum;
    private double apartArea;
    private int apartFloor;
    private int apartNumRoom;
    private String apartStreet;

    public DataHouse(int id, int apartNum, double apartArea, int apartFloor, int apartNumRoom, String apartStreet) {
        this.id = id;
        this.apartNum = apartNum;
        this.apartArea = apartArea;
        this.apartFloor = apartFloor;
        this.apartNumRoom = apartNumRoom;
        this.apartStreet = apartStreet;
    }

    public DataHouse() {
        Scanner sc= new Scanner(System.in);
        System.out.println("\n\n\nВведіть ID будинку: ");
        this.id = (sc.nextInt());
        System.out.println("\nВведіть номер квартири: ");
        this.apartNum = (sc.nextInt());
        System.out.println("\nВведіть площу квартири: ");
        this.apartArea = (sc.nextDouble());
        System.out.println("\nВведіть поверх:");
        this.apartFloor = (sc.nextInt());
        System.out.println("\nВведіть кількість кімнат: ");
        this.apartNumRoom = (sc.nextInt());
        System.out.println("\nВведіть вулицю: ");
        this.apartStreet = (sc.next());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartNum() {
        return apartNum;
    }

    public void setApartNum(int apartNum) {
        this.apartNum = apartNum;
    }

    public double getApartArea() {
        return apartArea;
    }

    public void setApartArea(double apartArea) {
        this.apartArea = apartArea;
    }

    public int getApartFloor() {
        return apartFloor;
    }

    public void setApartFloor(int apartFloor) {
        this.apartFloor = apartFloor;
    }

    public int getApartNumRoom() {
        return apartNumRoom;
    }

    public void setApartNumRoom(int apartNumRooms) {
        this.apartNumRoom = apartNumRoom;
    }

    public String getApartStreet() {
        return apartStreet;
    }

    public void setApartStreet(String apartStreet) {
        this.apartStreet = apartStreet;
    }

    public String toString() {
        return "\nID: " + this.id + ", номер квартири: " + this.apartNum + ", її площа: " + this.apartArea + ", на " + this.apartFloor + " поверсі, кількість кімнат: " + this.apartNumRoom + ", на вулиці: " + this.apartStreet;
    }
}
