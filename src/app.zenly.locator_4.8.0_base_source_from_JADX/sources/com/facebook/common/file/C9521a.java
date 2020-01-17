package com.facebook.common.file;

import java.io.File;

/* renamed from: com.facebook.common.file.a */
public class C9521a {
    /* renamed from: a */
    public static void m23244a(File file, FileTreeVisitor fileTreeVisitor) {
        fileTreeVisitor.preVisitDirectory(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m23244a(file2, fileTreeVisitor);
                } else {
                    fileTreeVisitor.visitFile(file2);
                }
            }
        }
        fileTreeVisitor.postVisitDirectory(file);
    }

    /* renamed from: b */
    public static boolean m23246b(File file) {
        if (file.isDirectory()) {
            m23245a(file);
        }
        return file.delete();
    }

    /* renamed from: a */
    public static boolean m23245a(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File b : listFiles) {
                z &= m23246b(b);
            }
        }
        return z;
    }
}
