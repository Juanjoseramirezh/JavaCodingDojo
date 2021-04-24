package org.mapahasmatique;

import java.util.HashMap;
import java.util.Set;


public class hasmatique {

	public void generateTrackList(HashMap<String, String> trackList) {
		
		trackList.put("track1","lyrics1");
		trackList.put("track2","lyrics2");
		trackList.put("track3","lyrics3");
		trackList.put("track4","lyrics4");
		
		String name = trackList.get("track2");
		System.out.println("El track seleccionado es: " + name);
		
		
		Set<String> keys = trackList.keySet();
		for (String key : keys) {
			System.out.println(key + " : " + trackList.get(key));
	
		}
	}
	
}
