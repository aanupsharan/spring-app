package com.anup.springapp;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Cricket Coach: inside no-args method");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice fast bowling 15 mins a day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
