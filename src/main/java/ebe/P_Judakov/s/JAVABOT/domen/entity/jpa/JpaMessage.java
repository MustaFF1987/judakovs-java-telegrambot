package ebe.P_Judakov.s.JAVABOT.domen.entity.jpa;

import ebe.P_Judakov.s.JAVABOT.domen.entity.interfaces.Chat;
import ebe.P_Judakov.s.JAVABOT.domen.entity.interfaces.Message;
import ebe.P_Judakov.s.JAVABOT.domen.entity.interfaces.User;
import jakarta.persistence.*;

import java.util.Date;

public class JpaMessage implements Message {


    @Entity
    @Table(name = "message")
    public class Message {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private int messageId;
        private String text;
        private Date date;

        @ManyToOne
        @JoinColumn(name = "user_id")
        private User user;

        @ManyToOne
        @JoinColumn(name = "chat_id")
        private Chat chat;

        public Message(int id) {
            this.id = id;
        }

        public Message(int id, int messageId, String text, Date date, User user, Chat chat) {
            this.id = id;
            this.messageId = messageId;
            this.text = text;
            this.date = date;
            this.user = user;
            this.chat = chat;
        }

        public int getId() {
            return id;
        }

        public int getMessageId() {
            return messageId;
        }

        public String getText() {
            return text;
        }

        public Date getDate() {
            return date;
        }

        public User getUser() {
            return user;
        }

        public Chat getChat() {
            return chat;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setMessageId(int messageId) {
            this.messageId = messageId;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public void setChat(Chat chat) {
            this.chat = chat;
        }

        @Override
        public String toString() {
            return "Message{" +
                    "id=" + id +
                    ", messageId=" + messageId +
                    ", text='" + text + '\'' +
                    ", date=" + date +
                    ", user=" + user +
                    ", chat=" + chat +
                    '}';
        }
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public int getMessageId() {
        return 0;
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public Date getDate() {
        return null;
    }

}
