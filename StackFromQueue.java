class StackFromQueue
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    q1.offer(a);	
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    if(q1.isEmpty())
	        return -1;
	    int i=1,size=q1.size();
	    while(i<size){
	        int x=q1.peek();
	        q1.offer(x);
	        q1.poll();
	        i++;
	    }
	    int x=q1.peek();
	    q1.poll();
	    return x;
    }
	
}
