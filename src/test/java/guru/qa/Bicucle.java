package guru.qa;

public class Bicucle {

    static String firstCreationDate = "1878";

    String color;
    boolean isUsed;
    char size = 'm';
    int maxWeight;

    public Bicucle(String color, boolean isUsed, char size, int maxWeight) {
        this.color = color;
        this.isUsed = isUsed;
        this.size = size;
        this.maxWeight = maxWeight;
    }

    public Bicucle(String chrome, String aFalse, String m, String s) {
    }


    String getColor() {
        return color;
    }

    void setMaxWeight(int MaxWeight) {
        this.maxWeight = MaxWeight;
    }

    static void sayCreationDateForAllBicucles() {
        System.out.println(firstCreationDate);
    }




}
