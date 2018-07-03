package idv.workshop.homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class NIOUtil {
    public static void dump(ReadableByteChannel src, WritableByteChannel dest) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        try(ReadableByteChannel source = src; WritableByteChannel destination = dest) {
            while(src.read(buffer) != -1) {
                buffer.flip();  //將 limit值設為position目前值,而position設為0
                dest.write(buffer);  //會將buffer中從position至limit前的資料寫到WritableByChannel中,最後position會等於limit
                buffer.clear();  //因此呼叫clear()將position設為0,limit設為等於容量的值,以便下個迴圈,讓ReadableByteChannel將資料寫到buffer中
            }
        }
    }

    // 測試用的main
    public static void main (String[] args) throws Exception {
        URL url = new URL("https://openhome.cc");
        ReadableByteChannel src = Channels.newChannel(url.openStream());
        WritableByteChannel dest = new FileOutputStream("index.html").getChannel();
        NIOUtil.dump(src, dest);
    }
}
