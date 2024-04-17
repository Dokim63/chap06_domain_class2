package com.javalab.cafe.excute;

import com.javalab.cafe.data.ArrayDatabase;
import com.javalab.cafe.data.ArrayListDatabase;
import com.javalab.cafe.domain.Category;
import com.javalab.cafe.domain.Employee;
import com.javalab.cafe.domain.Order;
import com.javalab.cafe.domain.Product;

import java.util.ArrayList;

public class cafeManagementArrayList {
    public static void main(String[] args) {
        ArrayListDatabase db = new ArrayListDatabase();


        // 카테고리 ArrayList 객체 얻기 - 카테고리 정보 출력
        ArrayList<Category> categories = db.getCategoryList();
        showCategoryList(categories);

        //상품 정보 출력
        ArrayList<Product> products = db.getProductList();
        showProductList(products);

        //주문 정보 출력
        ArrayList<Order> orders = db.getOrderList();
        showOrderList(orders);

        //사원 정보 출력
        ArrayList<Employee> employees = db.getEmployeeList();
        showEmployee(employees);

        //상품 데이터 출력 - 상품번호,상품명,카테고리id, 카테고리명, 가격
        showProductsWithCategoryName(categories, products);

        //주문 데이터 출력 -  주문 id, 주문일자 , 상품 id, 주문처리사원 id ,주문수량


        // 4월 17일 과제 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        showOrderWithCategoryProduct(orders, employees, products);
        //

    }// end of main


    //카테고리 정보 출력 메소드
    public static void showCategoryList(ArrayList<Category> categories) {
        System.out.println("카테고리 정보");
        System.out.println("카테고리번호\t카테고리명\t설명");
        System.out.println("==========================================");
        for (Category category : categories) {
            System.out.println(category.getCategoryID() + "\t" + category.getName() + "\t" + category.getDescription());
        }
    } //end of method


    // 상품 정보 출력 메소드
    public static void showProductList(ArrayList<Product> products) {
        System.out.println("==========================================");
        System.out.println("상품 정보");
        System.out.println("상품ID\t상품명\t카테고리번호\t상품 가격");
        for (Product product : products) {
            System.out.println(product.getProductid() + "\t" + product.getName() + "\t"
                    + product.getCategoryId() + "\t" + product.getPrice());
        }
    } //end of method


    // 주문 정보 출력 메소드
    public static void showOrderList(ArrayList<Order> orders) {
        System.out.println("==========================================");
        System.out.println("주문 정보");
        System.out.println("주문ID\t주문날짜\t상품ID\t처리직원ID\t상품수량");
        for (Order order : orders) {
            System.out.println(order.getOrderId() + "\t" + order.getOrderDate() + "\t" +
                    order.getProductId() + "\t" + order.getEmployeeId() + "\t" + order.getQuantity());
        }
    } // end of method


    // 사원 정보 출력 메소드
    public static void showEmployee(ArrayList<Employee> employees) {
        System.out.println("==========================================");
        System.out.println("사원 정보");
        System.out.println("ID\t이름\t직급\t연봉");
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeId() + "\t" + employee.getEmployeeName() + "\t"
                    + employee.getEmployeePosition() + "\t" + employee.getEmployeeSalary()
            );
        }
    }

    //(상품번호,상품명,카테고리id, 카테고리명, 가격) 출력 메소드
    public static void showProductsWithCategoryName(ArrayList<Category> categories, ArrayList<Product> products) {
        System.out.println("상품ID\t상품명\t카테고리번호\t카테고리명\t상품 가격");
        for (Product product : products) {
            int categoryId = product.getCategoryId(); //현재 상품의 카테고리ID
            String categoryName = "";
            //for문으로 카테고리 리스트에서 카테고리Id와 일치하는 카테고리 이름 찾기
            for (Category category : categories) {
                if (category.getCategoryID() == categoryId) {
                    categoryName = category.getName();
                    break;
                }
            }

//                for(Category category : categories){
//                    if(category.getCategoryID() == product.getCategoryId()){
//                        System.out.println(product.getProductid()+"\t"+product.getName()+"\t"+ product.getCategoryId()+"\t"+
//                                category.getName()+"\t"+product.getPrice());
//                }
            System.out.println(product.getProductid() + "\t" + product.getName() + "\t"
                    + product.getCategoryId() + "\t" + categoryName + "\t" + product.getPrice());
        }
    }



    //4월 17일 과제 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
    //주문 id, 주문일자 , 상품 id, 주문처리사원 이름 ,주문수량 메소드
    public static void showOrderWithCategoryProduct(ArrayList<Order> orders, ArrayList<Employee> employees, ArrayList<Product> products) {
        for (Order order : orders) {
            int employeeId = order.getEmployeeId();
            String employeeName = "";
            int productId = order.getProductId();
            String productName = "";

            for(Employee employee : employees) {
                if(employeeId == employee.getEmployeeId()) {
                    employeeName = employee.getEmployeeName();
                    break;
                }
            }


            for (Product product : products) {
                if (productId == product.getProductid()) {
                    productName = product.getName();
                    break;
                }
            }

                    System.out.println(order.getOrderId() + "\t" + order.getOrderDate() + "\t" + productName + "\t" +
                            employeeName + "\t" + order.getQuantity());
        }



    }
}
