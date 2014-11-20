package org.dealer.SpringHelloWorld.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AccountsMapper implements RowMapper<Account> {

	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account acct = new Account();
		acct.setAccountId(rs.getString("id"));
		acct.setDuns_num(rs.getString("duns_num"));
		acct.setAccountId(rs.getString("name"));
		return acct;
	}
}
