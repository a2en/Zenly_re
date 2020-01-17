package retrofit2;

import java.io.IOException;
import okhttp3.C13331y;

public interface Call<T> extends Cloneable {
    void cancel();

    Call<T> clone();

    void enqueue(Callback<T> callback);

    C13429h<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    C13331y request();
}
