public class Rectangle {
    private double length;
    private double height;
    private double area;
    
    public void setLength(double length) {
        this.length = length;
        setArea();
    }
    
    public void setHeight(double height) {
        this.height = height;
        setArea();
    }
    
    public void setArea() {
        this.area = length * height;
    }
    
    
    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        a.setHeight(2);
        a.setLength(3);
        a.setArea();
        System.out.println(a.area);
    }
}