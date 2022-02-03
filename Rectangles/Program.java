class Program{
    public static void main(String[] args) {
        //Test samples
        Rectangle firstRec = new Rectangle(1, 4, 6, 7);
        Rectangle secondRec = new Rectangle(2, 5, 7, 8);
        System.out.println(FindIntersection(firstRec, secondRec).getDescription());
    }

    public static IntersectionType FindIntersection(Rectangle firstRec, Rectangle secondRec){
        if(

            //Only when two opposite (bottom and top) horizontal sides are located on the same Y-level and overlap,
            //the intersection will be a horizontal line

            //If the opposite (bottom and top) horizontal sides of two rectangles are located on the same Y-level
            (firstRec.bottomY == secondRec.topY || firstRec.topY == secondRec.bottomY) &&
                //And at least one point of a rectangle is located between two points of another rectangle
                ((firstRec.rightX > secondRec.rightX && firstRec.leftX < secondRec.rightX) ||
                (firstRec.rightX > secondRec.leftX && firstRec.leftX < secondRec.leftX))
        ){return IntersectionType.HorizontalLine;}
        else if(

            //Only when any of the next conditions is met, we can state that the rectangles do not intersect

            //If the right side of the first rectangle is located to the left of the left side of the second rectangle
            firstRec.rightX < secondRec.leftX ||
            //If the left side of the first rectangle is located to the right of the right side of the second rectangle
            firstRec.leftX > secondRec.rightX ||
            //If the top side of the first rectangle is located lower than the bottom side of the second rectangle
            firstRec.topY < secondRec.bottomY ||
            //If the bottom side of the first rectangle is located higher than the top side of the second rectangle
            firstRec.bottomY > secondRec.topY
        ){return IntersectionType.NoIntersection;}
        else{
            return IntersectionType.SomethingElse;
        }
    }
}
