package com.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.Helper;
 
public class DragDropExample1 {
 
    public static void main(String[] args) {
 
        WebDriver driver = Helper.startBrowser("Chrome");
        driver.get("https://jqueryui.com/droppable/");
 
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
 
        WebElement src = driver.findElement(By.id("draggable"));
        WebElement dest = driver.findElement(By.id("droppable"));
 
        Actions act = new Actions(driver);
        act.dragAndDrop(src, dest).perform();
    }
}