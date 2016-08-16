package test.doosik.com.androidpattern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import test.doosik.com.androidpattern.mvc.MVCActivity;
import test.doosik.com.androidpattern.mvcannotation.MVCAnnotationActivity;
import test.doosik.com.androidpattern.mvp.MVPActivity;
import test.doosik.com.androidpattern.mvpannotation.MVPAnnotationActivity;
import test.doosik.com.androidpattern.mvvm.MVVMActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textView;
    Button button;

    Button mvcBtn;
    Button mvpBtn;
    Button mvvmBtn;
    Button mvcAnnotationBtn;
    Button mvpAnnotationBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);

        mvcBtn = (Button)findViewById(R.id.mvcbtn);
        mvpBtn = (Button)findViewById(R.id.mvpbtn);
        mvvmBtn = (Button)findViewById(R.id.mvvmbtn);
        mvcAnnotationBtn = (Button)findViewById(R.id.mvcannobtn);
        mvpAnnotationBtn = (Button)findViewById(R.id.mvpannobtn);

        mvcBtn.setOnClickListener(this);
        mvpBtn.setOnClickListener(this);
        mvvmBtn.setOnClickListener(this);
        mvcAnnotationBtn.setOnClickListener(this);
        mvpAnnotationBtn.setOnClickListener(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(3000);
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    textView.setText("Work finished");
                                }
                            });
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        });

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent();

        switch (v.getId()) {
            case R.id.mvcbtn:
                intent.setClassName(this, MVCActivity.class.getName());
                break;
            case R.id.mvpbtn:
                intent.setClassName(this, MVPActivity.class.getName());
                break;
            case R.id.mvvmbtn:
                intent.setClassName(this, MVVMActivity.class.getName());
                break;
            case R.id.mvcannobtn:
                intent.setClassName(this, MVCAnnotationActivity.class.getName() + "_");
                break;
            case R.id.mvpannobtn:
                intent.setClassName(this, MVPAnnotationActivity.class.getName() + "_");
                break;

        }

        startActivity(intent);
    }
}
