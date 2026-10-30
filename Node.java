/* Create a generic class named Node that is based on the PrintNode method in D2L.
This is used to represent an entry in the reference-based linked list stack */

public class Node
{
private String job;
private Node link;
public Node ()
{
job = null;
link = null;
}
public Node (String job)
{
this.job = job;
link = null;
}
public Node(String job, Node link)
{
this.job = job;
this.link = link;
}
public void setLink (Node newLink)
{
link = newLink;
}
public void setJob (String newJob)
{
job = newJob;
}
public Node getLink ()
{
return link;
}
public String getJob ()
{
return job;
}
}