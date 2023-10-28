package ebe.P_Judakov.s.JAVABOT.domen.entity.jpa;

import ebe.P_Judakov.s.JAVABOT.domen.entity.interfaces.Chat;
import ebe.P_Judakov.s.JAVABOT.domen.entity.interfaces.Message;
import ebe.P_Judakov.s.JAVABOT.domen.entity.interfaces.User;
import jakarta.persistence.*;

import java.util.List;

public class JpaChat implements Chat {

    @Entity
    @Table(name = "chat")
    public class Chat {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private int chatId;
        private String type;

        @ManyToMany
        @JoinTable(
                name = "user_chat",
                joinColumns = @JoinColumn(name = "chat_id"),
                inverseJoinColumns = @JoinColumn(name = "user_id")
        )
        private List<User> users;

        @OneToMany(mappedBy = "chat")
        private List<Message> messages;

        public Chat(int id) {
            this.id = id;
        }

        public Chat(int id, int chatId, String type, List<User> users, List<Message> messages) {
            this.id = id;
            this.chatId = chatId;
            this.type = type;
            this.users = users;
            this.messages = messages;

        }

        @Override
        public String toString() {
            return "Chat{" +
                    "id=" + id +
                    ", chatId=" + chatId +
                    ", type='" + type + '\'' +
                    ", users=" + users +
                    ", messages=" + messages +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getChatId() {
            return chatId;
        }

        public void setChatId(int chatId) {
            this.chatId = chatId;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<User> getUsers() {
            return users;
        }

        public void setUsers(List<User> users) {
            this.users = users;
        }

        public List<Message> getMessages() {
            return messages;
        }

        public void setMessages(List<Message> messages) {
            this.messages = messages;
        }
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public int getChatId() {
        return 0;
    }

    @Override
    public String getType() {
        return null;
    }

}
