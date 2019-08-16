class Main {
    private static final IStackArray<Integer> myStack = new StackArray<Integer>();

    public static void main(String[] args) {
        System.out.println("--------------------------------------");
        System.out.println(myStack.isEmpty());
        System.out.println("--------------------------------------");
        String popped = getPoppedItem();
        System.out.println(popped);
        System.out.println("--------------------------------------");
        String peeked = getPeekedItem();
        System.out.println(peeked);
        System.out.println("--------------------------------------");
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.display();
        System.out.println("--------------------------------------");
        popped = getPoppedItem();
        System.out.println(popped);
        System.out.println("--------------------------------------");
        myStack.display();
        System.out.println("--------------------------------------");
        peeked = getPeekedItem();
        System.out.println(peeked); 
        System.out.println("--------------------------------------");
        myStack.display();
        System.out.println("--------------------------------------");
        System.out.println(myStack.isEmpty());
        System.out.println("--------------------------------------");
        myStack.clear();
        myStack.display();
        System.out.println("--------------------------------------");
        System.out.println(myStack.isEmpty());
    }

    private static String getPoppedItem() {
        String item;
        try {
            Integer value = myStack.pop();
            item = Integer.toString(value);
        } catch (EmptyArrayException exception) {
            item = exception.getMessage();
        }

        return item;
    }

    private static String getPeekedItem(){
        String item;
        try {
            Integer value = myStack.peek();
            item = Integer.toString(value);
        } catch (EmptyArrayException exception) {
            item = exception.getMessage();
        }

        return item;
    }
}