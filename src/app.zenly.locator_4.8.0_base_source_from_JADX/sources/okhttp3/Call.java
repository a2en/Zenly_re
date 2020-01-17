package okhttp3;

import java.io.IOException;
import okio.C13368t;

public interface Call extends Cloneable {

    public interface Factory {
        Call newCall(C13331y yVar);
    }

    void cancel();

    Call clone();

    void enqueue(Callback callback);

    C13167a0 execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    C13331y request();

    C13368t timeout();
}
