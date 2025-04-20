public class RecursiveSquares {

    public static void drawSquare(double x, double y, double length) {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledSquare(x, y, length/2);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.square(x, y, length/2);
    }

    public static void draw(int n, double x, double y, double length) {
        if (n == 0) return;
        
        // Draw the larger squares first
        draw(n-1, x - length/2, y + length/2, length/2);  // upper left
        draw(n-1, x + length/2, y + length/2, length/2);  // upper right
        
        // Draw the main square
        drawSquare(x, y, length);
        
        // Draw the smaller squares after
        draw(n-1, x - length/2, y - length/2, length/2);  // lower left
        draw(n-1, x + length/2, y - length/2, length/2);  // lower right
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        draw(n, 0.5, 0.5, 0.5);
    }
}
