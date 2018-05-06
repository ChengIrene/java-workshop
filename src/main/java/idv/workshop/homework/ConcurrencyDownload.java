package idv.workshop.homework;

import java.net.URL;

public class ConcurrencyDownload {

    public static void main(String[] args) throws Exception {
        URL[] urls = {
            new URL("https://github.com/ChengIrene")
        };

        String[] fileNames = {
                "GitHub.html"
        };

        new ConcurrencyPages(urls, fileNames, new ConcurrencyDirectExecutor()).download();
    }
}
