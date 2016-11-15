package io.mangue.services;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by misael on 23/10/2015.
 */
@Service
public class AsyncService {

    @Async
    public void asyncTest(){
        try {
            Thread.sleep(5000);
			org.jcodec.common.logging.Logger.info("Isso é um teste");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
