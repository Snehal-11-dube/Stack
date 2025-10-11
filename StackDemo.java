package DSA;

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
        s1.push(23);

        s1.pop();
        s1.pop();
        s1.pop();
    }
}