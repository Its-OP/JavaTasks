class Program{
    public static void main(String[] args) {
        //Test samples
        Rectangle firstRec = new Rectangle(1, 4, 6, 7);
        Rectangle secondRec = new Rectangle(2, 5, 7, 8);
        System.out.println(FindIntersection(firstRec, secondRec).getDescription());
    }

    public static IntersectionType FindIntersection(Rectangle firstRec, Rectangle secondRec){
        if(
            //If the opposite horizontal sides of two rectangles are located on the same Y-level
            (firstRec.bottomY == secondRec.topY || firstRec.topY == secondRec.bottomY) &&
                //And at least one point of a rectangle is located between two points of another rectangle
                ((firstRec.rightX > secondRec.rightX && firstRec.leftX < secondRec.rightX) ||
                (firstRec.rightX > secondRec.leftX && firstRec.leftX < secondRec.leftX))
        ){return IntersectionType.HorizontalLine;}
        else if(
            //If the opposite horizontal sides of two rectangles are located on the same Y-level
            ((firstRec.bottomY == secondRec.topY || firstRec.topY == secondRec.bottomY) &&
                //And the opposite points of two rectangles coincide
                (firstRec.rightX == secondRec.leftX || firstRec.leftX == secondRec.rightX)) ||
            //Or the opposite vertical sides of two rectangles are located on the same X-level
            ((firstRec.leftX == secondRec.rightX || firstRec.rightX == secondRec.leftX) &&
                //And the opposite points of two rectangles coincide
                (firstRec.topY == secondRec.bottomY || firstRec.bottomY == secondRec.topY))
        ){return IntersectionType.SinglePoint;}
        else{
            return IntersectionType.SomethingElse;
        }
    }
}
