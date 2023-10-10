package collections.lesson2;

//my stack realization using generics

public class SimpleStack<T> {
    private int maxSize;
    private Object[] stackArray;
    private int top;

    public SimpleStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new Object[maxSize];
        this.top = -1;
    }

    public void push(Object element) {
        stackArray[++top] = element;
    }

    public Object  pop() {
        return stackArray[top--].toString();
    }


    public Object  peek() {
        return stackArray[top].toString();
    }

    public boolean isEmpty() {
        return  top == -1;
    }
}

class StackMain {
    public static void main(String[] args) {
        SimpleStack simpleStack = new SimpleStack(10);
//        simpleStack.push(new Cat("SS"));
//        simpleStack.push(new Cat("DD"));
//        simpleStack.push(new Cat("RR"));
        simpleStack.push(1);
        simpleStack.push(2);
        simpleStack.push(3);

//        System.out.println(simpleStack.pop());
//        System.out.println(simpleStack.pop());
//        System.out.println(simpleStack.pop());
//        System.out.println(simpleStack.peek());
//        System.out.println(simpleStack.isEmpty());

        isEmpty(simpleStack);
    }

    private static void isEmpty(SimpleStack simpleStack) {
        while (!simpleStack.isEmpty()) {
            Object  popElement = simpleStack.pop();
            System.out.println(popElement + " ");
        }
    }
}

class Cat {

    public Cat(String name) {
        this.name = name;
    }

    String name;

    @Override
    public String toString() {
        return "name=" + name + "\n";
    }
}
