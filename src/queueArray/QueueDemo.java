package queueArray;

//Circular Queue
class QueueImplement
{
	int front;
	int rear;
	int arr[];
	int capacity;
	int cnt;
	QueueImplement(int capacity)
	{
		this.capacity=capacity;
		this.front=0;
		this.rear=0;
		this.arr=new int[capacity];
		this.cnt=0;
	}
	
	public void Enqueue(int num)
	{
		if(cnt==capacity)
		{
			return ;//Full
		}
		
		arr[rear%capacity]=num;//circular
		rear++;
		cnt++;
	}
	
	public int Dequeue()
	{
		if(cnt==0)
		{
			return -1;//empty
		}
		
		int delele=arr[front%capacity];
		front++;
		cnt--;
		return delele;
	}
	
	public int peek()
	{
		//fifo 
		if(cnt==0)
		{
			return -1;
		}
		
		return arr[front%capacity];
	}
	
	public void show()
	{
		System.out.println("**elements**");
		for(int i=front;i<=rear-1;i++)
		{
			System.out.print(arr[i%capacity]+" ");
			
		}
		System.out.println();
	}
}
public class QueueDemo 
{

	public static void main(String[] args) 
	{
		int capacity=5;
		QueueImplement q=new QueueImplement(capacity);
		q.Enqueue(3);
		q.Enqueue(2);
		q.Enqueue(1);
		q.Enqueue(8);
		q.Enqueue(6);
		q.Enqueue(7);//Full
		q.show();
		System.out.println("Peek "+ q.peek());
		System.out.println("Pop "+ q.Dequeue());
		q.show();
		System.out.println("Peek "+ q.peek());
		q.Enqueue(100);//circular way implemented
		q.show();
		
	}

}
