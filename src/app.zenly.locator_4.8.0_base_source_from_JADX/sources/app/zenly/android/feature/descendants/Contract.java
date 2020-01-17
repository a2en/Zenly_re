package app.zenly.android.feature.descendants;

import app.zenly.android.feature.descendants.recycler.C1406a;
import java.util.List;

public interface Contract {

    public interface Presenter {
        void start();

        void stop();
    }

    public interface View {
        void onErrorShowErrorScreen(Throwable th);

        void onSuccessShowDataScreen(List<? extends C1406a<? extends Object>> list);
    }
}
