package test.doosik.com.androidpattern.mvvm;

import android.app.Activity;
import android.os.Bundle;

import test.doosik.com.androidpattern.R;

/**
 * Created by 1100038 on 16. 8. 9..
 */
public class MVVMActivity extends Activity {

    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvvm);

        mainViewModel = new MainViewModel(MVVMActivity.this);

    }
}
