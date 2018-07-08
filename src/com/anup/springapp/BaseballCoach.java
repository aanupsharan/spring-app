package com.anup.springapp;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "practice 30 balls";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void doStartUpStuff() {
		System.out.println("Baseball Coach: inside the doStartUpStuff");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("Baseball Coach: inside the doMyCleanUpStuff");
	}
}
