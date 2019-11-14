package com.tyss.benchmanage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.tyss.benchmanage.dto.User;

@Repository
public class UserDaoImpli implements UserDao{
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public User register(User user) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
		}catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		User u=manager.find(User.class, user.getId());
		if(u==null) {
			return null;
		}
		return u;
	}

	@Override
	public User login(String email, String password) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		String loginQuery="from User where email=:email and password=:password";
		Query jqry=manager.createQuery(loginQuery);
		jqry.setParameter("email", email);
		jqry.setParameter("password", password);
		User user=(User) jqry.getSingleResult();
		if(user==null) {
			return null;
		}
		return user;
	}

	@Override
	public List<User> getAll(String role) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		String query="from User where role=:role";
		Query jqry=manager.createQuery(query);
		List<User> users=jqry.getResultList();
		if(users==null) {
			return null;
		}
		return users;
	}

}
