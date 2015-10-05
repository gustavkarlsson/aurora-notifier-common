package se.gustavkarlsson.aurora_notifier.common.domain;

public final class Timestamped<T> {

	private T value;
	private long timestamp;

	private Timestamped() {
		// Required by serialization libraries
	}

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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Timestamped that = (Timestamped) o;

		if (timestamp != that.timestamp) return false;
		if (value != null ? !value.equals(that.value) : that.value != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = value != null ? value.hashCode() : 0;
		result = 31 * result + (int) (timestamp ^ (timestamp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "Timestamped{" +
				"value=" + value +
				", timestamp=" + timestamp +
				'}';
	}
}
