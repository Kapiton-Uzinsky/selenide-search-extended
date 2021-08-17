package guru.qa;

public class Main {

    public static void main(String[] args) {
        Bicucle bicucle = new Bicucle("chrome", "false", "m", "135");
        bicucle.color = "chrome";

        bicucle.setMaxWeight(135);

        Bicucle.sayCreationDateForAllBicucles();

        System.out.println(bicucle.getColor());
    }



}
