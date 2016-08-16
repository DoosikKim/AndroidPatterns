package test.doosik.com.androidpattern.mvp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import test.doosik.com.androidpattern.R;

/**
 * Created by 1100038 on 16. 8. 9..
 */
public class MVPActivity extends Activity implements MainPresenter.View{

    private MainPresenter mainPresenter;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);

        textView = (TextView)findViewById(R.id.textView3);

        mainPresenter = new MainPresenterImpl(this);
        mainPresenter.setView(this);

        button = (Button)findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.onConfirm();
            }
        });

    }

    @Override
    public void setConfirmText(final String text) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                textView.setText(text);
            }
        });
    }
}
