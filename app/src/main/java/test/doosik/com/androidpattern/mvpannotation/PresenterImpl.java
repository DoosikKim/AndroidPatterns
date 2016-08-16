package test.doosik.com.androidpattern.mvpannotation;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;

import test.doosik.com.androidpattern.ResultReceiver;

/**
 * Created by 1100038 on 16. 8. 16..
 */

@EBean
public class PresenterImpl implements Presenter {

    private View view;

    @Bean
    public MainModel mainModel;

    @Override
    public void setView(View view) {
        this.view = view;
    }

    @Background
    @Override
    public void onInfoRequest() {
        mainModel.getText(new ResultReceiver() {
            @Override
            public void getText(String str) {
                view.setResultText(str);
            }
        });
    }
}
