package com.internous.template.action;

import java.util.Map;

public class LoginAction extends ActionSupport implements SessionAware{

	private String loginUserId;

	private String loginPassword;

	private String result;

	public Map<String,Object> session;

	private LoginDAO loginDAO = new LoginDAO();

	private LoginDTO loginDTO = new LoginDTO();

	private BuyItemDAO buyItemDAO = newItemDAO();

	public String execute () {

		result = ERROR;

		loginDTO=loginDAO.getLoginUserInfo(loginUserId,loginPassword);

		session.put("loginUser",loginDTO);

		if(((LoginDTO)
				session.get("loginUser")).getLogiinFlg()) {
			 result = SUCCESS;

			 BuyItemDTO buyItemDTO = buyItemDAO. getBuyItemInfo();
			 session.put("login_user_id",loginDTO.getLoginId());
			 loginDTO.getLoginId());
			 session.put("id",buyItemDTO.getId());
			 session.put("buyItem_name",buyItemDTO.getItemName());
			 session.put("buyItem_price",buyItemDTO.getItemPrice());

			 return result;
		}

		return result;
		
	}
	public String getLoginUserId() {
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	@Override
	public void setSession(Map<String, Object> session) {
	 this.session = session;
}














}
	}

}
