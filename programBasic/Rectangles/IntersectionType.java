public enum IntersectionType {
    NoIntersection("No Intersection"),
    SinglePoint("Single Point"),
    HorizontalLine("Horizontal Line"),
    VerticalLine("Vertical Line"),
    Rectangle("Rectangle Type"),
    SomethingElse("Something Else");
    private String description;

    IntersectionType(String intersectionDescription){
        this.description = intersectionDescription;
    }

    public String getDescription(){
        return this.description;
    }
}
