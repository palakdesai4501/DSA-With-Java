//flip an image 
//110 - 1.Reverse -> 011,  2.complement -> 100
//101 - 1.Reverse -> 101,  2.complement -> 010
//000 - 1.Reverse -> 000,  2.complement -> 111
public class maths9 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };

        int[][] ans = flipAndInvertImage(arr);
        System.out.println(ans);
    }

    public static int[][] flipAndInvertImage(int[][] image){
        for(int[] row: image){
            //reverse this array
            for(int i=0; i<(image[0].length + 1)/2; i++){
                //swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length-i-1] ^ 1;
                row[image[0].length-i-1] = temp;
            }
        }
        return image;
    } 
}
