package proj1;

public class LinL {

	public static void main(String[] args) {
		LinL linkedlist1=new LinL();
		linkedlist1.addNewNode(10);
		linkedlist1.addNewNode(234);
		linkedlist1.addNewNode(-23423);
		linkedlist1.printLinl();
	}
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public Node head=null;
	public Node tail=null;
		public void  addNewNode(int data){
			Node newNode=new Node(data);
		
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode;
				tail=newNode;
			}
		}
		public void printLinl() {
			Node actual=head;
			if(head==null) {
				System.out.println("Empty");
			}
			else{
				while(actual!=null) {
					System.out.println(actual.data);
					actual=actual.next;
				}
			}
		}
		
	}
	


