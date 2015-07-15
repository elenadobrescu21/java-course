package ro.soundero;
import java.util.*;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws Exception {
	    String file_in = "MediaProMusic.json";
	    String file_out = "out.json";
	    List<Producator> producers = new ArrayList<Producator>();
	    Set<String> artists = new HashSet<String>();
	   
	    
	    
	    for( String arg:args) {
	    	Producator p = new Producator(args[0], "out1.json");
	    	p.getTracks();
	    	producers.add(p);	     
	    }	
	    for( Producator p:producers) {
	    	for(Track t:p.getTracks()) {
	    		String s = t.getMetadata().getArtist();
	    		artists.add(s);
	    	}
	    	
	    }
	    for(String s:artists) {
	    	System.out.println(s);
	    }
	    System.out.println("Numarul de artisti: " + artists.size());
	}
	
}