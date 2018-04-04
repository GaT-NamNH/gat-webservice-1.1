package com.gat.book.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.gat.book.dao.UserDao;
import com.gat.book.model.UserInfo;

public class UserDaoImpl extends AbstractDaoImpl implements UserDao {

	@Override
	public UserInfo findUserById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(UserInfo.class);
		cr.add(Restrictions.eq("userId", id));
		return cr.list().size() > 0? (UserInfo) cr.list().get(0) : null;
	}

	@Override
	public UserInfo findUserByEmail(String email) {
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(UserInfo.class);
		cr.add(Restrictions.eq("email", email));
		return cr.list().size() > 0? (UserInfo) cr.list().get(0) : null;
	}

}
