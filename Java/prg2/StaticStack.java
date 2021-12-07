import stack.*;

class StaticStack extends Stack
{
	int[] arr;
	int size;
	StaticStack(int paramInt)
	{
		this.size = paramInt;
		this.arr = new int[this.size];
	}

	void push(int paramInt)
	{
		if (this.top == this.size - 1)
		{
			System.out.println("overflow");
		}
		else
		{
			this.arr[(++this.top)] = paramInt;
			System.out.println(paramInt+" pushed");
		}
	}

	int pop()
	{
		if (this.top == -1)
		{
			return -1;
		}
		return this.arr[(this.top--)];
	}

	void display()
	{
		System.out.println("The Stack is : ");
		for (int i = this.top; i>=0; i--)
		{
			System.out.println(this.arr[i] + " ");
		}
		System.out.println();
	}
}
