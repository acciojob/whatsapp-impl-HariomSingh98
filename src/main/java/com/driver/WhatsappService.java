package com.driver;


import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service

public class WhatsappService {

   WhatsappRepository repo = new WhatsappRepository();

   public String createUser(String name,String mobile) throws Exception
   {
       return createUser(name,mobile);
   }

   public Group createGroup(List<User> members)
   {
       return createGroup(members);
   }

   public int createMessage(String content){
       return createMessage(content);
   }
    public int sendMessage(Message message, User sender, Group group) throws Exception
    {
        return sendMessage(message,sender,group);
    }

    public String changeAdmin(User approver, User user, Group group) throws Exception{

       return changeAdmin(approver, user, group);
    }

    public int removeUser(User user) throws Exception{
       return removeUser(user);
    }

    public String findMessage(Date start, Date end, int K) throws Exception{
       return findMessage(start, end, K);
    }


}

