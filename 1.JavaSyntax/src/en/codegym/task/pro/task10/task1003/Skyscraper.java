package en.codegym.task.pro.task10.task1003;

/* 
Let's build a new business complex: CodeGym Business Center
*/

public class Skyscraper {
    private int floorsCount;
    private String developer;

    public Skyscraper(){
        this.floorsCount=5;
        this.developer="CodeGymDevelopment";
    }
    public Skyscraper(int floors, String developer){
        this.floorsCount=floors;
        this.developer=developer;
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Unknown");
    }
}
