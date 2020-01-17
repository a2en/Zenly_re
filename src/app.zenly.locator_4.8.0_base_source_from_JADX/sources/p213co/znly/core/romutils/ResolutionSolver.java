package p213co.znly.core.romutils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: co.znly.core.romutils.ResolutionSolver */
public final class ResolutionSolver {
    private static final List<Checker> CHECKERS = Collections.unmodifiableList(Arrays.asList(new Checker[]{new OppoChecker("oppo"), new XiaomiChecker("xiaomi")}));
    private static final ResolutionSolver INSTANCE = new ResolutionSolver();

    private ResolutionSolver() {
    }

    private Checker findChecker() {
        for (Checker checker : CHECKERS) {
            if (Build.MANUFACTURER.equalsIgnoreCase(checker.getManufacturer())) {
                return checker;
            }
        }
        return null;
    }

    public static ResolutionSolver get() {
        return INSTANCE;
    }

    private static boolean isAvailable(Context context, Intent intent) {
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 64);
        return resolveActivity != null && resolveActivity.activityInfo.exported;
    }

    public void autoResolve(Context context) {
        Checker findChecker = findChecker();
        if (findChecker != null) {
            findChecker.autoResolve(context);
        }
    }

    public List<Resolution> getResolutions(Context context) {
        Checker findChecker = findChecker();
        if (findChecker == null) {
            return Collections.emptyList();
        }
        List<Resolution> resolutions = findChecker.getResolutions(context);
        ArrayList arrayList = new ArrayList();
        for (Resolution resolution : resolutions) {
            if (isAvailable(context, resolution.getIntent())) {
                arrayList.add(resolution);
            }
        }
        return arrayList;
    }
}
