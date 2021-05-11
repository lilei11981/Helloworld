package com.company.zoo.abc.demo26;

/**
 * @author lilei
 * @date 2020-08-21 13:39
 * @apiNote
 */

public class Address implements Cloneable {

    private String province;
    private String city;
    private String street;
    private int number;

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address1 = new Address();
        address1.setCity("123");
        Address clone = (Address) address1.clone();
        System.out.println(clone);
        clone.setCity("234");
        System.out.println(address1);
        System.out.println(clone);

    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (number != address.number) return false;
        if (!province.equals(address.province)) return false;
        if (!city.equals(address.city)) return false;
        return street.equals(address.street);
    }

    @Override
    public int hashCode() {
        int result = province.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + street.hashCode();
        result = 31 * result + number;
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Address address = (Address) super.clone();
        return super.clone();
    }
}
