package com.javalab.cafe.domain;

/**
 * 상품 도메인 클래스
 * -속성(멤버변수) : 상품ID, 상품명,카테고리ID ,상품가격
 */

public class Product {
    //1. 필드, 속성, 멤버변수
    private int productid; // 상품id, 상품을 유니크하게 구분
    private String name; // 상품명
    private int categoryId; // 카테고리Id, 어떤 카테고리에 속하는지
    private int price; // 상품가격

    // 2. 기본생성, 파라미터가 없는 생성자
    public Product() {
    }

    //3. 생성자, 파라미터가 있는 생성자
    public Product(int productid, String name, int categoryId, int price) {
        this.productid = productid;
        this.name = name;
        this.categoryId = categoryId;
        this.price = price;
    }


    public int getProductid() {
        return productid;
    }

    public String getName() {
        return name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public int getPrice() {
        return price;
    }

    public void setProductid(int productid) {
        productid = productid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void productInfo(Product[] products){
        for(Product pro : products){
            System.out.println(pro.getProductid()+" "+pro.getName()+" "+pro.getCategoryId()+" "+pro.getPrice());
        }
    }
}
