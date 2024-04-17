package com.javalab.cafe.domain;

/**
 * 사원 도메인 클래스
 * - 속성(멤버변수) : 직원 id, 직원명, 직급명, 급여
 */


public class Employee {
    private int employeeId; // 직원ID
    private String employeeName; // 직원명
    private String employeePosition; // 직급명
    private int employeeSalary; // 급여


    // 2. 기본생성, 파라미터가 없는 생성자
    public Employee() {
    }




    // 3. 생성자, 파라미터가 있는 생성자
    public Employee(int employeeId, String employeeName, String employeePosition, int employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePosition = employeePosition;
        this.employeeSalary = employeeSalary;
    }

    // 4. getter, setter 메서드
    public int getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public String getEmployeePosition(){
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition){
        this.employeePosition = employeePosition;
    }

    public int getEmployeeSalary(){
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary){
        this.employeeSalary = employeeSalary;
    }


    public static void employeeInfo(Employee[] employees){
        for(Employee emp : employees){
            System.out.println(emp.getEmployeeId()+" "+emp.getEmployeeName()+" "+emp.getEmployeePosition()+" "+ emp.getEmployeeSalary());
        }
    }
}
