class LLrevIter
{

     Node reverseList(Node head)
    {

        Node prev=null,curr=head,next=null;

        while(curr!=null){

            next=curr.next;

            curr.next=prev;

            prev=curr;

            curr=next;

        }
        return prev;

    }

}