package pers.zander.okpermission.runtime.option;

import androidx.annotation.NonNull;

import pers.zander.okpermission.runtime.Permission;
import pers.zander.okpermission.runtime.PermissionDef;
import pers.zander.okpermission.runtime.PermissionRequest;
import pers.zander.okpermission.runtime.setting.SettingRequest;

/**
 * Created by Zander on 2020-06-08.
 * Author:Zander
 * Mail:zander.zhang2018@gmail.com
 * Depiction:
 */
public interface RuntimeOption {
    /**
     * One or more permissions.
     */
    PermissionRequest permission(@NonNull @PermissionDef String... permissions);

    /**
     * One or more permission groups.
     *
     * @param groups use constants in {@link Permission.Group}.
     */
    PermissionRequest permission(@NonNull String[]... groups);

    /**
     * Permission settings.
     */
    SettingRequest setting();
}
