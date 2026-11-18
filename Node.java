/* This is used to represent an entry in the reference-based linked list stack */


 // changed PrintNode to make it more generic, took out "String" and replaced it with "T" to make it more generic
public class Node
{
private T job;
private Node<T> link;

public Node ()
{
job = null;
link = null;
}
public Node (T job)
{
this.job = job;
link = null;
}
public Node(T job, Node<T> link)
{
this.job = job;
this.link = link;
}
public void setLink (Node newLink)
{
link = newLink;
}
public void setJob (Node<T> newJob)
{
job = newJob;
}
public Node<T> getLink ()
{
return link;
}
public T getJob ()
{
return job;
}
}