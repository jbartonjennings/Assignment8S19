import java.io.*;

class ArrayIntList
{
	private int[] elementData;
	private int size;
	
	public ArrayIntList()
	{
		elementData = new int[100];
		size = 0;
	}
	public void add(int value)
	{
		elementData[size] = value;
		size++;
	}
	public void print()
	{
		if (size == 0)
		{
			System.out.println("[]");
		}
		else
		{
			System.out.print("[" + elementData[0]);
			for (int i = 1; i < size; i++)
				System.out.print(", " + elementData[i]);
			System.out.println("]");
		}
	}
	
		public void replaceAll (int val, int rep)
		{
			for (int i = 0; i < size; i++)
				if (elementData[i]==val)
					elementData[i]=rep;
		}

}

	public class ListDemo
	{
		public static void main(String[] args)
		{
			int[] data = {11, -7, 3, 42, 3, 0, 14, 3};
			
			ArrayIntList list1 = new ArrayIntList();
			for (int n : data)
			{
				list1.add(n);
				
			}
			System.out.print("List elements: ");
			list1.print();
			
			list1.replaceAll(3,999);
			System.out.println ("List elements after replacing with 999: ");
			list1.print();
			}
		}
	
