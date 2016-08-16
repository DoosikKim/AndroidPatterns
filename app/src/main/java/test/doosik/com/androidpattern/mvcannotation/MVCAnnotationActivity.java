package test.doosik.com.androidpattern.mvcannotation;

import android.app.Activity;
import android.view.View;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import test.doosik.com.androidpattern.R;
import test.doosik.com.androidpattern.ResultReceiver;


/**
 * Created by 1100038 on 16. 8. 9..
 */
@EActivity(R.layout.activity_mvc_annotation)
public class MVCAnnotationActivity extends Activity {

    @Bean
    MainModel mainModel;

    @Bean
    MainView mainView;

    @Click(R.id.button2)
    @Background
    void onClick(View view) {
        mainModel.getString(new ResultReceiver() {
            @Override
            public void getText(final String str) {
                mainView.setText(str);
            }
        });
    }
}
