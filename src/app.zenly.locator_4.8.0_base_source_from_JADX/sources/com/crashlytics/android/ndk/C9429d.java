package com.crashlytics.android.ndk;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import p389io.fabric.sdk.android.services.common.C12200s;
import p389io.fabric.sdk.android.services.persistence.FileStore;

/* renamed from: com.crashlytics.android.ndk.d */
class C9429d implements CrashFilesManager {

    /* renamed from: b */
    private static final FileFilter f24404b = new C9430a();

    /* renamed from: a */
    private final FileStore f24405a;

    /* renamed from: com.crashlytics.android.ndk.d$a */
    static class C9430a implements FileFilter {
        C9430a() {
        }

        public boolean accept(File file) {
            return file.isDirectory();
        }
    }

    /* renamed from: com.crashlytics.android.ndk.d$b */
    static class C9431b implements Comparator<File> {
        C9431b() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    }

    public C9429d(FileStore fileStore) {
        this.f24405a = fileStore;
    }

    /* renamed from: a */
    private File m22811a() {
        return new File(this.f24405a.getFilesDir(), "native");
    }

    public TreeSet<File> getAllNativeDirectories() {
        return m22812a(m22811a());
    }

    public File getNewNativeDirectory() {
        File a = m22811a();
        if (!a.isDirectory() && !a.mkdir()) {
            return null;
        }
        File file = new File(a, Long.toString(new C12200s().getCurrentTimeMillis()));
        if (!file.mkdir()) {
            file = null;
        }
        return file;
    }

    /* renamed from: a */
    private static TreeSet<File> m22812a(File file) {
        if (file == null || !file.isDirectory()) {
            return new TreeSet<>();
        }
        File[] listFiles = file.listFiles(f24404b);
        TreeSet<File> treeSet = new TreeSet<>(new C9431b());
        treeSet.addAll(Arrays.asList(listFiles));
        return treeSet;
    }
}
