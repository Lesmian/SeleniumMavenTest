import org.testng.annotations.Test;

public class Student {
    String nazwisko = "Lesniczek";
    String imie = "Lukasz";

    @Test
    public void przedstawsie(){
        System.out.println("Nazwywam sie " + imie + " " + nazwisko);
    }
}
