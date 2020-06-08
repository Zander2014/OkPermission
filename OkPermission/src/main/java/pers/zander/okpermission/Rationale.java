package pers.zander.okpermission;

import android.content.Context;

/**
 * Created by Zander on 2020-06-08.
 */
public interface Rationale<T> {

    /**
     * Show rationale to user.
     *
     * @param context context.
     * @param data the data.
     * @param executor executor.
     */
    void showRationale(Context context, T data, RequestExecutor executor);
}