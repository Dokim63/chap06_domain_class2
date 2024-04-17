package com.javalab.cafe.domain;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 주문 도메인 클래스
 * - 속성(멤버변수) : 주문 id, 주문일자 , 상품 id, 주문처리사원 id ,주문수량
 */
public class Order {
    public int orderId;
    private LocalDateTime orderDate;
    private int productId;
    private int employeeId;
    private int quantity;

    //2. 기본생성, 파라미터가 없는 생성자
    public Order() {
    }

    // 3. 생성자, 파라미터가 있는 생성자
    public Order(int orderId, String orderDate, int productId, int employeeId, int quantity) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        this.orderId = orderId;
        this.orderDate = LocalDateTime.parse(orderDate, formatter);
        this.productId = productId;
        this.employeeId = employeeId;
        this.quantity = quantity;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   public static void orderDateInfo(Order[] orders){
        for(Order ord : orders){
            System.out.println(ord.getOrderId()+" "+ord.getOrderDate()+" "+ord.getProductId()+" "+ord.getEmployeeId()+" "+ord.getQuantity());
        }
    }
}



