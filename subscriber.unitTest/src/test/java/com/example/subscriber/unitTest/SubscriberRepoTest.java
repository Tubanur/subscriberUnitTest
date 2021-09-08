package com.example.subscriber.unitTest;

import com.example.subscriber.unitTest.model.Subscriber;
import com.example.subscriber.unitTest.repository.SubscriberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
@DataJpaTest
public class SubscriberRepoTest {

    @Autowired
    private SubscriberRepository subscriberRepository;

    @BeforeEach
    void initUserCase() {
        List<Subscriber> subscriber = Arrays.asList(new Subscriber("tuba","bute",2000,"woman",24,"..."),
                new Subscriber("tuba","bute",2000,"woman",24,"..."));
    subscriberRepository.saveAll(subscriber);


    }

    @AfterEach
    public void destroyAll() {
        subscriberRepository.deleteAll();
    }

    @Test
    void findAll_success() {
        List<Subscriber> allSubscriber = subscriberRepository.findAll();
        assertThat(allSubscriber.size()).isGreaterThanOrEqualTo(1);
    }


}
