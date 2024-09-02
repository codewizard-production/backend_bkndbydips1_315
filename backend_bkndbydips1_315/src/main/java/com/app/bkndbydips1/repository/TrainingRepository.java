package com.app.bkndbydips1.repository;

import com.app.bkndbydips1.model.Training;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class TrainingRepository extends SimpleJpaRepository<Training, String> {
    private final EntityManager em;
    public TrainingRepository(EntityManager em) {
        super(Training.class, em);
        this.em = em;
    }
    @Override
    public List<Training> findAll() {
        return em.createNativeQuery("Select * from \"bkndbydips1\".\"Training\"", Training.class).getResultList();
    }
}