package elena;
import java.util.*;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class MainTest {

	static Logger logger = Logger.getLogger(MainTest.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) throws RazaNegativaException,LungimeNegativaException,
	LatimeNegativaException {
		// TODO Auto-generated method stub
		
		BasicConfigurator.configure();
		
		
		List<Shape> shapes = new ArrayList<Shape>();
		List<Shape> shapes2 = new ArrayList<Shape>();
		
		shapes.add(new Circle(3,2,5,6));
		shapes.add(new Rectangle(3,4,1,2,3));
		shapes.add(new Circle(5,6,1,2));
		shapes.add(new Rectangle(1,2,4,5,6));
		shapes.add(new Rectangle(10,20,30,45,11));
		
		shapes2.add(new Circle(5,1,2,4));
		shapes2.add(new Rectangle(5,6,1,2,3));
		shapes2.add(new Circle (3,2,1,1));
		shapes2.add(new Circle(5,6,1,3));
		
		logger.debug(shapes.get(0).toString());
		Collections.sort(shapes,new Comparator<Shape>() {

			public int compare(Shape o1, Shape o2) {
				// TODO Auto-generated method stub
				return (int)(o1.getArie()-o2.getArie());
			
			} 
			
		});
		logger.trace("hello");
		
		logger.debug("Sortarea dupa arie:");
		for(Shape s : shapes) {
			logger.debug("Aria: " + s.getArie());
		}
		
		Collections.reverse(shapes);
		Shape s1 = Collections.max(shapes, new Comparator<Shape>() {

			public int compare(Shape o1, Shape o2) {
				return (int)(o1.getPerimetru()-o2.getPerimetru());		
			}
			});
		
		logger.debug("Perimetrul maxima este: " + s1.getPerimetru());
		Map<String, List<Shape>> map = new HashMap<String, List<Shape>>();
		
		map.put("layer1", shapes);
		map.put("layer2", shapes2);
		
		map.remove("layer1");
		Set set =map.entrySet();
	    Iterator i = set.iterator();
	    logger.debug("Elementele hashmapului:");
	    while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         logger.debug(me.getKey() + ": ");
	         logger.debug(me.getValue().toString());
	      }
	  
	    List<Shape> myList = new ArrayList<Shape>();
	    myList.addAll(shapes);
	    myList.addAll(shapes2);
	   
	   logger.debug("Lista reunita");
	   for(Shape s: myList) {
		   logger.debug(s.toString());
	   }
	    
	   for(Shape s: myList) {
		  if( Collections.frequency(myList, s) > 1) {
			  logger.debug("Obiectul este duplicat ");
		  }
			  
	   }
	   
	   Set<Shape> mySet = new HashSet<Shape>();
	   mySet.addAll(myList);
	 
	   if( mySet.contains(new Rectangle(10,20,30,45,11)))  {
		   logger.debug("Obiectul se afla deja in set");
	   }
	   else {
		   logger.debug("obiectul nu se gaseste ");
	   }
	   
	   int cores = Runtime.getRuntime().availableProcessors();
	   logger.info("Procesoare" + cores);
	            
	}
}


