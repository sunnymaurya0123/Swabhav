package com.techlabs.template;

public abstract class RecruitmentProcessTemplate {

	public abstract void conductHRRound();
	public abstract void conductAptitude();
	public final void conductRecruitment(boolean isGraduate) {
		if(isGraduate) {
			conductAptitude();
			conductTechnicalRound();
			conductHRRound();
		}
	}
	
	public final void conductTechnicalRound() {
		System.out.println("CBT Technical Round conducted");
	}
}
