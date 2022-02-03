public enum IntersectionType {
    NoIntersection("No Intersection"),
    HorizontalLine("Horizontal Line"),
    SomethingElse("Something Else");

    private String description;

    IntersectionType(String intersectionDescription){
        this.description = intersectionDescription;
    }

    public String getDescription(){
        return this.description;
    }
}
