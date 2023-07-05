//Search if the target character is in the string or not
//If it is present in the string, return true otherwise return false
public class linear1 {
    public static void main(String[] args) {
        String name = "palak";
        char target = 'l';
        System.out.println(search(name, target));
    }

    /**
     * 
     * @param str
     * @param target
     * @return true or false
     */
    static boolean search(String str, char target ){
        if (str.length()==0){
            return false;
        }

        for(int i = 0; i < str.length(); i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
