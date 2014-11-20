package org.dealer.SpringHelloWorld.model;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountJDBCTemplate implements AccountDAO {
	
	private DataSource ds;
	private JdbcTemplate jdbcTmplObj; 

	public void setDataSource(DataSource ds) {
		this.ds = ds;
	    this.jdbcTmplObj = new JdbcTemplate(ds);
	}

	public List<Account> listAccounts() {
		String SQL = "select id, duns_num, name from accounts";
	      List <Account> accounts = jdbcTmplObj.query(SQL,new AccountsMapper());
	      return accounts;
	}

}
