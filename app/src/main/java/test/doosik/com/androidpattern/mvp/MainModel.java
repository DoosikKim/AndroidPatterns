package test.doosik.com.androidpattern.mvp;

import test.doosik.com.androidpattern.ResultReceiver;

/**
 * Created by 1100038 on 16. 8. 9..
 */
public class MainModel {
    public void getClickedText(final ResultReceiver receiver) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                receiver.getText("Work finished");
            }
        }).start();

    }
}
