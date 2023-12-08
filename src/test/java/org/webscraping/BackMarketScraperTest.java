package org.webscraping;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.webscraping.scrapers.BackMarketScraper;
import org.webscraping.scrapers.FirefoxWebDriverProvider;
import org.webscraping.scrapers.WebDriverProvider;

import static org.mockito.Mockito.*;

public class BackMarketScraperTest {

    /**
     * Test the run method of {@link BackMarketScraper}.
     * It mocks the dependencies, creates the scraper with mocked dependencies, runs the scraper,
     * and verifies interactions with the mocked dependencies.
     */
    @Test
    public void testRun() {
        // Mocking the dependencies
        WebDriverProvider mockWebDriverProvider = mock(WebDriverProvider.class);
        WebDriver mockDriver = mock(WebDriver.class);
        when(mockWebDriverProvider.getWebDriver()).thenReturn(mockDriver);

        // Creating the EBayScraper with the mocked dependencies
        BackMarketScraper backMarketScraper = new BackMarketScraper((FirefoxWebDriverProvider) mockWebDriverProvider);

        // Running the scraper
        backMarketScraper.start();

        // Verifying interactions
        verify(mockWebDriverProvider, atLeastOnce()).getWebDriver();
        // Add additional verifications as needed
    }
}
