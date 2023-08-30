package en.codegym.task.pro.task10.task1003;

/* 
Let's build a new business complex: CodeGym Business Center
*/

public class Skyscraper {
    private int floorCount;
    private String developer;

    public Skyscraper(){
        this.floorCount=5;
        this.developer="CodeGymDevelopment";
    }
    public Skyscraper(int floorCount, String developer){
        this.floorCount=floorCount;
        this.developer=developer;
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(5, "CodeGymDevelopment");
    }
}
