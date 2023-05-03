package adapter;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapAdapter extends AbstractMap {
	
	private Map miaMappa; 
	
	public MapAdapter(Object[][] array) { 
	    super(); 
	    miaMappa = new HashMap(); 
	    for(Object[] mapping : array) { 
	    	miaMappa.put(mapping[0], mapping[1]); 
	    } 
	}

	@Override
	public Set entrySet() {
		return miaMappa.entrySet();
	}

}
