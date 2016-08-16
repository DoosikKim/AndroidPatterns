package test.doosik.com.androidpattern.mvp;

import android.app.Activity;

import test.doosik.com.androidpattern.ResultReceiver;

/**
 * Created by 1100038 on 16. 8. 9..
 */
public class MainPresenterImpl implements MainPresenter {

    private Activity activity;
    private MainPresenter.View view;
    private MainModel mainModel;

    public MainPresenterImpl(Activity activity) {
        this.activity = activity;
        this.mainModel = new MainModel();
    }

    @Override
    public void setView(View view) {
        this.view = view;
    }

    @Override
    public void onConfirm() {
        mainModel.getClickedText(new ResultReceiver() {
            @Override
            public void getText(String str) {
                view.setConfirmText(str);
            }
        });
    }
}
