package se.gustavkarlsson.aurora_notifier.common.domain;

public class Timestamped<T> {

	private T value;
	private long timestamp;

	public Timestamped(T value) {
		this.value = value;
		this.timestamp = System.currentTimeMillis();
	}

	public Timestamped(T value, long timestamp) {
		this.value = value;
		this.timestamp = timestamp;
	}

	public T getValue() {
		return this.value;
	}

	public long getTimestamp() {
		return this.timestamp;
	}
}
