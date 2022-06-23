package com.qa.gemini.ticker.stepdefinition;

import com.gemini.generic.DriverAction;
import com.gemini.generic.DriverManager;
import com.gemini.quartzReporting.GemTestReporter;
import com.gemini.quartzReporting.STATUS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.Color;


import java.io.IOException;

public class TickerTape {
    @Given("^Search Stock in the search box (.+)")
    public void Search_Stock_in_the_search_box(String Stock) throws IOException {
        DriverAction.waitSec(2);
        DriverAction.typeText(loacators.search, Stock);
        DriverAction.waitSec(2);
    }

    @Then("Verify If its Stock Type")
    public void verify_if_its_stock_type() throws IOException {
        DriverAction.click(loacators.stock);
        DriverAction.waitSec(2);
        String verify = DriverAction.getElementText(loacators.verify);
        if (verify.equals("Stocks")) {
            System.out.printf("Validation successful asset is stock\n");
            GemTestReporter.addTestStep("Validation", "Asset is Stock", STATUS.PASS, DriverAction.takeSnapShot());
        }
    }

    @Then("Click on It")
    public void click_on_it() {
        DriverManager.getWebDriver().findElement(loacators.search).sendKeys(Keys.ENTER);
        DriverAction.waitSec(2);
    }

    @Then("Show the analytic for one day")
    public void show_the_analytic_for_one_day() throws IOException {
        DriverAction.setScriptTimeOut(10);
        DriverAction.setImplicitTimeOut(10);
        DriverAction.setPageLoadTimeOut(10);
        String heading = DriverAction.getElementText(loacators.heading);
        String high1 = DriverAction.getElementText(loacators.high);
        String low1 = DriverAction.getElementText(loacators.low);
        String change1 = DriverAction.getElementText(loacators.change);
        String value = DriverAction.getCSSValue(loacators.change, "color");
        String color = String.valueOf(Color.fromString(value).asHex());
        String high = high1.substring(1);
        String low = low1.substring(1);
        String change = change1.substring(0);
        String red = "#d82f44";
        String green = "#19af55";
        if (color.equals(green)) {
            System.out.print("Insights of " + heading + "for 1 day" + "\nHigh " + high + "\nLow " + low + "\nChange +" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + "for 1 day", "High " + high + "<br>Low " + low + "<br>Change +" + change, STATUS.PASS, DriverAction.takeSnapShot());

        } else if (color.equals(red)) {
            System.out.print("Insights of " + heading + "for 1 day" + "\nHigh " + high + "\nLow " + low + "\nChange -" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + "for 1 day", "High " + high + "<br>Low " + low + "<br>Change -" + change, STATUS.PASS, DriverAction.takeSnapShot());
        }
        DriverAction.waitSec(20);
    }

    @Then("Show the analytic for one Week")
    public void show_the_analytic_for_one_week() throws IOException {
        DriverAction.setScriptTimeOut(10);
        DriverAction.setImplicitTimeOut(10);
        DriverAction.setPageLoadTimeOut(10);
        DriverAction.click(loacators.week, "Click on 1w");
        DriverAction.waitSec(5);
        String heading = DriverAction.getElementText(loacators.heading);
        String high1 = DriverAction.getElementText(loacators.high);
        String low1 = DriverAction.getElementText(loacators.low);
        String change1 = DriverAction.getElementText(loacators.change);
        String value = DriverAction.getCSSValue(loacators.change, "color");
        String color = String.valueOf(Color.fromString(value).asHex());
        String high = high1.substring(1);
        String low = low1.substring(1);
        String change = change1.substring(0);
        String red = "#d82f44";
        String green = "#19af55";
        if (color.equals(green)) {
            System.out.print("Insights of " + heading + "for 1 Week" + "\nHigh " + high + "\nLow " + low + "\nChange +" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + "for 1 Week", "High " + high + "<br>Low " + low + "<br>Change +" + change, STATUS.PASS, DriverAction.takeSnapShot());

        } else if (color.equals(red)) {
            System.out.print("Insights of " + heading + "for 1 Week" + "\nHigh " + high + "\nLow " + low + "\nChange -" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + "for 1 Week ", "High " + high + "<br>Low " + low + "<br>Change -" + change, STATUS.PASS, DriverAction.takeSnapShot());
        }
        DriverAction.waitSec(20);
    }

    @Then("Show the analytic for one Month")
    public void show_the_analytic_for_one_month() throws IOException {
        DriverAction.setScriptTimeOut(10);
        DriverAction.setImplicitTimeOut(10);
        DriverAction.setPageLoadTimeOut(10);
        DriverAction.click(loacators.mo, "Click on 1M");
        DriverAction.waitSec(5);
        String heading = DriverAction.getElementText(loacators.heading);
        String high1 = DriverAction.getElementText(loacators.high);
        String low1 = DriverAction.getElementText(loacators.low);
        String change1 = DriverAction.getElementText(loacators.change);
        String value = DriverAction.getCSSValue(loacators.change, "color");
        String color = String.valueOf(Color.fromString(value).asHex());
        String high = high1.substring(1);
        String low = low1.substring(1);
        String change = change1.substring(0);
        String red = "#d82f44";
        String green = "#19af55";
        if (color.equals(green)) {
            System.out.print("Insights of " + heading + "for 1 Month" + "\nHigh " + high + "\nLow " + low + "\nChange +" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + "for 1 Month", "High " + high + "<br>Low " + low + "<br>Change +" + change, STATUS.PASS, DriverAction.takeSnapShot());

        } else if (color.equals(red)) {
            System.out.print("Insights of " + heading + "for 1 Month" + "\nHigh " + high + "\nLow " + low + "\nChange -" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + "for 1 Month", "High " + high + "<br>Low " + low + "<br>Change -" + change, STATUS.PASS, DriverAction.takeSnapShot());
        }
        DriverAction.waitSec(5);
    }

    @Then("Show the analytic for one year")
    public void show_the_analytic_for_one_year() throws IOException {
        DriverAction.setScriptTimeOut(10);
        DriverAction.setImplicitTimeOut(10);
        DriverAction.setPageLoadTimeOut(10);
        DriverAction.click(loacators.year, "Click on 1y");
        DriverAction.waitSec(5);
        String heading = DriverAction.getElementText(loacators.heading);
        String high1 = DriverAction.getElementText(loacators.high);
        String low1 = DriverAction.getElementText(loacators.low);
        String change1 = DriverAction.getElementText(loacators.change);
        String value = DriverAction.getCSSValue(loacators.change, "color");
        String color = String.valueOf(Color.fromString(value).asHex());
        String high = high1.substring(1);
        String low = low1.substring(1);
        String change = change1.substring(0);
        String red = "#d82f44";
        String green = "#19af55";
        if (color.equals(green)) {
            System.out.print("Insights of " + heading + "for 1 Year" + "\nHigh " + high + "\nLow " + low + "\nChange +" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + "for 1 Year", "High " + high + "<br>Low " + low + "<br>Change +" + change, STATUS.PASS, DriverAction.takeSnapShot());

        } else if (color.equals(red)) {
            System.out.print("Insights of " + heading + "for 1 Year" + "\nHigh " + high + "\nLow " + low + "\nChange -" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + "for 1 year", "High " + high + "<br>Low " + low + "<br>Change -" + change, STATUS.PASS, DriverAction.takeSnapShot());
        }
        DriverAction.waitSec(5);
    }

    @Then("Show the analytic for five year")
    public void show_the_analytic_for_five_year() throws IOException {
        DriverAction.setScriptTimeOut(10);
        DriverAction.setImplicitTimeOut(10);
        DriverAction.setPageLoadTimeOut(10);
        DriverAction.click(loacators.year5, "Click on 5y");
        DriverAction.waitSec(5);
        String heading = DriverAction.getElementText(loacators.heading);
        String high1 = DriverAction.getElementText(loacators.high);
        String low1 = DriverAction.getElementText(loacators.low);
        String change1 = DriverAction.getElementText(loacators.change);
        String value = DriverAction.getCSSValue(loacators.change, "color");
        String color = String.valueOf(Color.fromString(value).asHex());
        String high = high1.substring(1);
        String low = low1.substring(1);
        String change = change1.substring(0);
        String red = "#d82f44";
        String green = "#19af55";
        if (color.equals(green)) {
            System.out.print("Insights of " + heading + "for 5 Years" + "\nHigh " + high + "\nLow " + low + "\nChange +" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + "for 5 Years", "High " + high + "<br>Low " + low + "<br>Change +" + change, STATUS.PASS, DriverAction.takeSnapShot());

        } else if (color.equals(red)) {
            System.out.print("Insights of " + heading + "for 5 years" + "\nHigh " + high + "\nLow " + low + "\nChange -" + change + "\n");
            GemTestReporter.addTestStep("Insights of " + heading + "for 5 Years", "High " + high + "<br>Low " + low + "<br>Change -" + change, STATUS.PASS, DriverAction.takeSnapShot());
        }
        DriverAction.waitSec(5);
    }
}