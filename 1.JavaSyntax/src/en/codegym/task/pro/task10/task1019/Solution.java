package en.codegym.task.pro.task10.task1019;

import java.util.Calendar;

/* 
Current year
*/

public class Solution {

    private void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    private int currentYear;


    public  Solution() {
        setCurrentYear(Calendar.getInstance().get(Calendar.YEAR));
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getCurrentYear());

    }
}