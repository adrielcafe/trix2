package trix2.config.messaging;

import trix2.dtos.MessageDTO;

public interface IPublisher {
    public void publish(MessageDTO message);
}