package zendesk.belvedere;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MatrixCursor.RowBuilder;
import android.net.Uri;
import android.util.Log;
import androidx.core.content.FileProvider;
import java.util.Arrays;

public class BelvedereFileProvider extends FileProvider {
    /* renamed from: a */
    private String[] m35619a(String[] strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            String str = "_data";
            if (i >= length) {
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
                strArr2[strArr.length] = str;
                return strArr2;
            } else if (str.equals(strArr[i])) {
                return strArr;
            } else {
                i++;
            }
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query = super.query(uri, strArr, str, strArr2, str2);
        if (query == null) {
            Log.w("Belvedere", "Not able to apply workaround, super.query(...) returned null");
            return null;
        }
        String[] columnNames = query.getColumnNames();
        MatrixCursor matrixCursor = new MatrixCursor(m35619a(columnNames), query.getCount());
        query.moveToPosition(-1);
        while (query.moveToNext()) {
            RowBuilder newRow = matrixCursor.newRow();
            for (int i = 0; i < columnNames.length; i++) {
                newRow.add(query.getString(i));
            }
        }
        query.close();
        return matrixCursor;
    }
}
