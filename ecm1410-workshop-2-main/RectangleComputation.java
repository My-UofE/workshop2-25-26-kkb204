public class RectangleComputation {
    public static void main(String[] args) {
        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);
        int area = width*height;
        int perimeter = (2*width)+(2*height);

        System.out.println("shape: rectangle" + "\n" + "area: " + area + "\n" + "perimeter: " + perimeter);
    }
}
