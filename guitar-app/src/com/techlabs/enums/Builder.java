package com.techlabs.enums;

public enum Builder {
	FENDER,MARTIN,GIBSON,COLLINGS,OLSAN,RYAN,PRS,ANY;
	
	public String toString() {
		switch(this) {
		case FENDER: return "fender";
		case MARTIN: return "martin";
		case GIBSON: return "gibson";
		case COLLINGS: return "colllings";
		case OLSAN: return "olsan";
		case RYAN: return "ryan";
		case PRS: return "prs";
		case ANY: return "any";
		default: return "";
		}
	}
	
}
