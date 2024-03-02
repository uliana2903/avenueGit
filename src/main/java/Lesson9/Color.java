package Lesson9;

public enum Color {
    RED ("4748393"),
    BLUE ("48429"),
    GREEN ("4488935"),
    BLACK ("4488935"),
    YELLOW ("4488935");
    private String colorCode;

    Color(String colorCode) {
        this.colorCode = colorCode;
    }
    public String getColorCode (){
        return colorCode;
    }
}
