package androidx.appcompat.widget;

import android.content.Intent;
import android.database.DataSetObservable;
import java.util.HashMap;
import java.util.List;

class ActivityChooserModel extends DataSetObservable {

    public interface ActivityChooserModelClient {
        void setActivityChooserModel(ActivityChooserModel activityChooserModel);
    }

    public interface ActivitySorter {
        void sort(Intent intent, List<Object> list, List<Object> list2);
    }

    public interface OnChooseActivityListener {
        boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent);
    }

    static {
        Class<ActivityChooserModel> cls = ActivityChooserModel.class;
        new HashMap();
    }
}
