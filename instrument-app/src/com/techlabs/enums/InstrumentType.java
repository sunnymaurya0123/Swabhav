package com.techlabs.enums;

public enum InstrumentType {
	GUITAR, BANJO, MANDOLIN, DOBRO, FIDDLE, BASS;
	public String toString() {
		switch (this) {
		case GUITAR:
			return "guitar";
		case BANJO:
			return "banjo";
		case MANDOLIN:
			return "mandolin";
		case DOBRO:
			return "dobro";
		case FIDDLE:
			return "fiddle";
		case BASS:
			return "bass";
		default:
			return "Unspecified";
		}
	}
}
