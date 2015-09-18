package se.gustavkarlsson.aurora_notifier.common.domain;

public class KpIndexReport {
	private float kpIndex;
	private long timestamp;

	public KpIndexReport(float kpIndex, long timestamp) {
		this.kpIndex = kpIndex;
		this.timestamp = timestamp;
	}

	public float getKpIndex() {
		return this.kpIndex;
	}

	public long getTimestamp() {
		return this.timestamp;
	}
}
