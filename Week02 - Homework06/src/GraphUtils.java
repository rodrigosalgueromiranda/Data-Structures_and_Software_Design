

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * SD2x Homework #6
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the signature of any of the methods!
 */

public class GraphUtils {

	public static int minDistance(Graph graph, String src, String dest) {
		if (graph == null || src == null || dest == null ||
				!graph.containsElement(src) || !graph.containsElement(dest)) {
			return -1;
		}

		return 0;
	}
	

	public static Set<String> nodesWithinDistance(Graph graph, String src, int distance) {
		if (graph == null || src == null ||
				!graph.containsElement(src) || 
				distance < 1) {
			return null;
		}
		
		Set<String> result = new HashSet<String>();
		
		if (graph.getNumNodes() == 1) {
			return result;
		}
		
		return result;
	}


	public static boolean isHamiltonianPath(Graph g, List<String> values) {
		if (g == null || values == null || values.isEmpty()) {
			return false;
		}
		
		String src = values.get(0);
		Set<String> marked = new HashSet<>();
		marked.add(src);
		
		if (!src.equals(values.get(values.size() - 1)))
			return false;
		
		for (int i = 1; i < values.size(); i++) {
			if (!g.containsElement(values.get(i)))
				return false;
			
			if (marked.contains(values.get(i))
					&& i != (values.size() - 1))
				return false;
			
			if (!g.getNodeNeighbors(g.getNode(values.get(i-1))).contains(g.getNode(values.get(i)))) { // not connected
				return false;
			}
			marked.add(values.get(i));
		}
				
		return marked.size() == g.getNumNodes(); 
	}
	
}
