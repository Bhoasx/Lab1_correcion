public class vector {
    private double x;
    private double y;

    public vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double magnitud() {
        return Math.sqrt(x * x + y * y);
    }

    public vector suma(vector v) {
        return new vector(this.x + v.x, this.y + v.y);
    }

    public double productoEscalar(vector v) {
        return this.x * v.x + this.y * v.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}