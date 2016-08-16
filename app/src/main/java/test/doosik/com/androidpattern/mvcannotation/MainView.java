package test.doosik.com.androidpattern.mvcannotation;

import android.widget.TextView;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;

import test.doosik.com.androidpattern.R;

/**
 * Created by 1100038 on 16. 8. 10..
 */
@EBean
public class MainView {

    @ViewById(R.id.textView2)
    TextView textView;

    @UiThread
    public void setText(String text) {
        textView.setText(text);
    }

}
