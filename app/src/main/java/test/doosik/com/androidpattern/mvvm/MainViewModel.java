package test.doosik.com.androidpattern.mvvm;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import test.doosik.com.androidpattern.R;
import test.doosik.com.androidpattern.ResultReceiver;

/**
 * Created by 1100038 on 16. 8. 9..
 */
public class MainViewModel {

    private Activity activity;
    private MainModel mainModel;
    private TextView textView;

    public MainViewModel(Activity activity) {
        this.activity = activity;
        this.mainModel = new MainModel();
        initView(activity);
    }

    private void initView(final Activity activity) {

        textView = (TextView) activity.findViewById(R.id.textView4);

        activity.findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainModel.getClickedTest(new ResultReceiver() {
                    @Override
                    public void getText(final String str) {
                        activity.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                textView.setText(str);
                            }
                        });
                    }
                });
            }
        });

    }

}
