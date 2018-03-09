package com.itheima.web;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午2:50:25 <br/>       
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {

    private User model = new User();
    private UserService userService;
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User getModel() {
          
        return model;
    }
    
    public String findUserById(){
       model = userService.findUserById(model.getId());
        return SUCCESS;
    }

}
  
