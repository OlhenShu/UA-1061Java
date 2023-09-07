package com.softserve.java.edu08;

//TODO
//Create a class called Department that contains a name field of String type and an address field of Address type.
//In the Department class, create an inner class called Address with has city and street fields of String type and building field of type int.
//In main() method, create an instance for one department and initialize it.
//Then, create one more department by cloning previously created department and change the city for this object.
//Output information about all departments to the console.
public class Department implements Cloneable {
    private String name;
    private Address address;

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static class Address implements Cloneable {
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public int getBuilding() {
            return building;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public Address clone() throws CloneNotSupportedException {
            return (Address) super.clone();
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }
    }

    @Override
    public Department clone() throws CloneNotSupportedException {
        Department cloned = (Department) super.clone();
        cloned.address = this.address.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }


}

class DemoDepartment {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department1 = new Department("HR",
                new Department.Address("Sumy", "Kharkivska", 5));
        Department department2 = department1.clone();
        department2.getAddress().setCity("Kharkiv");
        System.out.println(department1);
        System.out.println(department2);
    }
}
