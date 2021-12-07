import java.util.ArrayList;
import java.util.Scanner;

// abstract class stack=========================================================
abstract class Stack
{
	int top;
	Stack()
	{
		this.top = -1;
	}
	abstract void push(int paramInt);
	abstract int pop();
	abstract void display();
}

// dynamic stack class ie using arrayList for stack ===============================
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

// static stack class ie using array for stack ===============================
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

// Main class ie driver class
class Prg2
{
	public static void main(String[] paramArrayOfString)
	{
		Scanner localScanner = new Scanner(System.in);
		boolean condition = true;
		boolean run = true;
		StaticStack ss;
		DynamicStack ds = new DynamicStack();
		do {
			condition = true;
			System.out.println("Main Menu ,Enter");
			System.out.println("1.StaticStack");
			System.out.println("2.DynamicStack");
			System.out.println("3.Exit");
			int option = localScanner.nextInt();

			if(option == 1){
					System.out.println("Enter the stack size");
					int size = localScanner.nextInt();
					ss = new StaticStack(size);
				do {
					System.out.println("Static Stack");
					System.out.println("1.Push");
					System.out.println("2.Pop");
					System.out.println("3.Display");
					System.out.println("4.Main Menu");
					int m = localScanner.nextInt();
					if(m==1){
						System.out.println("Enter the element");
						int element = localScanner.nextInt();
						ss.push(element);
						
					}
					else if(m==2){
						int p = ss.pop();
						if(p==-1){
							System.out.println("no element");
						}
						else{
							System.out.println(p+" poped");
						}
						
					}
					else if(m==3){
						ss.display();
					}
					else if(m==4){
						condition = false;
					}
					else{
						condition = false;
					}
					
				} while (condition);
			}
			else if(option == 2){
				
				do {
					System.out.println("1.Push");
					System.out.println("2.Pop");
					System.out.println("3.Display");
					System.out.println("4.Main Menu");
					int m = localScanner.nextInt();
					if(m==1){
						System.out.println("Enter the element");
						int element = localScanner.nextInt();
						ds.push(element);
					}
					else if(m==2){
						int p = ds.pop();
						if(p==-1){
							System.out.println("no element");
						}
						else{
							System.out.println(p+" poped");
						}
					}
					else if(m==3){
						ds.display();
					}
					else if(m==4){
						condition = false;
					}
					else{
						condition = false;
					}
					
				} while (condition);
			}
			else if(option == 3){
				System.out.println("Exiting....");
				run = false;
				System.exit(0);
			}
			else{
				run = false;
			}
		} while (run);
		localScanner.close();	
	}
}