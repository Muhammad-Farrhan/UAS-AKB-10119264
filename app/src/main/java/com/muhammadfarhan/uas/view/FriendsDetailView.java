package com.muhammadfarhan.uas.view;

import com.muhammadfarhan.uas.data.model.Friends;



public interface FriendsDetailView {
    void showDetail(Friends fr);
    void actionCall();
    void actionEmail();
    void actionInstagram();
    void onFriendDeleted();
}
