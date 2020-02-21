package com.company.automation.pagemodels;

import com.magenic.jmaqs.selenium.SeleniumTestObject;
import com.magenic.jmaqs.selenium.UIWait;
import com.magenic.jmaqs.selenium.factories.UIWaitFactory;

/**
 * The type Base page model.
 */
public abstract class BasePageModel {

  /**
   * The Test object.
   */
  protected SeleniumTestObject testObject;

  /**
   * Instantiates a new Base page model.
   *
   * @param testObject the test object
   */
  public BasePageModel(SeleniumTestObject testObject) {
    this.testObject = testObject;
  }

  /**
   * Is page loaded boolean.
   *
   * @return the boolean
   */
  public abstract boolean isPageLoaded();

  protected UIWait getWaitDriver() {
    return UIWaitFactory.getWaitDriver(this.testObject.getWebDriver());
  }
}
