
public class Documentary extends Movie {
	private String topic;
	private static final String TOPIC_UNDEFINED = "Topic Undefined";
	
	public Documentary(String title, int releaseYear, String topic) {
		super(title, releaseYear);
		this.topic = topic;
	}
	
	public Documentary(String title, int releaseYear) {
		super(title, releaseYear);
		this.topic = TOPIC_UNDEFINED;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += "\n\tTopic: " + topic;
		return s;
	}
}
