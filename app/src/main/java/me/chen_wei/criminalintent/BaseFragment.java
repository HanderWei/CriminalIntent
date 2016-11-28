package me.chen_wei.criminalintent;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;

import java.util.List;

import pub.devrel.easypermissions.AppSettingsDialog;
import pub.devrel.easypermissions.EasyPermissions;

/**
 * author: Chen Wei time: 16/11/28 desc: 描述
 */

public abstract class BaseFragment extends Fragment implements EasyPermissions.PermissionCallbacks{

    private static final String TAG = "BaseFragment";

    private static final int PERMANENTLY_DENIED_REQUEST_CODE = 687;

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void onPermissionsGranted(int requestCode, List<String> perms) {
        Log.d(TAG, "onPermissionsGranted: " + perms.size() + " permissions granted.");
    }

    @Override
    public void onPermissionsDenied(int requestCode, List<String> perms) {
        if (EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
            new AppSettingsDialog.Builder(this, getString(R.string.rationale))
                    .setTitle(getString(R.string.rationale_title))
                    .setPositiveButton(getString(R.string.setting))
                    .setNegativeButton(getString(android.R.string.cancel), null /* click listener */)
                    .setRequestCode(PERMANENTLY_DENIED_REQUEST_CODE)
                    .build()
                    .show();
        }
    }
}
