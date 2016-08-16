package test.doosik.com.androidpattern.mvc;

import test.doosik.com.androidpattern.ResultReceiver;

/**
 * Created by 1100038 on 16. 8. 9..
 */
public class MainModel {
    public void getClickText(final ResultReceiver receiver) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    receiver.getText("Work finished");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
