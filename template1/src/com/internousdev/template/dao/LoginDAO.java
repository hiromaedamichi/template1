package com.internous.template.dao;

import com.internous.template.dto.LoginDTO;

public class LoginDAO {
	
	private DBConnector dbconnector = new DBConnector();
	
	private Connection connection = dbConnector.getConnection();
	
	private LoginDTO loginDTO = new LoginDTO();
	
	
	public LoginDTO getLonginUserInfo(String loginUserId,String loginPassword) {
		String sql = "SELECT * FROM login_user_transactionwhere login_id = ? AND login_pass = ?";
		
	 
		try{
			PrepareadStatement preparedStatement =
			connection.preparedStatement(sql);
			preparedStatement.setString(1,loginUserId);
			preparedStatement.setString(2,loginPassword);
			
			if(resultSet.next()) {
				loginDTO.setLoginId(resultSet.getString("login_id"));
				loginDTO.setLoginPassword(resultSet.getString("login_pass"));
				loginDTO.setUserName(resultSet.getString("user_name"));
				
				if(!(resultSet.getString("login_id").equals(null))) {
					loginDTO.setLoginFlg(true);       
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return loginDTO;
	}
	public LoginDTO getLoginDTO() {
		return loginDTO;
	}
	}
