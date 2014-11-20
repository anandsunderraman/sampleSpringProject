package org.dealer.SpringHelloWorld.model;

import java.util.List;

import javax.sql.DataSource;

public interface AccountDAO {
	
	public void setDataSource(DataSource ds);
	
	public List<Account> listAccounts();

}
