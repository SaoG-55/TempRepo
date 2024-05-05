package stackArray;

class StackTheory
{
			int capacity=0;
	        int top;
	        int arr[];
	        StackTheory(int capacity) 
	        {
	           
	            this.capacity=capacity;
	            this.arr=new int[capacity];
	            this.top=-1;
	        }
	        public void push(int num)
	         {
	             if(isFull()==1)
	             {
	                 return ;
	             }
	            //top=top+1;
	            arr[++top]=num;
	        }
	        public int pop()
	         {
	          // int poppedelement=arr[top];
	           
	           if(isEmpty()== 1)
	           {
	               return -1;
	           }
	           ;
	           return arr[top--];
	           
	        }
	        public int top() {
	            if(isEmpty()==1)
	            {
	                return -1;
	            }
	          
	           return arr[top];
	        }
	        public int isEmpty() {
	           if(top==-1)
	           {
	               return 1;
	           }
	           return 0;
	        }
	        public int isFull() {
	           if(top==capacity-1)
	           {
	               return 1;
	           }
	           return 0;
	        }
}

public class StackDemo 
{

	public static void main(String[] args) 
	{
		int capacity=5;
		StackTheory st=new StackTheory(5);
		st.push(2);
		st.push(4);
		st.push(6);
		st.push(8);
		
		System.out.println(st.top());
		System.out.println(st.pop());
		System.out.println(st.isEmpty());
		st.push(10);
		System.out.println(st.isFull());

	}

}
