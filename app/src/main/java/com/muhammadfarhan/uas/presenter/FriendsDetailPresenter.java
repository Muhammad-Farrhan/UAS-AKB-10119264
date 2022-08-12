package com.muhammadfarhan.uas.presenter;

import android.content.Context;

import com.muhammadfarhan.uas.data.model.Friends;
import com.muhammadfarhan.uas.data.repo.FriendsRepository;
import com.muhammadfarhan.uas.view.FriendsDetailView;



public class FriendsDetailPresenter {

    private FriendsDetailView view;
    private FriendsRepository repo;

    public FriendsDetailPresenter(Context context, FriendsDetailView view) {
        this.view = view;
        repo = new FriendsRepository(context);
    }

    public void getFriendsDetail(Friends fr) {
        view.showDetail(fr);
    }

    public void makeCall() {
        view.actionCall();
    }

    public void sendEmail() {
        view.actionEmail();
    }

    public void openInstagram() {
        view.actionInstagram();
    }

    public void removeFriend(Friends friend) {
        repo.deleteFriend(friend);
        view.onFriendDeleted();
    }
}
