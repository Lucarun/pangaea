package edu.fudan.rosefinch.nest;

class Address {
    String city;
    
    public Address(String city) {
        this.city = city;
    }
    
    public String getCity() {
        return city;
    }
}

class Person {
    Address address;
    
    public Person(Address address) {
        this.address = address;
    }
    
    public Address getAddress() {
        return address;
    }
}

class Company {
    Person employee;
    
    public Company(Person employee) {
        this.employee = employee;
    }
    
    public Person getEmployee() {
        return employee;
    }
}

public class AccessPathExample {
    public static void main(String[] args) {
        Address address = new Address("New York");
        Person person = new Person(address);
        Company company = new Company(person);
        
        // 深度为3的访问路径：company.employee.address.city
        System.out.println(company.getEmployee().getAddress().getCity());
    }
}
