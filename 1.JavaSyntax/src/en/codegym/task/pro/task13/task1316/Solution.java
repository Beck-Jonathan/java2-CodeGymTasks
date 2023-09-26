package en.codegym.task.pro.task13.task1316;

/* 
Let's list the CodeGym quests
*/

public class Solution {

    public static void main(String[] args) {
        CodeGymQuest[] CodeGymQuests = CodeGymQuest.values();

        for (CodeGymQuest Quest : CodeGymQuests){
            System.out.println(Quest.ordinal());
        }
    }
}
