package idv.workshop.homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.concurrent.Executor;

public class ConcurrencyPages {
    private URL[] urls;
    private String[] fileNames;
    private Executor executor;

    public ConcurrencyPages(URL[] urls, String[] fileNames, Executor executor) {
        this.urls = urls;
        this.fileNames = fileNames;
        this.executor = executor;
    }

    public void download() {
        for (int i = 0; i < urls.length; i++) {
            URL url = urls[i];
            String fileName = fileNames[i];
            executor.execute(() -> {
                try {
                    dump(url.openStream(), new FileOutputStream(fileName));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });
        }
    }

    private void dump(InputStream src, OutputStream dest) throws IOException {
        try (InputStream source = src; OutputStream destination = dest) {
            byte[] data = new byte[1024];
            int length;
            while ((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }
        }
    }
}
