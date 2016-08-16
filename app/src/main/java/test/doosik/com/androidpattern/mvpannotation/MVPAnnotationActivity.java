package test.doosik.com.androidpattern.mvpannotation;

import android.app.Activity;
import android.widget.TextView;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;

import test.doosik.com.androidpattern.R;

/**
 * Created by 1100038 on 16. 8. 16..
 */
@EActivity(R.layout.activity_mvp_annotation)
public class MVPAnnotationActivity extends Activity implements View {

    @Bean(PresenterImpl.class)
    Presenter mainPresenter;

    @ViewById(R.id.textView5)
    TextView textView;

    @AfterInject
    void initObject() {
        mainPresenter.setView(this);
    }

    @Click(R.id.button5)
    void onClickEvent() {
        mainPresenter.onInfoRequest();
    }

    @UiThread
    @Override
    public void setResultText(String result) {
        textView.setText(result);
    }

}
