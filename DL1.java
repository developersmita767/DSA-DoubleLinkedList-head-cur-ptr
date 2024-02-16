import java.util.*;
class Node
{
	Node prev;
	int data;
	Node next;
}
class DL
{
	static Node head;
	static Scanner sc=new Scanner(System.in);
	static void create()
	{
	  Node cur=null,ptr=null;

	  char ch='y';
	  int c=0;
	 
	     while(ch=='y')
	  {
	    cur=new Node();
	    if(cur==null)
	    {
	     System.out.println("some problem");
	     break;
	    }
	    c++;
	     System.out.println("enter node"+c+"data");
	     cur.prev=cur;//new add
	     cur.data=sc.nextInt();
	     cur.next=cur;
	     if(head==null)
	     {
	       head=cur;
	     }
	     else
	     {
	       ptr.next=cur;
	       cur.prev=ptr;//new add
	       cur.next=head;
         head.prev=cur;
	     }
	     ptr=cur;
	      System.out.println("to creat new node press y");
	      ch=sc.next().charAt(0);
        }
	  }
	    static void fdisp()
        {
        if(head==null)
      {
       System.out.println("no elements");
       return;
      }
       System.out.println("elements are forward");
       Node ptr=head;
       do
       {
          System.out.println(ptr.data);//10
          ptr=ptr.next;
       }while(ptr!=head);
    }
       static void bdisp()
        {
        if(head==null)
      {
       System.out.println("no elements");
       return;
      }
       System.out.println("elements are backward");
       Node ptr=head.prev;
       do
       {
          System.out.println(ptr.data);
          ptr=ptr.prev;
       }while(ptr!=head.prev);
    }
     static void startinsert()
      {
       Node cur=new Node();
       System.out.println("enter 1st element");
       cur.data=sc.nextInt();
       cur.next=cur;
       cur.prev=cur;
       if(head==null)
       {
         head=cur;
         return;
       }
       head.prev.next=cur;
       cur.next=head;
       cur.prev=head.prev;
       head.prev=cur;
       head=cur;
    }
      static void startdelete()
      {
      if(head==null)
      {
         System.out.println("no elements");
         return;
      }
       System.out.println("delete elements"+head.data);
       if(head.next==head)
       {
         head=null;
         return;
       }
       head.prev.next=head.next;
       head.next.prev=head.prev;
       head=head.next;
    }
      static void endinsert()
      {
       Node cur=new Node();
       System.out.println("enter last element");
       cur.data=sc.nextInt();
       cur.next=cur;
       cur.prev=cur;
       if(head==null)
       {
         head=cur;
         return;
       }
       head.prev.next=cur;
       cur.prev=head.prev;
       cur.next=head;
       head.prev=cur;
       
    }
     static void enddelete()
      {
      if(head==null)
      {
         System.out.println("no elements");
         return;
      }
      if(head.next==head)
      {
         System.out.println("delete elements="+head.data);
         head=null;
         return;
      }
      head.prev=head.prev.prev;
       System.out.println("delete elements="+head.prev.next.data);
       head.prev.next.next=null;
       head.prev.next.prev=null;
       head.prev.next=head;
    }
 }
      class Test
     {
	       public static void main(String[] args)
	        {
	          DL.create();
	          DL.fdisp();
	          DL.bdisp();
	          DL.startinsert();
            DL.startinsert();
	          DL.startdelete();
	          DL.endinsert();
	          DL.fdisp();
	          DL.bdisp();
	          DL.enddelete();
	          DL.fdisp();
	          DL.bdisp();
            DL.enddelete();
            DL.enddelete();
            DL.fdisp();
            DL.bdisp();

	}
}

	

	
