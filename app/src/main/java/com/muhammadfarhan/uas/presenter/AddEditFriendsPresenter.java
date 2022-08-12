package com.muhammadfarhan.uas.presenter;

import android.content.Context;
import android.widget.EditText;

import com.muhammadfarhan.uas.data.model.Friends;
import com.muhammadfarhan.uas.data.repo.FriendsRepository;
import com.muhammadfarhan.uas.view.AddEditFriendsView;



public class AddEditFriendsPresenter {

    private FriendsRepository repo;
    private AddEditFriendsView view;

    public AddEditFriendsPresenter(Context context, AddEditFriendsView view) {
        this.view = view;
        repo = new FriendsRepository(context);
    }

    public void isEdit(int type) {
        if (type == 1) {
            view.showData();
        }
    }

    public void addFriend(Friends friend) {
        try {
            repo.insertFriend(friend);
            view.onFriendAdded();
        } catch (Exception ex) {
            view.showFailed("Failed to add friend, NIM "+friend.getNim()+" already used");
        }
    }

    public void updateFriend(Friends friend) {
        try {
            repo.updateFriend(friend);
            view.onFriendUpdated(friend);
        } catch (Exception ex) {
            view.showFailed("Failed to update friend, NIM "+friend.getNim()+" already used");
        }
    }

    public void setError(EditText et) {
        view.showError(et);
    }
}
