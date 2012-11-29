package Work;
import java.util.ArrayList;
import java.util.Iterator;
public class BooksContainer implements Iterable<Books> {
	private static BooksContainer uniquee;
	private ArrayList<Books> list;
	private BooksContainer(){
		list = new ArrayList<Books>();
	}
	public static BooksContainer instance(){
		if(uniquee==null)
			uniquee = new BooksContainer();
		return uniquee;
	}
	public void add(Books b){
		if(!list.contains(b)){
			list.add(b);
		}
	}
	public void remove(Books b){
		if(list.contains(b))
			list.remove(b);
	}
	@Override
	public Iterator<Books> iterator() {
		return list.iterator();
	}
}
