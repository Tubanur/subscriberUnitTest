package com.example.subscriber.unitTest.repository;

import com.example.subscriber.unitTest.model.Subscriber;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {

    @Override
    List<Subscriber> findAll();

    List<Subscriber> findAllByName(String name);
    List<Subscriber> findAllById(Long id);

    void deleteById(Long id);
    long countAllByName(String name);
}
