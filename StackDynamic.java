public class StackDynamic extends StackCustom{

    public StackDynamic() {
        super(); //it will call StackCustom() constructor from StackCustom.java
    }

    public StackDynamic(int size) {
        super(size); //it will call StackCustom(int size) constructor from StackCustom.java
    }

    @Override
    public boolean push(int item) {
        //this takes care of being full
       if(this.isFull()){
        // double the array size
        int[] temp = new int[data.length * 2];

        //copy all previous items in new data
         for(int i = 0; i < data.length; i++){
             temp[i] = data[i];
         }

         data = temp;
       }

       //at this point we know that array is not full
       //insert item
       return super.push(item);


    }

    
}
