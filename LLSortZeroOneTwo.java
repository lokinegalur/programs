class LLSortZeroOneTwo
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        Node t=head;
        int arr[]=new int[3];
        while(t!=null){
            arr[t.data]++;            //store frequency of 0,1,2 in arr
            t=t.next;
        }
        t=new Node(0);
        arr[0]--;
        int i=0;
        Node p=t;
        while(i++<arr[0]){
            p.next = new Node(0);
            p=p.next;
        }
        i=0;
        while(i++<arr[1]){
            p.next = new Node(1);
            p=p.next;
        }
        i=0;
        while(i++<arr[2]){
            p.next = new Node(2);
            p=p.next;
        }
        return t;
    }
}
