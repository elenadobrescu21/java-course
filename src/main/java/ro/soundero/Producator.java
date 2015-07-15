package ro.soundero;

import java.io.File;
import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Producator {

	private String inputFileName;
	private String outputFileName;
	private List<Track> tracks;

	public Producator(String inputFileName, String outputFileName) {
		this.inputFileName = inputFileName;
		this.outputFileName = outputFileName;
		tracks = null;

	}
	
	/**
	 * 
	 * daca lista e nula o initializeaza, altfel o returneaza
	 * @return lista de trackuri a unui producator
	 */

	public List<Track> getTracks() {

		if (tracks == null) {
			try {
				fixArtistTitleInJson(inputFileName);
			} catch (Exception e) {
				System.out.println("error: " + e.getMessage());
			}
		}

		return tracks;
	}

	public void fixArtistTitleInJson(String inputFilename) throws IOException,
			JsonParseException, JsonMappingException, JsonGenerationException {
		ObjectMapper mapper = new ObjectMapper();
		tracks = mapper.readValue(new File(inputFilename),
				new TypeReference<List<Track>>() {
				});

		for (int i = 0; i < tracks.size(); i++) {

			String from_file = tracks.get(i).getMetadata().getFilename();
			String[] myArray = from_file.split("/");

			String nameAndTitle = myArray[1];
			String subString1 = nameAndTitle.substring(0,
					nameAndTitle.length() - 16);

			String[] trackArray = subString1.split("-");

			if (trackArray.length == 1) {
				tracks.get(i).getMetadata().setTitle(trackArray[0]);
			} else {

				tracks.get(i).getMetadata().setArtist(trackArray[0]);
				tracks.get(i).getMetadata().setTitle(trackArray[1]);

			}
		}
		// mapper.writeValue(new File(outputFilename), tracks);
	}

}
