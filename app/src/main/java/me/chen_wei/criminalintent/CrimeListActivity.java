package me.chen_wei.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Hander on 16/11/22.
 *
 * Email : hander_wei@163.com
 */

public class CrimeListActivity extends SimpleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
