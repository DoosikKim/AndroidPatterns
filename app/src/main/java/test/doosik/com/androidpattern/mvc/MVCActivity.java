package test.doosik.com.androidpattern.mvc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import test.doosik.com.androidpattern.R;
import test.doosik.com.androidpattern.ResultReceiver;

/**
 * Created by dskim98 on 16. 8. 9..
 */
public class MVCActivity extends Activity {

    MainModel mainModel;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);

        textView = (TextView)findViewById(R.id.textView1);

        mainModel = new MainModel();

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainModel.getClickText(new ResultReceiver() {
                    @Override
                    public void getText(final String str) {
                        runOnUiThread(new Runnable() {
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