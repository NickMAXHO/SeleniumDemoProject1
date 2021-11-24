package common;

public class Config {

    /**
     * Specify browser-platform to test:
     * CHROME_MAC
     * CHROME_WINDOWS
     * MOZILLA_MAC
     * */
    public static final String BROWSER_AND_PLATFORM = "CHROME_WINDOWS";
    /**
     * Clean Browser after each run
     * */
    public static final Boolean CLEAR_COOKIES = true;
    /**
     * To keep browser open after all scenario/tests
     * */
    public static final Boolean HOLD_BROWSER_OPEN = false;

}
