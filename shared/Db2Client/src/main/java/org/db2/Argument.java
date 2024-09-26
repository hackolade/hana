package org.db2;

public enum Argument {
	HOST("--host", 7),
	USER("--user", 7),
	PASSWORD("--pass", 7),
	PORT("--port", 7),
	QUERY("--query", 8),
	DATABASE("--database", 11),
	CALLABLE("--callable", 11),
	IN_PARAM("--inparam", 10);

	private final String argPrefix;
	private final int startValueIndex;

	Argument(String argPrefix, int startValueIndex) {
		this.argPrefix = argPrefix;
		this.startValueIndex = startValueIndex;
	}

	public String getPrefix() {
		return this.argPrefix;
	}

	public int getStartValueIndex() {
		return this.startValueIndex;
	}
}
