package practicalUnitTesting.chapter9;

public class UserService {

	private UserDAO userDAO;
	
	public UserService(UserDAO dao) {
		userDAO = dao;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public User loadUser(int idUser) {
		return userDAO.getUser(idUser);
	}
}