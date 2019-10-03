package duke.learn.spring.actuator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Kazi
 *
 */
@Component
@Endpoint(enableByDefault = true, id = "features")
public class FeatureEndpoint {

    private Map<String, Feature> features = new ConcurrentHashMap<>();

    public FeatureEndpoint() {
	features.put("books", new Feature("book", "Complete add, update, read, delete restful apis of books"));
    }

    @ReadOperation
    public Map<String, Feature> getFeatures() {
	return this.features;
    }

    public static class Feature {

	/**
	 * @param name
	 * @param description
	 */
	public Feature(String name, String description) {
	    super();
	    this.name = name;
	    this.description = description;
	}

	public Feature() {
	}

	private String name;
	private String description;

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public String getDescription() {
	    return description;
	}

	public void setDescription(String description) {
	    this.description = description;
	}

	@Override
	public String toString() {
	    return "Feature [name=" + name + ", description=" + description + "]";
	}

    }

}
