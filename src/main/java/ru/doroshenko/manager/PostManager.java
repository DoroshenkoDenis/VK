package ru.doroshenko.manager;

import ru.doroshenko.domain.WallPost;

public class PostManager {
    private WallPost[] post;

    public WallPost[] search(int idPostOwner, String domain, String query, boolean ownersOnly, int count, int offset) {
        // add search logic
        return null;
    }

    public void delete(int id, int idPostOwner) {
        // add delete logic
    }
}

