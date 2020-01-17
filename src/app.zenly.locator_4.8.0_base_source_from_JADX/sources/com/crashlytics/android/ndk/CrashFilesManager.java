package com.crashlytics.android.ndk;

import java.io.File;
import java.util.TreeSet;

public interface CrashFilesManager {
    TreeSet<File> getAllNativeDirectories();

    File getNewNativeDirectory();
}
