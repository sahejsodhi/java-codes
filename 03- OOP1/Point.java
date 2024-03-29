public class Point {
    
    private int x;
    private int y;
    
    public Point() {
        
    }
    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double distance() {
        return Math.sqrt((double)(x*x + y*y));
    }
    public double distance(int x, int y) {
        return Math.sqrt((double)((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y)));
    }
    public double distance(Point p) {
        return Math.sqrt((double)((p.x-this.x)*(p.x-this.x) +(p.y-this.y)*(p.y-this.y)));
    }
}
