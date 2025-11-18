package com.projectTask.service.userService;

import java.util.List;

import com.projectTask.model.userModel.NewsletterModel;

public interface NewsletterService {
    String[] subscribeEmail(String email);
    List<NewsletterModel> getAllEmails();
}
