public class stackMain {
    public static void main(String[] args) throws stack_exception{
        StackCustom stack = new StackCustom(5); //this will give error if we try to add more than 5 items
        //StackDynamic stack = new StackDynamic(5);
        //by this item will be added to stack


        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        //stack.push(60);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
    
}
