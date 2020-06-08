package pers.zander.okpermission.checker;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationManager;

import java.util.List;

/**
 * Created by Zhenjie Yan on 2018/1/14.
 */
class LocationCoarseTest implements PermissionTest {

    private Context mContext;

    LocationCoarseTest(Context context) {
        this.mContext = context;
    }

    @Override
    public boolean test() throws Throwable {
        LocationManager locationManager = (LocationManager)mContext.getSystemService(Context.LOCATION_SERVICE);
        List<String> providers = locationManager.getProviders(true);
        boolean networkProvider = providers.contains(LocationManager.NETWORK_PROVIDER);
        if (networkProvider) {
            return true;
        }

        PackageManager packageManager = mContext.getPackageManager();
        boolean networkHardware = packageManager.hasSystemFeature(PackageManager.FEATURE_LOCATION_NETWORK);
        if (!networkHardware) return true;

        return !locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
    }
}