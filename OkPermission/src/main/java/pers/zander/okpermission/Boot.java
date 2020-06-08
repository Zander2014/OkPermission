package pers.zander.okpermission;

import android.os.Build;

import pers.zander.okpermission.option.Option;
import pers.zander.okpermission.runtime.Runtime;
import pers.zander.okpermission.runtime.option.RuntimeOption;
import pers.zander.okpermission.source.Source;


/**
 * Created by Zander Yan on 2018/4/28.
 */
public class Boot implements Option {

//    private static final InstallRequestFactory INSTALL_REQUEST_FACTORY;
//    private static final OverlayRequestFactory OVERLAY_REQUEST_FACTORY;
//
//    static {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            INSTALL_REQUEST_FACTORY = new ORequestFactory();
//        } else {
//            INSTALL_REQUEST_FACTORY = new NRequestFactory();
//        }
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            OVERLAY_REQUEST_FACTORY = new MRequestFactory();
//        } else {
//            OVERLAY_REQUEST_FACTORY = new LRequestFactory();
//        }
//    }

//    public interface InstallRequestFactory {
//
//        /**
//         * Create apk installer request.
//         */
//        InstallRequest create(Source source);
//    }
//
//    public interface OverlayRequestFactory {
//
//        /**
//         * Create overlay request.
//         */
//        OverlayRequest create(Source source);
//    }

    private Source mSource;

    public Boot(Source source) {
        this.mSource = source;
    }

    @Override
    public RuntimeOption runtime() {
        return new Runtime(mSource);
    }
//
//    @Override
//    public InstallRequest install() {
//        return INSTALL_REQUEST_FACTORY.create(mSource);
//    }
//
//    @Override
//    public OverlayRequest overlay() {
//        return OVERLAY_REQUEST_FACTORY.create(mSource);
//    }
//
//    @Override
//    public NotifyOption notification() {
//        return new Notify(mSource);
//    }
//
//    @Override
//    public Setting setting() {
//        return new Setting(mSource);
//    }
}