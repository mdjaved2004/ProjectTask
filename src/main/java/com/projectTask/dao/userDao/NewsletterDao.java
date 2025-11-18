package com.projectTask.dao.userDao;

import java.util.List;

import com.projectTask.model.userModel.NewsletterModel;

public interface NewsletterDao {
    String[] saveEmail(NewsletterModel model);
    List<NewsletterModel> getAllEmails();
}
