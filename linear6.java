// Find Numbers with Even Number of Digits
// Example:
// Input: nums = [12,345,2,6,7896]
// Output: 2
// Explanation: 
// 12 contains 2 digits (even number of digits). 
// 345 contains 3 digits (odd number of digits). 
// 2 contains 1 digit (odd number of digits). 
// 6 contains 1 digit (odd number of digits). 
// 7896 contains 4 digits (even number of digits).
public class linear6 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
        System.out.println(digits(345678));
        System.out.println(digits2(345678346));

    }

    /**
     * 
     * @param nums
     * @return count of numbers with even digits
     */
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    /**
     * 
     * @param num
     * @return true if number of digits in num is even
     */
    //function to check whether a number contains even digits or not
    static boolean even(int num){
        int numberofDigits = digits(num);
        return numberofDigits%2==0;
    }

    /**
     * 
     * @param num
     * @return number of digits in num
     */
    //count no of digits in a number - using log
    static int digits2(int num){
        return (int)(Math.log10(num)) + 1;
    }
    
    /**
     * 
     * @param num
     * @return number of digits in num
     */
    //count no of digits in a number - using while loop
    static int digits(int num){
        int count = 0;

        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
