package com.javalab.cafe.arraylist;

import com.javalab.cafe.domain.Employee;

import java.util.ArrayList;

public class ArrayListExample03 {
    public static void main(String[] args) {
        //Employee 타입의 객체를 저장할 수 있는 ArrayList 객체 생성
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(1001, "홍길동", "대리", 3000));
        employeeList.add(new Employee(1002, "김철수", "사원", 4300));
        employeeList.add(new Employee(1003, "이영희", "과장", 5500));


        // 첫번째 객체 출력
        System.out.println(employeeList.get(0).getEmployeeId() + " "
                + employeeList.get(0).getEmployeeName() + " "
                + employeeList.get(0).getEmployeePosition() + " "
                + employeeList.get(0).getEmployeeSalary());
        System.out.println("==================================");


        employeeListInfo(employeeList);

    } // end of main


    private static void employeeListInfo(ArrayList<Employee> employeeList) {
        for (Employee emp : employeeList)
            System.out.println(emp.getEmployeeId() + " " + emp.getEmployeeName() + " " + emp.getEmployeePosition() + " " + emp.getEmployeeSalary());

    }

}