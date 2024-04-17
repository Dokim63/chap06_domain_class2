package com.javalab.cafe.arraylist;

import java.util.ArrayList;

public class ArrayListExample01 {
    public static void main(String[] args) {

        // String Type을 저장할 수 있는 ArrayList 객체 생성
        ArrayList<String>strList = new ArrayList<String>();
        strList.add("apple");
        strList.add("Banana");
        strList.add("Cherry");

        System.out.println("strList의 첫번째 객체 : " + strList.get(0));
        System.out.println("strList의 두번째 객체 : " + strList.get(1));
        System.out.println("strList의 세번째 객체 : " + strList.get(2));

        System.out.println("strList의 크기 : " + strList.size());

        //ArrayList에 저장된 객체 출력
        for(String ary : strList){
            System.out.println(ary);
        }





    }
}
