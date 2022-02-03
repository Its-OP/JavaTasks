public class Rectangle {
    public int leftX;
    public int rightX;
    public int bottomY;
    public int topY;
    //For sake of simplicity, I suppose that users' values will always make sence (e.g. rightX is always greater than leftX etc.)
    public Rectangle(int leftX, int rightX, int bottomY, int topY){
        this.leftX = leftX;
        this.rightX = rightX;
        this.bottomY = bottomY;
        this.topY = topY;
    }
}
