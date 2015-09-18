package se.gustavkarlsson.aurora_notifier.common.service;

import retrofit.http.GET;
import se.gustavkarlsson.aurora_notifier.common.domain.KpIndexReport;

public interface KpIndexService {

	@GET("/kp-index")
	KpIndexReport getKpIndex();
}
