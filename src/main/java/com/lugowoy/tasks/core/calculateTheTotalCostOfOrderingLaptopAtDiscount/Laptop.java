package com.lugowoy.tasks.core.calculateTheTotalCostOfOrderingLaptopAtDiscount;

import java.io.Serializable;
import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 15.06.2017. */

public class Laptop implements Cloneable, Serializable {

    private long idLaptop;

    private String brandName;

    private BigDecimal price;

    public Laptop() {
    }

    public Laptop(long idLaptop, String brandName, BigDecimal price) {
        this.idLaptop = idLaptop;
        this.brandName = brandName;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;

        Laptop laptop = (Laptop) o;

        if (idLaptop != laptop.idLaptop) return false;
        if (brandName != null ? !brandName.equals(laptop.brandName) : laptop.brandName != null) return false;
        return price != null ? price.equals(laptop.price) : laptop.price == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (idLaptop ^ (idLaptop >>> 32));
        result = 31 * result + (brandName != null ? brandName.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Laptop[" +
                "idLaptop=" + idLaptop +
                ", brandName='" + brandName + '\'' +
                ", price=" + price +
                ']';
    }

    @Override
    protected Laptop clone() throws CloneNotSupportedException {
        Laptop laptop = (Laptop) super.clone();
        laptop.setBrandName(this.brandName);
        laptop.setPrice(new BigDecimal(this.price.doubleValue()));
        return laptop;
    }

    public long getIdLaptop() {
        return idLaptop;
    }

    public void setIdLaptop(long idLaptop) {
        this.idLaptop = idLaptop;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
