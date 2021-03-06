package com.github.gin.agama.scheduler;

import com.github.gin.agama.site.Request;

/**
 * @author  GinPonson
 */
public interface Scheduler {
	
	void push(Request request);
	
	Request poll();

	int left();
}
