package pers.zander.okpermission.runtime.setting;

import pers.zander.okpermission.source.Source;

/**
 * <p>SettingRequest executor.</p>
 * Created by Zander on 2020-06-08.
 */
public class AllRequest implements SettingRequest {

    private Source mSource;

    public AllRequest(Source source) {
        this.mSource = source;
    }

    @Override
    public void start(int requestCode) {
        SettingPage setting = new SettingPage(mSource);
        setting.start(requestCode);
    }
}