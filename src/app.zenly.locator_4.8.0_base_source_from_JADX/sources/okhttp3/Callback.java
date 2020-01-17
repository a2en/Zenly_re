package okhttp3;

import java.io.IOException;

public interface Callback {
    void onFailure(Call call, IOException iOException);

    void onResponse(Call call, C13167a0 a0Var) throws IOException;
}
