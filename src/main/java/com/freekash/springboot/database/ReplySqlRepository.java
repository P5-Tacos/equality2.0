package com.freekash.springboot.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ReplySqlRepository {
    @Autowired
    private ReplyJpaRepository jpa;

    public void save(Reply reply) {
        jpa.save(reply);
    }

    public Reply get(long id) {
        return jpa.findById(id).get();
    }

    public void delete(long id) {
        jpa.deleteById(id);
    }
    public List<Reply> listAll() {
        return jpa.findAll();
    }

}
