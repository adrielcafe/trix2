package trix2.messaging;

import trix2.config.messaging.MessageExecutor;
import org.springframework.stereotype.Component;

/**
 * Created by misael on 24/11/2015.
 */
@Component("UpdateCache")
public class UpdateCacheExecutor implements MessageExecutor {

    @Override
    public void execute(Object message) {
		org.jcodec.common.logging.Logger.info(message + "");
    }
}
