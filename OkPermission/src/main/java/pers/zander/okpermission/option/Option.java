package pers.zander.okpermission.option;

import pers.zander.okpermission.runtime.option.RuntimeOption;

/**
 * Created by Zander on 2020-06-08.
 * Author:Zander
 * Mail:zander.zhang2018@gmail.com
 * Depiction:
 */
public interface Option {
    /**
     * Handle runtime permissions.
     */
    RuntimeOption runtime();

    /**
     * Handle request package install permission.
     */
//    InstallRequest install();
//
//    /**
//     * Handle overlay permission.
//     */
//    OverlayRequest overlay();
//
//    /**
//     * Handle notification permission.
//     */
//    NotifyOption notification();
//
//    /**
//     * Handle system setting.
//     */
//    Setting setting();
}
