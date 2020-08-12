package absterface;
import absterface.QueueClass;
public class QueueMain {

	public static void main(String[] args) {
		QueueClass q1=new QueueClass(10);
		System.out.println(q1.q.length);
		q1.add(3456);
		q1.add(78567);
		q1.print();
		q1.remove();
		q1.print();
	}
}
