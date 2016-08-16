package test.doosik.com.androidpattern.mvp;

/**
 * Created by 1100038 on 16. 8. 9..
 */
public interface MainPresenter {
    void setView(MainPresenter.View view);

    void onConfirm();

    interface View {
        void setConfirmText(String text);
    }
}
