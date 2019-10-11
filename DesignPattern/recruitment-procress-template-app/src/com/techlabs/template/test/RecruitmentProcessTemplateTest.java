package com.techlabs.template.test;

import com.techlabs.company.AurionPro;
import com.techlabs.company.SwabhavTechlabs;

public class RecruitmentProcessTemplateTest {

	public static void main(String[] args) {
		AurionPro aurionPro=new AurionPro();
		aurionPro.conductRecruitment(true);
		
		SwabhavTechlabs swabhavTechlabs=new SwabhavTechlabs();
		swabhavTechlabs.conductRecruitment(false);

	}

}
