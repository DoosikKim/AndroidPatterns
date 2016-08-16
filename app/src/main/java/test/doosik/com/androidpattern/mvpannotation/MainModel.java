package test.doosik.com.androidpattern.mvpannotation;

import org.androidannotations.annotations.EBean;

import test.doosik.com.androidpattern.ResultReceiver;

/**
 * Created by 1100038 on 16. 8. 16..
 */
@EBean
public class MainModel {
    public void getText(ResultReceiver resultReceiver) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resultReceiver.getText("Work finished");
    }
}
