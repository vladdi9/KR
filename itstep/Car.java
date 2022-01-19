package org.itstep;

public class Car {
    private String carBrand;
    private int loadСapacity;
    private String driver;
    private String status;
    private String march;
    private String cargo;

    public Car(String carBrand, int loadСapacity, String driver, String status, String march, String cargo) {
        this.carBrand = carBrand;
        this.loadСapacity = loadСapacity;
        this.driver = driver;
        this.status = status;
        this.march = march;
        this.cargo = cargo;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public int getLoadСapacity() {
        return loadСapacity;
    }

    public String getDriver() {
        return driver;
    }

    public String getStatus() {
        return status;
    }

    public String getMarch() {
        return march;
    }
    public String getCargo() {
        return cargo;
    }


    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setLoadСapacity(int loadСapacity) {
        this.loadСapacity = loadСapacity;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMarch(String march) {
        this.march = march;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Бренд машины='" + carBrand + '\'' +
                ", Грузоподъёмность=" + loadСapacity +
                ", Водитель='" + driver + '\'' +
                ", Статус='" + status + '\'' +
                ", Маршут='" + march + '\'' +
                ", Груз='" + cargo + '\'' +
                '}';
    }
}
