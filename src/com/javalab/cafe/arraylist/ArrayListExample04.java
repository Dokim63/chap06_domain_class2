package com.javalab.cafe.arraylist;

import java.util.ArrayList;

public class ArrayListExample04 {
    public static void main(String[] args) {
        // Item 객체를 저장할 수 있는 ArrayList 객체 생성
        ArrayList<Item> items = new ArrayList<>(); // 왼쪽 타입보고 오른쪽 타입추론
        items.add(new Item(1001, "아메리카노", 3000));
        items.add(new Item(1002, "카페라떼", 4000));
        items.add(new Item(1003, "카푸치노", 4500));

        itemInfo(items);

        ArrayList<Item> updatedPrice = updatedInfo(items); // 변수 선언과 초기화
//        ArrayList<Item> updatedPrice = null; 변수선언
//        updatedPrice = updatedInfo(items);    메소드 선언해서 돌아오는 값 할당

        itemInfo(updatedPrice);






    } //end of main
    static void itemInfo(ArrayList<Item> items) {
        for (Item ite : items) {
            System.out.println(ite.getId() +"\t"+ ite.getName()+"\t" + ite.getPrice());
        }
    } // item info 메소드 종료

    // 가격 인상된 Item 객체를 저장할 ArrayList
    public static ArrayList<Item> updatedInfo(ArrayList<Item>items){
        ArrayList<Item> updatedItems = new ArrayList<>();
        // 가격 인상률
        double percentIncerease = 0.1; //가격 인상률 10%
        for(Item ite : items){
            double newPrice = ite.getPrice()*percentIncerease+ite.getPrice();
            // 가격 인상된 Item 객체 생성
            Item tempItem = new Item(ite.getId(),ite.getName(),newPrice);
            // 가격 인상된 Item 객체를 새로운 ArrayList에 저장
            updatedItems.add(tempItem);
        }

        return updatedItems;
    } // updatedInfo 메소드종료


} // end of class


class Item {
    private int id;
    private String name;
    private double price;

    public Item() {
    }

    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}




