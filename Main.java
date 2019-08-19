class Main {
    private static final IStackArray<Integer> stack = new StackArray<Integer>();

    public static void main(String[] args) {
        System.out.println("--------------------------------------");
        System.out.println(stack.isEmpty());
        System.out.println("--------------------------------------");
        String popped = getPoppedItem();
        System.out.println(popped);
        System.out.println("--------------------------------------");
        String peeked = getPeekedItem();
        System.out.println(peeked);
        System.out.println("--------------------------------------");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.display();
        System.out.println("--------------------------------------");
        popped = getPoppedItem();
        System.out.println(popped);
        System.out.println("--------------------------------------");
        stack.display();
        System.out.println("--------------------------------------");
        peeked = getPeekedItem();
        System.out.println(peeked); 
        System.out.println("--------------------------------------");
        stack.display();
        System.out.println("--------------------------------------");
        System.out.println(stack.isEmpty());
        System.out.println("--------------------------------------");
        stack.clear();
        stack.display();
        System.out.println("--------------------------------------");
        System.out.println(stack.isEmpty());
    }

    private static String getPoppedItem() {
        String item;
        try {
            Integer value = stack.pop();
            item = Integer.toString(value);
        } catch (EmptyArrayException exception) {
            item = exception.getMessage();
        }

        return item;
    }

    private static String getPeekedItem(){
        String item;
        try {
            Integer value = stack.peek();
            item = Integer.toString(value);
        } catch (EmptyArrayException exception) {
            item = exception.getMessage();
        }

        return item;
    }
}