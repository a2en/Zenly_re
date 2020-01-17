package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.crashlytics.android.core.v0 */
final class C9419v0 {

    /* renamed from: a */
    private static final FilenameFilter f24391a = new C9420a();

    /* renamed from: com.crashlytics.android.core.v0$a */
    static class C9420a implements FilenameFilter {
        C9420a() {
        }

        public boolean accept(File file, String str) {
            return true;
        }
    }

    /* renamed from: a */
    static int m22781a(File file, int i, Comparator<File> comparator) {
        return m22782a(file, f24391a, i, comparator);
    }

    /* renamed from: a */
    static int m22782a(File file, FilenameFilter filenameFilter, int i, Comparator<File> comparator) {
        File[] listFiles = file.listFiles(filenameFilter);
        if (listFiles == null) {
            return 0;
        }
        int length = listFiles.length;
        Arrays.sort(listFiles, comparator);
        for (File file2 : listFiles) {
            if (length <= i) {
                return length;
            }
            file2.delete();
            length--;
        }
        return length;
    }
}
