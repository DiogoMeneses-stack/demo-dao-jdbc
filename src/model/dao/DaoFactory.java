package model.dao;

import db.DB;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new impl.SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new impl.DepartmentDaoJDBC(DB.getConnection());
	}
}