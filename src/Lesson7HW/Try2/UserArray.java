package Lesson7HW.Try2;

import java.util.Arrays;

public class UserArray {
    private String[] users = {"Коля","Вася","Петя","Влад","Женя"};

    public boolean addUser(int index, String value){
        String[] usersNew = new String[users.length+2];
        for(int i = 0;i<usersNew.length;i++){
            if(i != index){
                usersNew[i] = users[i];
            }else if(i==index){
                usersNew[i] = value;
                System.arraycopy(users,index,usersNew,index+1,users.length-index);
                break;
            }
        }
        for(int i = 0;i<usersNew.length;i++){
            System.out.println(usersNew[i]);
        }
        System.out.println(usersNew.length);
        return false;
    }

    public boolean addUserValue(String value){
        String[] usersNew = new String[users.length+2];
        usersNew = Arrays.copyOf(users,users.length+2);
        for (int i = 0; i < usersNew.length;i++){
            if(usersNew[i]==null){
                usersNew[i]=value;
                break;
            }
        }
        for(int i = 0;i<usersNew.length;i++){
            System.out.println(usersNew[i]);
        }return false;
    }

    public boolean deleteIndex(int index){
        String[] usersNew = new String[users.length+2];
        for(int i = 0;i<usersNew.length;i++) {
            if (i != index) {
                usersNew[i] = users[i];
            } else if (i == index) {

                System.arraycopy(users, index, usersNew, index-1, users.length - index);
                break;
            }
        }
        for(int i = 0;i<usersNew.length;i++){
            System.out.println(usersNew[i]);
        }return false;
    }

    public boolean deleteValue(String value){
        String[] usersNew = new String[users.length+2];
        for(int i = 0;i<usersNew.length;i++){
            if(users[i]!=value){
                usersNew[i]=users[i];
            } else if (users[i]==value) {
                System.arraycopy(users,i+1,usersNew,i,users.length - i-1);
                break;
            }
        }for(int i = 0;i<usersNew.length;i++){
            System.out.println(usersNew[i]);
        }return false;
    }

    public void getFromIndex (int index){
        for(int i = 0;i<users.length;i++){
            if(i==index){
                System.out.println(users[i]);
            }
        }
    }


}
