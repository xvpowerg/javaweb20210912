package tw.com.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import tw.com.jpa.MyUser;
@Stateless //�L���A ���n�إ��ݩ�
public class MyUserBean implements MyUserBenanLocal {
		@Inject
		EntityManager em;
	@Override
	public boolean login(MyUser myUser) {
		// TODO Auto-generated method stub
		MyUser queryMyUser =   findUserByAccount(myUser.getAccount());
		if (queryMyUser != null && queryMyUser.getPassword().equals(myUser.getPassword())) {
			return true;
		}
		return false;
	}

	@Override
	public boolean regisrter(MyUser myUser) {
		// TODO Auto-generated method stub
			
		if (isDuplicateAccount(myUser.getAccount())) {
			return false;
		}
		try {
			em.persist(myUser);	
			return true;
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		return false;
	}

	@Override
	public MyUser findUserByAccount(String account) {
		// TODO Auto-generated method stub
		MyUser myUser = null;
		TypedQuery<MyUser> query =  em.createNamedQuery("findMyUser",MyUser.class);
		query.setParameter("account", account);
		
		try {
			myUser = query.getSingleResult();	//�p�G�L��Ʒ|���Ϳ��~
			if (myUser != null) {
				 return myUser;
			 }
		}catch(Exception ex) {			
		}
	
	
		return null;
	}

	@Override
	public boolean isDuplicateAccount(String account) {
		// TODO Auto-generated method stub
		Object obj = findUserByAccount(account);
		return obj != null;
	}

	@Override
	public boolean deleteUser(MyUser myUser) {
		// TODO Auto-generated method stub
		try {
			myUser = em.merge(myUser);//���o���Y
			em.remove(myUser);
		}catch(Exception ex) {
			System.out.println("Delete:"+ex);
			return false;
		}

		return true;
	}

}
