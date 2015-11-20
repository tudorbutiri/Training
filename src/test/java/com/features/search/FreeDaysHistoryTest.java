package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.FreeDaysHistorySteps;
import com.steps.serenity.LogInSteps;

import Helper.constante;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class FreeDaysHistoryTest  {
	
	@Managed(uniqueSession = true)
    public WebDriver webdriver;
	
	@Steps
	public LogInSteps logInSteps;
	@Steps
	public FreeDaysHistorySteps freeDaysHistorySteps;
	
	
	@Test
	public void freeDaysHistoryTest(){
		logInSteps.login(constante.USERDEV, constante.PASSDEV);
		freeDaysHistorySteps.clickFreeDaysHistoryMenuBtn();
		freeDaysHistorySteps.selectValueFromType("Vacation days");
		freeDaysHistorySteps.selectValueFromDays("6 - 10");
		freeDaysHistorySteps.selectValueFromOperation("Removed Days");
		freeDaysHistorySteps.clickApplyButton();
		freeDaysHistorySteps.verifyMessage();

		
	}

}