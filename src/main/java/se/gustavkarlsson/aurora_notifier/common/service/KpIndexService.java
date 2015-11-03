package se.gustavkarlsson.aurora_notifier.common.service;

import retrofit.Call;
import retrofit.http.GET;
import se.gustavkarlsson.aurora_notifier.common.domain.Timestamped;

public interface KpIndexService {

	@GET("/kp-index")
	Call<Timestamped<Float>> get();
}
