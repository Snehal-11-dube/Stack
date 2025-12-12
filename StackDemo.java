package dsa;

class Stack
{
    int maxSize;
    int StackArray[];
    int top;

    Stack(int size)
    {
        maxSize = size;
        StackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value)
    {
        if(top == maxSize-1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            StackArray[++top] = value;
            System.out.println(value + " is pushed in Stack");
        }
    }

    public int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack underflow");
            return -1;
        }
        else
        {
            System.out.println( StackArray[top]+ " is popped");
            return StackArray[top--];
        }
    }

    //return top element
    public void top()
    {
        if(top == -1)
        {
            System.out.println("Stack underflow. Stack is Empty.");
        }
        else
        {
            System.out.println("Last(top) element of stack: " +StackArray[top] );
        }
    }

    public void display()
    {
        if(top == -1)
        {
            System.out.println("Stack underflow. Stack is Empty.");
        }
        else
        {
            System.out.println("Stack Elements: ");
            for(int i=0; i<=top; i++)
            {
                System.out.print(StackArray[i] +"\t" );
            }
            System.out.println();
        }
    }

    public boolean isFull()
    {
        return top == maxSize - 1;
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public int size()
    {
        return top + 1;
    }
}

class StackDemo
{
    public static void main(String s[])
    {
        Stack s1 = new Stack(5);
        s1.push(40);
        s1.push(50);
        s1.push(75);
        s1.push(4);
        s1.push(145);
        s1.push(23); // Stack overflow
        s1.display();
        s1.top();

        System.out.println("Current Stack Size: " + s1.size());
        System.out.println("Is Stack Full? " + s1.isFull());
        System.out.println("Is Stack Empty? " + s1.isEmpty() +"\n");

        s1.pop();
        s1.pop();
        s1.pop();
        s1.display();
        s1.top();

        System.out.println("Current Stack Size: " + s1.size());
        System.out.println("Is Stack Full? " + s1.isFull());
        System.out.println("Is Stack Empty? " + s1.isEmpty());

    }
}