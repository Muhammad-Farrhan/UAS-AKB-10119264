package com.muhammadfarhan.uas.view;

import com.muhammadfarhan.uas.data.model.User;



public interface HomeView {
    void showUser(User user);
    void onSignOut();
}
