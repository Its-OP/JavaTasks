public enum IntersectionType {
    NoIntersection("No Intersection"),
    HorizontalLine("Horizontal Line"),
    SomethingElse("Something Else");

    private String description;

    IntersectionType(String overlapDescription){
        this.description = overlapDescription;
    }

    public String getDescription(){
        return this.description;
    }
}
