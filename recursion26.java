// Number of dice rolls with target sum
// Senario : 4 -> 1, 2, 3, 4, 5, 6 
// 4 -> 1 + 1 + 1 + 1 | 4 -> 1 + 1 + 2 | 4 -> 1 + 2 + 1 | 4 -> 2 + 1 + 1 | 4 -> 2 + 2 | 4 -> 1 + 3 | 4 -> 3 + 1 | 4 -> 4
import java.util.ArrayList;

public class recursion26 {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(diceRet("", 4));
        
    }

    /**
     *
     * @param p
     * @param target
     */
    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i <=6 && i<=target; i++){
            dice(p + i, target - i);
        }
    }

    /**
     * 
     * @param p
     * @param target
     * @param face
     * @return 
     */
    static void diceFace(String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i <=face && i<=target; i++){
            diceFace(p + i, target - i, face);
        }
    }

    /**
     * 
     * @param p
     * @param target
     * @return arraylist of all dice rolls with target sum
     */
    static ArrayList<String> diceRet(String p, int target){
        if(target == 0){
           ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for(int i = 1; i <=6 && i<=target; i++){
            list.addAll(diceRet(p + i, target - i));
        }
        return list;
    }

    /**
     * 
     * @param p
     * @param target
     * @param face
     * @return 
     */
    static ArrayList<String> diceFaceRet(String p, int target, int face){
        if(target == 0){
           ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for(int i = 1; i <=6 && i<=target; i++){
            list.addAll(diceFaceRet(p + i, target - i, face));
        }
        return list;
    }

    
}
