package web.model;

public class Car {
    private String carBrand;
    private String carModel;
    private int year;

    public Car() {
    }

    public Car(String carBrand, String carModel, int year) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.year = year;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
