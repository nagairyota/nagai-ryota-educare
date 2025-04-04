public class Main2 {
    public static void main(String[] args) {
        double radius = 5.0;
        calculateCircle(radius);
    }
    public static void calculateCircle(double radius) {
        double area = radius * radius * Math.PI;
        double length = (radius + radius) * Math.PI;
        System.out.println("半径が5.0の場合:" + "\n円の面積:" + area + "\n円周" + length);
    }
}
