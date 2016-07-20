public Node reverseListRecursive(Node curr)
{
    if(curr == null){//Base case
        return head;
    }
    else{
        (reverseListRecursive(curr.next)).next = (curr);
    }
    return curr;
}