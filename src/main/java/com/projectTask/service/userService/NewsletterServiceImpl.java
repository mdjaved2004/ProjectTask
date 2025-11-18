package com.projectTask.service.userService;


import java.util.List;

import com.projectTask.dao.userDao.NewsletterDao;
import com.projectTask.dao.userDao.NewsletterDaoImpl;
import com.projectTask.model.userModel.NewsletterModel;
import com.projectTask.validation.NewsletterValidation;

public class NewsletterServiceImpl implements NewsletterService {

    private NewsletterDao dao = new NewsletterDaoImpl();

    @Override
    public String[] subscribeEmail(String email) {
    			String message_arr[] =new String[2];
        try {
			if(!new  NewsletterValidation().validationEmail(email)) {
			    		message_arr[1]= "Invalid Email Format!";
			    		return message_arr;
			}

			NewsletterModel model = new NewsletterModel(email);

			message_arr = dao.saveEmail(model);
			return message_arr;
		
		} catch (Exception e) {
			message_arr[1]= "Failed to Subscribe! Try again.";
			return message_arr;
		}
    }
    
    @Override
    public List<NewsletterModel> getAllEmails() {
        return dao.getAllEmails();
    }
}
