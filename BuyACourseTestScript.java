package com.automation.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.automation.library.Base;
import com.automation.pages.CheckoutProgressPage;
import com.automation.pages.ChooseAFormatPage;
import com.automation.pages.LandingPage;
import com.automation.pages.ProceedToCheckoutPage;
import com.automation.pages.ScienceCategoryPage;

public class BuyACourseTestScript extends Base {
	// final static Logger log = Logger.getLogger(BuyACourseTestScript.class);
	public final static Logger log = LoggerFactory.getLogger(BuyACourseTestScript.class);

	// public LandingPage myLandingPage;
	public LandingPage landingPage;
	public ScienceCategoryPage scienceCategoryPage;
	public ChooseAFormatPage chooseAFormatPage;
	public ProceedToCheckoutPage proceedToCheckoutPage;
	public CheckoutProgressPage checkoutProgressPage;

	@Test
	public void buy_OurNightSkyCourseTest_1() {
		landingPage = new LandingPage(driver);
		landingPage.goto_TheGreatCoursesWebsite();
		myLibrary.sleep(3);

		scienceCategoryPage = landingPage.click_ExploreCategoriesScienceLink();
		scienceCategoryPage.searchCourse("Our Night Sky");
		// scienceCategoryPage.searchCourse("Earth");
		chooseAFormatPage = scienceCategoryPage.selectCourse();
		// chooseAFormatPage.selectCourseType("DVD");
		chooseAFormatPage.selectCourseType("Instant Video");
		proceedToCheckoutPage = chooseAFormatPage.click_AddToCartBtn();
		checkoutProgressPage = proceedToCheckoutPage.click_ProceedToCheckOutButton();

		checkoutProgressPage.selectNoImNewCustomer();

		String timeStamp = myLibrary.getCurrentTime();
		String newEmailAdd = "mytest" + timeStamp + "@test.com";
		log.info("timeStamp: " + timeStamp);
		log.info("updated Email: " + newEmailAdd);

		checkoutProgressPage.enterEmailAddress(newEmailAdd);
		checkoutProgressPage.enterCreatePassword("123456");
		checkoutProgressPage.selectIAcceptTermsPolicy();
		checkoutProgressPage.clickContinueBtn();
		checkoutProgressPage.waitForBillingAddressSectionTobeVisible();

		// billing address section
		checkoutProgressPage.enterFirstName("Frank");
		checkoutProgressPage.enterLastName("M");
		checkoutProgressPage.enterStreetAddress("1 Apple St");
		checkoutProgressPage.enterCity("Earth");
		checkoutProgressPage.selectState("Virginia");
		checkoutProgressPage.enterZipCode("11111");
		checkoutProgressPage.clickSaveAddressBtn();
		checkoutProgressPage.waitForSaveAddressBookRadioBtnVisible();
		checkoutProgressPage.clickBillingAddressContinueBtn();

		// Payment information section
		checkoutProgressPage.waitForCatalogCodeTextFieldVisibility();
		checkoutProgressPage.switchToPaymentIframe(); // switch into the iframe
		checkoutProgressPage.enterAccountNumber("4567895645783256");
		checkoutProgressPage.selectExpirationMonth("August");
		checkoutProgressPage.selectExpirationYear("2025");
		checkoutProgressPage.enterSecurityCode("123");
		checkoutProgressPage.switchToParentPage(); // switch back to the parent page
		checkoutProgressPage.clickPaymentInformationContinueBtn();

		myLibrary.sleep(2);

	}

	@Test(enabled = false)
	public void buy_OurNightSkyCourseTest_2() {
		landingPage = new LandingPage(driver);
		landingPage.goto_TheGreatCoursesWebsite();
		myLibrary.sleep(3);

		scienceCategoryPage = landingPage.click_ExploreCategoriesScienceLink();
		// scienceCategoryPage.searchCourse("Our Night Sky");
		scienceCategoryPage.searchCourse("Earth");
		chooseAFormatPage = scienceCategoryPage.selectCourse();
		// chooseAFormatPage.selectCourseType("DVD");
		chooseAFormatPage.selectCourseType("Online");
		proceedToCheckoutPage = chooseAFormatPage.click_AddToCartBtn();
		checkoutProgressPage = proceedToCheckoutPage.click_ProceedToCheckOutButton();

		checkoutProgressPage.selectNoImNewCustomer();

		String timeStamp = myLibrary.getCurrentTime();
		String newEmailAdd = "mytest" + timeStamp + "@test.com";
		log.info("timeStamp: " + timeStamp);
		log.info("updated Email: " + newEmailAdd);
		checkoutProgressPage.enterEmailAddress(newEmailAdd);
		checkoutProgressPage.enterCreatePassword("123456");
		checkoutProgressPage.selectIAcceptTermsPolicy();
		checkoutProgressPage.clickContinueBtn();
		checkoutProgressPage.waitForBillingAddressSectionTobeVisible();

		// billing address section
		checkoutProgressPage.enterFirstName("Frank");
		checkoutProgressPage.enterLastName("M");
		checkoutProgressPage.enterStreetAddress("1 Apple St");
		checkoutProgressPage.enterCity("Earth");
		checkoutProgressPage.selectState("Virginia");
		checkoutProgressPage.enterZipCode("11111");
		checkoutProgressPage.clickSaveAddressBtn();
		checkoutProgressPage.waitForSaveAddressBookRadioBtnVisible();
		checkoutProgressPage.clickBillingAddressContinueBtn();

		// Payment information section
		checkoutProgressPage.waitForCatalogCodeTextFieldVisibility();
		checkoutProgressPage.switchToPaymentIframe(); // switch into the iframe
		checkoutProgressPage.enterAccountNumber("4567895645783256");
		checkoutProgressPage.selectExpirationMonth("August");
		checkoutProgressPage.selectExpirationYear("2025");
		checkoutProgressPage.enterSecurityCode("123");
		checkoutProgressPage.switchToParentPage(); // switch back to the parent page
		checkoutProgressPage.clickPaymentInformationContinueBtn();

		myLibrary.sleep(2);

	}

	@Test(enabled = false)
	public void buy_OurNightSkyCourseTest_3() {
		landingPage = new LandingPage(driver);
		landingPage.goto_TheGreatCoursesWebsite();
		myLibrary.sleep(3);

		scienceCategoryPage = landingPage.click_ExploreCategoriesScienceLink();
		// scienceCategoryPage.searchCourse("Our Night Sky");
		scienceCategoryPage.searchCourse("Earth");
		chooseAFormatPage = scienceCategoryPage.selectCourse();
		// chooseAFormatPage.selectCourseType("DVD");
		chooseAFormatPage.selectCourseType("Instant Video");
		proceedToCheckoutPage = chooseAFormatPage.click_AddToCartBtn();
		checkoutProgressPage = proceedToCheckoutPage.click_ProceedToCheckOutButton();

		checkoutProgressPage.selectNoImNewCustomer();

		String timeStamp = myLibrary.getCurrentTime();
		String newEmailAdd = "mytest" + timeStamp + "@test.com";
		log.info("timeStamp: " + timeStamp);
		log.info("updated Email: " + newEmailAdd);

		checkoutProgressPage.enterEmailAddress(newEmailAdd);
		checkoutProgressPage.enterCreatePassword("123456");
		checkoutProgressPage.selectIAcceptTermsPolicy();
		checkoutProgressPage.clickContinueBtn();
		checkoutProgressPage.waitForBillingAddressSectionTobeVisible();

		// billing address section
		checkoutProgressPage.enterFirstName("Frank");
		checkoutProgressPage.enterLastName("M");
		checkoutProgressPage.enterStreetAddress("1 Apple St");
		checkoutProgressPage.enterCity("Earth");
		checkoutProgressPage.selectState("Virginia");
		checkoutProgressPage.enterZipCode("11111");
		checkoutProgressPage.clickSaveAddressBtn();
		checkoutProgressPage.waitForSaveAddressBookRadioBtnVisible();
		checkoutProgressPage.clickBillingAddressContinueBtn();

		// Payment information section
		checkoutProgressPage.waitForCatalogCodeTextFieldVisibility();
		checkoutProgressPage.switchToPaymentIframe(); // switch into the iframe
		checkoutProgressPage.enterAccountNumber("4567895645783256");
		checkoutProgressPage.selectExpirationMonth("August");
		checkoutProgressPage.selectExpirationYear("2025");
		checkoutProgressPage.enterSecurityCode("123");
		checkoutProgressPage.switchToParentPage(); // switch back to the parent page
		checkoutProgressPage.clickPaymentInformationContinueBtn();

		myLibrary.sleep(2);

	}

	@Test(enabled = false)
	public void buy_OurNightSkyCourseTest_4() {
		landingPage = new LandingPage(driver);
		landingPage.goto_TheGreatCoursesWebsite();
		myLibrary.sleep(3);

		scienceCategoryPage = landingPage.click_ExploreCategoriesScienceLink();
		// scienceCategoryPage.searchCourse("Our Night Sky");
		scienceCategoryPage.searchCourse("Earth");
		chooseAFormatPage = scienceCategoryPage.selectCourse();
		// chooseAFormatPage.selectCourseType("DVD");
		chooseAFormatPage.selectCourseType("Instant Video");
		proceedToCheckoutPage = chooseAFormatPage.click_AddToCartBtn();
		checkoutProgressPage = proceedToCheckoutPage.click_ProceedToCheckOutButton();

		checkoutProgressPage.selectNoImNewCustomer();

		String timeStamp = myLibrary.getCurrentTime();
		String newEmailAdd = "mytest" + timeStamp + "@test.com";
		log.info("timeStamp: " + timeStamp);
		log.info("updated Email: " + newEmailAdd);

		checkoutProgressPage.enterEmailAddress(newEmailAdd);
		checkoutProgressPage.enterCreatePassword("123456");
		checkoutProgressPage.selectIAcceptTermsPolicy();
		checkoutProgressPage.clickContinueBtn();
		checkoutProgressPage.waitForBillingAddressSectionTobeVisible();

		// billing address section
		checkoutProgressPage.enterFirstName("Frank");
		checkoutProgressPage.enterLastName("M");
		checkoutProgressPage.enterStreetAddress("1 Apple St");
		checkoutProgressPage.enterCity("Earth");
		checkoutProgressPage.selectState("Virginia");
		checkoutProgressPage.enterZipCode("11111");
		checkoutProgressPage.clickSaveAddressBtn();
		checkoutProgressPage.waitForSaveAddressBookRadioBtnVisible();
		checkoutProgressPage.clickBillingAddressContinueBtn();

		// Payment information section
		checkoutProgressPage.waitForCatalogCodeTextFieldVisibility();
		checkoutProgressPage.switchToPaymentIframe(); // switch into the iframe
		checkoutProgressPage.enterAccountNumber("4567895645783256");
		checkoutProgressPage.selectExpirationMonth("August");
		checkoutProgressPage.selectExpirationYear("2025");
		checkoutProgressPage.enterSecurityCode("123");
		checkoutProgressPage.switchToParentPage(); // switch back to the parent page
		checkoutProgressPage.clickPaymentInformationContinueBtn();

		myLibrary.sleep(2);

	}

}
