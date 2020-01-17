package okhttp3;

import okio.C13346d;

public interface WebSocket {

    public interface Factory {
        WebSocket newWebSocket(C13331y yVar, C13178e0 e0Var);
    }

    void cancel();

    boolean close(int i, String str);

    long queueSize();

    C13331y request();

    boolean send(String str);

    boolean send(C13346d dVar);
}
