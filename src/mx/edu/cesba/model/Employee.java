/*
Nombre: Nelcy Aline Guerrero Rodrìguez
Matrìcula: 2022310
 */
package mx.edu.cesba.model;

/**
 *
 * @author nelcy
 */
public class Employee {

    //CAMPO: son las caracteristicas de un objeto.
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private int phoneNumber;
    private double salary;
    private String hireDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=18 && age<65){
            this.age= age;
        }else{
            System.err.println("Edad invalida");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    /*METODOS PARA ACCEDER AL CAMPO: PRIATE INT id;
    public void setid(int id) {
        this.id=id;
    }
    public int getid() {
        return id;
    }
    
    //METODOS PARA ACCEDER AL CAMPO: PRIATE STRING firtsName;
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getfirtsName() {
        return firstName;
    }
    
    //METODOS PARA ACCEDER AL CAMPO: PRIATE STRING lastName;
    public void setlastName(String lastName) { 
        this.lastName=lastName;
    }
    public String getlastName() {
        return lastName;
    }
    
    //METODOS PARA ACCEDER AL CAMPO: PRIATE INT age;
    public void setage(int age) {
        if(age>=18 && age<65){
            this.age= age;
        }else{
            System.err.println("Edad invalida");
        }
    }
    public int getage(int age) {
        return age;
    }
    
    //METODOS PARA ACCEDER AL CAMPO: PRIATE STRING email;
    public void setemail(String email) { 
        this.email=email;
    }
    public String getemail() {
        return email;
    }
    
    //METODOS PARA ACCEDER AL CAMPO: PRIATE INT  phoneNumber;
    public void setphoneNumber(int phoneNumber) {
        this.phoneNumber=phoneNumber;
    }
    public int getphoneNumber() {
        return phoneNumber;
    }
    
    
    //METODOS PARA ACCEDER AL CAMPO: PRIVATE DOUBLE  salary;
    public void setsalary(int salary) {
        this.salary=salary;
    }
    public double salary() {
        return salary;
    }

    //METODOS PARA ACCEDER AL CAMPO: PRIATE STRING hireDate;
    public void setphoneNumber(String hireDate) {
        this.hireDate=hireDate;
    }
    public String gethireDate() {
        return hireDate;
    }*/
    public void getDetails() { //METODO: son las acciones que realiza un objeto.
        System.out.println("Id: " + id);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Date: " + hireDate);

    }
    }
    
