package ebe.P_Judakov.s.JAVABOT.service.jpa;

import ebe.P_Judakov.s.JAVABOT.domen.entity.interfaces.Chat;
import ebe.P_Judakov.s.JAVABOT.domen.entity.interfaces.User;
import ebe.P_Judakov.s.JAVABOT.service.interfaces.ChatService;

import java.util.List;

public class JpaChatService implements ChatService {

    @Override
    public Chat createChat(Chat chat) {
        return null;
    }

    @Override
    public Chat getChatById(int chatId) {
        return null;
    }

    @Override
    public Chat addUserToChat(int chatId, User user) {
        return null;
    }

    @Override
    public void deleteChat(int chatId) {
    }

    @Override
    public List<User> getUsersInChat(int chatId) {
        return null;
    }
}
