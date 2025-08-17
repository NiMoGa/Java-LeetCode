class LinkedList
{
    int val;
    LinkedList next;

    LinkedList()
    {
        this.val = 0;
        this.next = null;
    }
    LinkedList(int val)
    {
        this.val = val;
        this.next = null;
    }
    LinkedList(int val,LinkedList next)
    {
        this.val = val;
        this.next = next;
    }
}