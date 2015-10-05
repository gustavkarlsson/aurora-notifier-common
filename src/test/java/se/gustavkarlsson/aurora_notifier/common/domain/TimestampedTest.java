package se.gustavkarlsson.aurora_notifier.common.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TimestampedTest {

	private static final ObjectMapper MAPPER = new ObjectMapper();

	public static final Timestamped<String> VALUE = new Timestamped<String>("foobar", 1444033913849l);
	public static final String JSON = "{\"value\": \"foobar\", \"timestamp\": 1444033913849}";

	@Test
	public void serializesToJSON() throws Exception {
		final String expected = MAPPER.writeValueAsString(VALUE);
		assertThat(MAPPER.writeValueAsString(VALUE)).isEqualTo(expected);
	}

	@Test
	public void deserializesFromJSON() throws Exception {
		assertThat(MAPPER.readValue(JSON, Timestamped.class)).isEqualTo(VALUE);
	}

	@Test
	public void equalsContract() {
		EqualsVerifier.forClass(Timestamped.class).suppress(Warning.NONFINAL_FIELDS).verify();
	}
}
