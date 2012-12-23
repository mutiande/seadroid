package com.seafile.seadroid;

import java.util.List;

public class NavContext {

    List<SeafRepo> repos = null;
    String currentRepo;
    List<SeafDirent> currentDirents;
    String currentPath;
    
    public NavContext() {
        repos = null;
        currentRepo = null;
        currentDirents = null;
        currentPath = null;
    }
 
    public void clear() {
        repos = null;
        currentRepo = null;
        currentDirents = null;
        currentPath = null;
    }
    
    public boolean inRepo() {
        return currentRepo != null;
    }
    
    public String getRepoAtPosition(int position) {
        return repos.get(position).id;
    }
    
    public String getCurrentRepo() {
        return currentRepo;
    }
    
    public SeafDirent getDirent(int position) {
        return currentDirents.get(position);
    }
    
    public boolean isDir(int position) {
        return currentDirents.get(position).isDir();
    }
    
    public String getPathAtPosition(int position) {
        return currentPath + "/" + currentDirents.get(position).name;
    }
    
    public boolean isRootDir() {
        return currentPath.equals("/");
    }
    
    public String getParentPath() {
        return currentPath.substring(0, currentPath.lastIndexOf("/"));
    }

    public String getObjectIDAtPosition(int position) {
        return currentDirents.get(position).id;
    }

}
