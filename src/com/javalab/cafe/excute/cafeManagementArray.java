package com.javalab.cafe.excute;


import com.javalab.cafe.data.ArrayDatabase;
import com.javalab.cafe.domain.Category;
import com.javalab.cafe.domain.Employee;
import com.javalab.cafe.domain.Order;
import com.javalab.cafe.domain.Product;

/**
 * 카페 관리 시스템
 * - 주문, 사원, 상품, 카테고리 도메인 클래스를 이용한 카페 관리 시스템
 * - 주문, 사원, 상품, 카테고리 정보를 배열(Array)에 저장하고 관리
 * - 데이터 전담 클래스를 객체로 생성하여 기초 데이터 생성 작업
 */
public class cafeManagementArray {
    public static void main(String[] args) {
        //데이터 전용 클래스 객체 생성, 생성자에서 데이터가 만들어진다.
        ArrayDatabase db = new ArrayDatabase();

        //카테고리 정보 출력
        Category[] dbCategories = db.getCategories(); // 데이터전담 객체에서 카테고리 정보 가져옴
        showCategories(dbCategories);

        //상품 정보 출력
        Product[] products = db.getProducts();
        showProducts(products);

        //사원 정보 출력
        Employee[] employees = db.getEmployees();
        showEmployee(employees);

        //주문 정보 출력
        Order[] orders = db.getOrders();
        showOrder(orders);


    }// end of main

    public static void showCategories(Category[] dbCategories) {
        System.out.println("카테고리 정보");
        System.out.println("카테고리번호\t카테고리명\t설명");
        System.out.println("==========================================");
        for (Category tempcat : dbCategories) {
            System.out.println(tempcat.getCategoryID() + "\t"  + tempcat.getName() + "\t" + tempcat.getDescription());
        }
    }

    public static void showProducts(Product[] products) {
        System.out.println("==========================================");
        System.out.println("상품 정보");
        System.out.println("상품ID\t상품명\t카테고리번호\t상품 가격");
        for (Product product : products) {
            System.out.println(product.getProductid() + "\t" + product.getName() + "\t"
                    + product.getCategoryId() + "\t" + product.getPrice());
        }
    }

    public static void showEmployee(Employee[] employees){
        System.out.println("==========================================");
        System.out.println("사원 정보");
        System.out.println("ID\t이름\t직급\t연봉");
        for(Employee employee : employees){
            System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"
                            +employee.getEmployeePosition()+"\t"+employee.getEmployeeSalary()
            );
        }
    }

    public static void showOrder(Order[] orders){
        System.out.println("==========================================");
        System.out.println("주문 정보");
        System.out.println("주문ID\t주문날짜\t상품ID\t처리직원ID\t상품수량");
        for(Order order : orders ){
            System.out.println(order.getOrderId()+"\t"+order.getOrderDate()+"\t"+
                    order.getProductId()+"\t"+order.getEmployeeId()+"\t"+order.getQuantity());
        }
    }

} //end of class

