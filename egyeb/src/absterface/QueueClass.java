package absterface;
import absterface.QueueInterface;
public class QueueClass implements QueueInterface{
	public Object[] q;
	public QueueClass(int i) {
		this.q=new Object[i];
		for(int n=0; n<i ; n++) {
			q[n]=null;
		}
	}
	public void add(int e) {
		for (int i=q.length-1; i>-1; i--) {
			if (q[i]==null) {
				q[i]= e;
				i=-1;
			}
			}
		}
	public void remove() {
		for (int i=q.length-1; i>0; i--) {
			q[i]=q[i-1];
		}
	}	
	public boolean isEmpty() {
		for (int i=0; i< q.length; i++) {
			if (q[i]!=null) return true;
		}
		return false;
		
	}
	public void print() {
		for (int i=0; i< q.length; i++) {
			System.out.print(q[i]+",");
		}
	}
}
