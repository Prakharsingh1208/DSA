public class Cars {
    private String model ;
    private String color ;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private int year ;

    public void carInfo(){
        System.out.println("Model: " + model + ", Color: " + color + ", Year: " + year);
    }
}
