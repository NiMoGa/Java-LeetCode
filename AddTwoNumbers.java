
public class AddTwoNumbers {

public static LinkedList AddList(LinkedList l1, LinkedList l2)
{
    LinkedList res,temp;
    int sum=0, carry = 0;
    res = new LinkedList(0);
    temp = res;

    while ((l1!=null || l2!=null) || carry != 0)
    {
        
        sum = carry;
        sum += l1 != null ? l1.val : 0; // If l1 is not null, add its value
        sum += l2 != null ? l2.val : 0; // If l2 is not null, add its value
        l1 = l1 != null ? l1.next : null; // Move to the next node if l1 is not null
        l2 = l2 != null ? l2.next : null; // Move to the next node if l2 is not null
        temp.next = new LinkedList(sum % 10); // Create a new node with the digit
        temp = temp.next;
        carry = sum/10;
    }
    res = res.next; // Skip the initial dummy node
    return res;
}

public static void main(String args[])
{
   
// Create first linked list: 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9
LinkedList l1 = new LinkedList(9);
l1.next = new LinkedList(9);
l1.next.next = new LinkedList(9);
l1.next.next.next = new LinkedList(9);
l1.next.next.next.next = new LinkedList(9);
l1.next.next.next.next.next = new LinkedList(9);
l1.next.next.next.next.next.next = new LinkedList(9);

// Create second linked list: 9 -> 9 -> 9 -> 9
LinkedList l2 = new LinkedList(9);
l2.next = new LinkedList(9);
l2.next.next = new LinkedList(9);
l2.next.next.next = new LinkedList(9);

LinkedList result = AddList(l1, l2);

// Print the result linked list
LinkedList curr = result;
while (curr != null) {
    System.out.print(curr.val);
    if (curr.next != null) {
        System.out.print(" -> ");
    }
    curr = curr.next;
}
System.out.println();


}
    
}


/* 
Runtime
1
ms
Beats
100.00%
 */