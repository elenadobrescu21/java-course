package ro.soundero;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "artist", "release", "title", "genre", "bitrate",
		"sample_rate", "duration", "filename", "samples_decoded",
		"given_duration", "start_offset", "version", "codegen_time",
		"decode_time" })
public class Metadata {

	@JsonProperty("artist")
	private String artist;
	@JsonProperty("release")
	private String release;
	@JsonProperty("title")
	private String title;
	@JsonProperty("genre")
	private String genre;
	@JsonProperty("bitrate")
	private Integer bitrate;
	@JsonProperty("sample_rate")
	private Integer sampleRate;
	@JsonProperty("duration")
	private Integer duration;
	@JsonProperty("filename")
	private String filename;
	@JsonProperty("samples_decoded")
	private Integer samplesDecoded;
	@JsonProperty("given_duration")
	private Integer givenDuration;
	@JsonProperty("start_offset")
	private Integer startOffset;
	@JsonProperty("version")
	private Double version;
	@JsonProperty("codegen_time")
	private Double codegenTime;
	@JsonProperty("decode_time")
	private Double decodeTime;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The artist
	 */
	@JsonProperty("artist")
	public String getArtist() {
		return artist;
	}

	/**
	 * 
	 * @param artist
	 *            The artist
	 */
	@JsonProperty("artist")
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Metadata withArtist(String artist) {
		this.artist = artist;
		return this;
	}

	/**
	 * 
	 * @return The release
	 */
	@JsonProperty("release")
	public String getRelease() {
		return release;
	}

	/**
	 * 
	 * @param release
	 *            The release
	 */
	@JsonProperty("release")
	public void setRelease(String release) {
		this.release = release;
	}

	public Metadata withRelease(String release) {
		this.release = release;
		return this;
	}

	/**
	 * 
	 * @return The title
	 */
	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	/**
	 * 
	 * @param title
	 *            The title
	 */
	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	public Metadata withTitle(String title) {
		this.title = title;
		return this;
	}

	/**
	 * 
	 * @return The genre
	 */
	@JsonProperty("genre")
	public String getGenre() {
		return genre;
	}

	/**
	 * 
	 * @param genre
	 *            The genre
	 */
	@JsonProperty("genre")
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Metadata withGenre(String genre) {
		this.genre = genre;
		return this;
	}

	/**
	 * 
	 * @return The bitrate
	 */
	@JsonProperty("bitrate")
	public Integer getBitrate() {
		return bitrate;
	}

	/**
	 * 
	 * @param bitrate
	 *            The bitrate
	 */
	@JsonProperty("bitrate")
	public void setBitrate(Integer bitrate) {
		this.bitrate = bitrate;
	}

	public Metadata withBitrate(Integer bitrate) {
		this.bitrate = bitrate;
		return this;
	}

	/**
	 * 
	 * @return The sampleRate
	 */
	@JsonProperty("sample_rate")
	public Integer getSampleRate() {
		return sampleRate;
	}

	/**
	 * 
	 * @param sampleRate
	 *            The sample_rate
	 */
	@JsonProperty("sample_rate")
	public void setSampleRate(Integer sampleRate) {
		this.sampleRate = sampleRate;
	}

	public Metadata withSampleRate(Integer sampleRate) {
		this.sampleRate = sampleRate;
		return this;
	}

	/**
	 * 
	 * @return The duration
	 */
	@JsonProperty("duration")
	public Integer getDuration() {
		return duration;
	}

	/**
	 * 
	 * @param duration
	 *            The duration
	 */
	@JsonProperty("duration")
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Metadata withDuration(Integer duration) {
		this.duration = duration;
		return this;
	}

	/**
	 * 
	 * @return The filename
	 */
	@JsonProperty("filename")
	public String getFilename() {
		return filename;
	}

	/**
	 * 
	 * @param filename
	 *            The filename
	 */
	@JsonProperty("filename")
	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Metadata withFilename(String filename) {
		this.filename = filename;
		return this;
	}

	/**
	 * 
	 * @return The samplesDecoded
	 */
	@JsonProperty("samples_decoded")
	public Integer getSamplesDecoded() {
		return samplesDecoded;
	}

	/**
	 * 
	 * @param samplesDecoded
	 *            The samples_decoded
	 */
	@JsonProperty("samples_decoded")
	public void setSamplesDecoded(Integer samplesDecoded) {
		this.samplesDecoded = samplesDecoded;
	}

	public Metadata withSamplesDecoded(Integer samplesDecoded) {
		this.samplesDecoded = samplesDecoded;
		return this;
	}

	/**
	 * 
	 * @return The givenDuration
	 */
	@JsonProperty("given_duration")
	public Integer getGivenDuration() {
		return givenDuration;
	}

	/**
	 * 
	 * @param givenDuration
	 *            The given_duration
	 */
	@JsonProperty("given_duration")
	public void setGivenDuration(Integer givenDuration) {
		this.givenDuration = givenDuration;
	}

	public Metadata withGivenDuration(Integer givenDuration) {
		this.givenDuration = givenDuration;
		return this;
	}

	/**
	 * 
	 * @return The startOffset
	 */
	@JsonProperty("start_offset")
	public Integer getStartOffset() {
		return startOffset;
	}

	/**
	 * 
	 * @param startOffset
	 *            The start_offset
	 */
	@JsonProperty("start_offset")
	public void setStartOffset(Integer startOffset) {
		this.startOffset = startOffset;
	}

	public Metadata withStartOffset(Integer startOffset) {
		this.startOffset = startOffset;
		return this;
	}

	/**
	 * 
	 * @return The version
	 */
	@JsonProperty("version")
	public Double getVersion() {
		return version;
	}

	/**
	 * 
	 * @param version
	 *            The version
	 */
	@JsonProperty("version")
	public void setVersion(Double version) {
		this.version = version;
	}

	public Metadata withVersion(Double version) {
		this.version = version;
		return this;
	}

	/**
	 * 
	 * @return The codegenTime
	 */
	@JsonProperty("codegen_time")
	public Double getCodegenTime() {
		return codegenTime;
	}

	/**
	 * 
	 * @param codegenTime
	 *            The codegen_time
	 */
	@JsonProperty("codegen_time")
	public void setCodegenTime(Double codegenTime) {
		this.codegenTime = codegenTime;
	}

	public Metadata withCodegenTime(Double codegenTime) {
		this.codegenTime = codegenTime;
		return this;
	}

	/**
	 * 
	 * @return The decodeTime
	 */
	@JsonProperty("decode_time")
	public Double getDecodeTime() {
		return decodeTime;
	}

	/**
	 * 
	 * @param decodeTime
	 *            The decode_time
	 */
	@JsonProperty("decode_time")
	public void setDecodeTime(Double decodeTime) {
		this.decodeTime = decodeTime;
	}

	public Metadata withDecodeTime(Double decodeTime) {
		this.decodeTime = decodeTime;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Metadata withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
