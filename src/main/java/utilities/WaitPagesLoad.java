package utilities;

import com.codeborne.selenide.WebDriverRunner;

import java.util.concurrent.TimeUnit;

public class WaitPagesLoad {
    public static void wait(int milliseconds){
        WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(milliseconds, TimeUnit.MILLISECONDS);
    }
}
