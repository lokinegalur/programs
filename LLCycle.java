public class LLCycle{
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode sl=head,fst=head;
        while(fst!=null && fst.next!=null){
            sl=sl.next;
            fst=fst.next.next;
            if(sl==fst)
                return true;
        }
        return false;
    }
}