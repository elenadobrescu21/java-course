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
@JsonPropertyOrder({ "metadata", "code_count", "code", "tag" })
public class Track {

	@JsonProperty("metadata")
	private Metadata metadata;
	@JsonProperty("code_count")
	private Integer codeCount;
	@JsonProperty("code")
	private String code;
	@JsonProperty("tag")
	private Integer tag;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The metadata
	 */
	@JsonProperty("metadata")
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * 
	 * @param metadata
	 *            The metadata
	 */
	@JsonProperty("metadata")
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public Track withMetadata(Metadata metadata) {
		this.metadata = metadata;
		return this;
	}

	/**
	 * 
	 * @return The codeCount
	 */
	@JsonProperty("code_count")
	public Integer getCodeCount() {
		return codeCount;
	}

	/**
	 * 
	 * @param codeCount
	 *            The code_count
	 */
	@JsonProperty("code_count")
	public void setCodeCount(Integer codeCount) {
		this.codeCount = codeCount;
	}

	public Track withCodeCount(Integer codeCount) {
		this.codeCount = codeCount;
		return this;
	}

	/**
	 * 
	 * @return The code
	 */
	@JsonProperty("code")
	public String getCode() {
		return code;
	}

	/**
	 * 
	 * @param code
	 *            The code
	 */
	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}

	public Track withCode(String code) {
		this.code = code;
		return this;
	}

	/**
	 * 
	 * @return The tag
	 */
	@JsonProperty("tag")
	public Integer getTag() {
		return tag;
	}

	/**
	 * 
	 * @param tag
	 *            The tag
	 */
	@JsonProperty("tag")
	public void setTag(Integer tag) {
		this.tag = tag;
	}

	public Track withTag(Integer tag) {
		this.tag = tag;
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

	public Track withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
