package com.singtel.D1;

public class Duck extends Bird {
	@Override
	public boolean swim() {
		return true;
	}

	@Override
	public boolean walk() {
		return true;
	}

	@Override
	public boolean fly() {
		return true;
	}

	@Override
	public boolean sing() {
		return false;
	}
}
