package pers.zander.okpermission.source;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/**
 * <p>android.app.Fragment Wrapper.</p>
 * Created by Zander on 2020-06-08.
 */
public class FragmentSource extends Source {

    private Fragment mFragment;

    public FragmentSource(Fragment fragment) {
        this.mFragment = fragment;
    }

    @Override
    public Context getContext() {
        return mFragment.getActivity();
    }

    @Override
    public void startActivity(Intent intent) {
        mFragment.startActivity(intent);
    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        mFragment.startActivityForResult(intent, requestCode);
    }

    @Override
    public boolean isShowRationalePermission(String permission) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) return false;
        return mFragment.shouldShowRequestPermissionRationale(permission);
    }
}