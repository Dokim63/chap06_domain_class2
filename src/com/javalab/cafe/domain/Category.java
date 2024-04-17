package com.javalab.cafe.domain;

/**
 * 카테고리 클래스
 * - 속성(멤버변수) : 카테고리 id, 카테고리명, 카테고리 설명
 */

public class Category {
    // 속성 정의(멤버변수,필드)
private int categoryID;         // 카테고리 id
    private String name;        // 카테고리 명
    private String description; // 카테고리 설명


    //생성자
    public Category(){

    }

    //생성자2
    public Category(int categoryID, String name, String description) {
        this.categoryID = categoryID;
        this.name = name;
        this.description = description;
    }



    // getter, setter 메서드
    // categoryId, getter, setter
    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public static void categoryInfo(Category[] categories){
        for(Category cat : categories){
            System.out.println(cat.getCategoryID()+" "+cat.getName()+" "+cat.getDescription());
        }
    }


}

