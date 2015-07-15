package ro.eurovision;

import java.util.*;

public class JuryVote implements Vote {

	public Map<Participant,Integer> getPoints(List<Participant> participanti) {
		
		Map<Participant, Integer> finalVoteList = new HashMap<Participant, Integer>();
		Map<Participant, Float> intermediateVoteList = new HashMap<Participant, Float>();
		List<Float> punctaje = new ArrayList<Float>();
		for(Participant p: participanti) {
			int sum = 0;
			int[] juryVote = new int[5];
			for( int i =0 ; i < juryVote.length; i++) {
				juryVote[i] = rand.nextInt(10);
				sum = sum + juryVote[i];
			}
			float media = sum/5;
			intermediateVoteList.put(p, media);
			punctaje.add(media);
		}
		Collections.sort(punctaje);
		List<Float> firstTen = new ArrayList<Float>();
		firstTen = punctaje.subList(0, 9);
		Set<Map.Entry<Participant,Float>> set =intermediateVoteList.entrySet();
	    Iterator i = set.iterator();
	    while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         
	         for( Float punctaj: firstTen) {
	        	 if (me.getValue().equals(punctaj)) {
	        		 finalVoteList.put(me.getKey(),new Integer((int)punctaj));
	        	 }
	         }
	      
	      }
		
		
		
		
		
	}
}
