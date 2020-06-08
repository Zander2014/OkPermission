package pers.zander.okpermission.task;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialog;

import pers.zander.okpermission.R;

/**
 * Created by Zhenjie Yan on 2019-09-23.
 */
public class WaitDialog extends AppCompatDialog {

    public WaitDialog(@NonNull Context context) {
        super(context, R.style.Permission_Theme_Dialog_Wait);
        setContentView(R.layout.permission_dialog_wait);
    }
}