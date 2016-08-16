package test.doosik.com.androidpattern.mvcannotation;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EBean;

import test.doosik.com.androidpattern.ResultReceiver;

/**
 * Created by 1100038 on 16. 8. 10..
 */
@EBean
public class MainModel {

    @Background
    public void getString(final ResultReceiver resultReceiver) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resultReceiver.getText("Work finished");
    }

}
