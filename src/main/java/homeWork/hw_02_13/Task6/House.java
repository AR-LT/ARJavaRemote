package homeWork.hw_02_13.Task6;

public class House {
    private String district, condition;
    private double houseArea;
    private int builtYear;
    public House (String district, String condition, double houseArea, int builtYear){
        this.houseArea = houseArea;
        this.district = district;
        this. condition = condition;
        this.builtYear = builtYear;
    }

    public String getDistrict() {
        return district;
    }

    public String getCondition() {
        return condition;
    }

    public double getHouseArea() {
        return houseArea;
    }

    public int getBuiltYear() {
        return builtYear;
    }
}
