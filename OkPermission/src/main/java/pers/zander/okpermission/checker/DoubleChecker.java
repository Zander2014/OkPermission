package pers.zander.okpermission.checker;

import android.content.Context;

import java.util.List;

/**
 * Created by Zhenjie Yan on 2018/1/27.
 */
public final class DoubleChecker implements PermissionChecker {

    private static final PermissionChecker STANDARD_CHECKER = new StandardChecker();
    private static final PermissionChecker STRICT_CHECKER = new StrictChecker();

    @Override
    public boolean hasPermission(Context context, String... permissions) {
        return STRICT_CHECKER.hasPermission(context, permissions) &&
            STANDARD_CHECKER.hasPermission(context, permissions);
    }

    @Override
    public boolean hasPermission(Context context, List<String> permissions) {
        return STRICT_CHECKER.hasPermission(context, permissions) &&
            STANDARD_CHECKER.hasPermission(context, permissions);
    }
}