package com.concurrent.projectconcurrentprogramming.dao;

import com.concurrent.projectconcurrentprogramming.modal.User;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImp implements UserDAO{
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<User> get(){
        Session currSession = entityManager.unwrap(Session.class);
        Query<User> query = currSession.createQuery("from User ", User.class);
        List<User> list =  query.getResultList();
        return list;
    }
    @Override
    public User get(int id){
        Session curSession = entityManager.unwrap(Session.class);
        User user = curSession.get(User.class, id);
        return user;
    }
    @Override
    public void save(User user){
        Session curSession = entityManager.unwrap(Session.class);
        curSession.saveOrUpdate(user);
    }
    @Override
    public void delete(int id){
        Session curSession = entityManager.unwrap(Session.class);
        User user = curSession.get(User.class, id);
        curSession.delete(user);
    }
}
