package com.phuong.homework.core.webdriver.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager {
    private static EdgeDriverManager edgeDriverManagerInstance = null;

    private EdgeDriverManager() {
    }

    public void setDriverProperty(){
        System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
    }

    public WebDriver createDriver(){
        setDriverProperty();
        return new EdgeDriver();
    }

    public static EdgeDriverManager getEdgeManagerInstance(){
        if (edgeDriverManagerInstance ==null){
            edgeDriverManagerInstance = new EdgeDriverManager();
        }
        return edgeDriverManagerInstance;
    }
}
