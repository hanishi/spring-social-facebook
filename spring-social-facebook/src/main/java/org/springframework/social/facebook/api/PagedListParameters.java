/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.facebook.api;

/**
 * Carries parameters to describe a paged set of results.
 * @author Craig Walls
 */
public class PagedListParameters {
	
	private final Integer limit;

	private final Integer offset;

	private final Long since;
	
	private final Long until;

	/**
	 * Constructs a PagedListParameters.
	 * @param limit The number of items to limit the list to.
	 * @param offset The offset into the full result list to start this list at.
	 * @param since The beginning timestamp bound for time-sensitive content (e.g., posts, comments, etc).
	 * @param until The ending timestamp bound for time-sensitive content (e.g., posts, comments, etc).
	 */
	public PagedListParameters(Integer limit, Integer offset, Long since, Long until) {
		this.limit = limit;
		this.offset = offset;
		this.since = since;
		this.until = until;
	}

	public Integer getLimit() {
		return limit;
	}

	public Integer getOffset() {
		return offset;
	}
	
	public Long getSince() {
		return since;
	}

	public Long getUntil() {
		return until;
	}
	
}
