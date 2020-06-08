package pers.zander.okpermission.runtime;

import androidx.annotation.NonNull;

import java.util.List;

import pers.zander.okpermission.Action;
import pers.zander.okpermission.Rationale;

/**
 * Created by Zander on 2020-06-08.
 * Author:Zander
 * Mail:zander.zhang2018@gmail.com
 * Depiction:
 */
public interface PermissionRequest {
    /**
     * One or more permissions.
     */
    PermissionRequest permission(@NonNull @PermissionDef String... permissions);

    /**
     * One or more permissions group.
     *
     * @param groups use constants in {@link Permission.Group}.
     */
    PermissionRequest permission(@NonNull String[]... groups);

    /**
     * Set request rationale.
     */
    PermissionRequest rationale(@NonNull Rationale<List<String>> rationale);

    /**
     * Action to be taken when all permissions are granted.
     */
    PermissionRequest onGranted(@NonNull Action<List<String>> granted);

    /**
     * Action to be taken when all permissions are denied.
     */
    PermissionRequest onDenied(@NonNull Action<List<String>> denied);

    /**
     * Request permission.
     */
    void start();
}
