package pers.zander.okpermission.checker;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;

import java.io.File;

/**
 * Created by Zhenjie Yan on 2018/1/16.
 */
class StorageWriteTest implements PermissionTest {

    private Context mContext;

    StorageWriteTest(Context c) {
        mContext = c;
    }

    @Override
    public boolean test() throws Throwable {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q && !Environment.isExternalStorageLegacy()) return true;

        if (!TextUtils.equals(Environment.MEDIA_MOUNTED, Environment.getExternalStorageState())) return true;

        File directory = mContext.getExternalFilesDir(null);

        if (!directory.exists()) return true;

        File parent = new File(directory, "Android");
        if (parent.exists() && parent.isFile()) {
            if (!parent.delete()) return false;
        }
        if (!parent.exists()) {
            if (!parent.mkdirs()) return false;
        }
        File file = new File(parent, "ANDROID.PERMISSION.TEST");
        if (file.exists()) {
            return file.delete();
        } else {
            return file.createNewFile();
        }
    }
}