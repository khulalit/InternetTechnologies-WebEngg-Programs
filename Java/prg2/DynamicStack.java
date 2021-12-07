import java.util.ArrayList;
import java.util.Scanner;
import stack.*;
class DynamicStack extends Stack
{
	ArrayList<Integer> arr;
	DynamicStack()
	{
		this.arr = new ArrayList<Integer>();
	}

	void push(int paramInt)
	{
		this.arr.add(++this.top, Integer.valueOf(paramInt));
		System.out.println(paramInt+" pushed");
	}

	int pop()
	{
		if (this.top == -1)
		{
			return -1;
		}
		return ((Integer)this.arr.remove(this.top--)).intValue();
	}

	void display()
	{
		System.out.println("The Stack is : ");
		for (int i = this.arr.size()-1; i>=0; i--)
		{
			System.out.println(this.arr.get(i) + " ");
		}
		System.out.println();
	}
}
