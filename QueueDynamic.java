public class QueueDynamic extends QueueCircular{
    public QueueDynamic() {
        super(); //it will call StackCustom() constructor from StackCustom.java
    }

    public QueueDynamic(int size) {
        super(size); //it will call StackCustom(int size) constructor from StackCustom.java
    }

    @Override
    public boolean insert(int item) {
                  //this takes care of being full
       if(this.isFull()){
        // double the array size
        int[] temp = new int[data.length * 2];

        //copy all previous items in new data
         for(int i = 0; i < data.length; i++){
             temp[i] = data[(front + i) % data.length];
         }
         front = 0;
         end = data.length;
         data = temp;
       }
 
       //at this point we know that array is not full
       //insert item
        return super.insert(item);
    }

    

}
