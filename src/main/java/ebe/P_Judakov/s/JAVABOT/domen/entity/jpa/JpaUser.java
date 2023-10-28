package ebe.P_Judakov.s.JAVABOT.domen.entity.jpa;

import ebe.P_Judakov.s.JAVABOT.domen.entity.interfaces.Chat;
import ebe.P_Judakov.s.JAVABOT.domen.entity.interfaces.Message;
import ebe.P_Judakov.s.JAVABOT.domen.entity.interfaces.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Objects;

import java.util.List;

@Entity
@Table(name = "user")
public class JpaUser implements User  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username")
    @NotBlank(message = "UserName is required")
    private String username;

    @Column(name = "firstname")
    @NotBlank(message = "FirstName is required")
    private String firstName;

    @Column(name = "lastname")
    @NotBlank(message = "LastName is required")
    private String lastName;

    @ManyToMany(mappedBy = "users")
    private List<Chat> chats;

    @OneToMany(mappedBy = "user")
    private List<Message> messages;

    public JpaUser(int id) {
        this.id = id;
    }

    public JpaUser(int id, String username, String firstName, String lastName, List<Chat> chats, List<Message> messages) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.chats = chats;
        this.messages = messages;
    }

    @Override
    public int getId() {
        return 0;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getUserName() {
        return null;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Chat> getChats() {
        return chats;
    }

    public void setChats(List<Chat> chats) {
        this.chats = chats;
    }

    public List<Message> getMessages() {
        return messages;
    }
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "JpaUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", chats=" + chats +
                ", messages=" + messages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JpaUser jpaUser)) return false;
        return Objects.equals(id, jpaUser.id) && Objects.equals(username, jpaUser.username) && Objects.equals(firstName, jpaUser.firstName) && Objects.equals(lastName, jpaUser.lastName) && Objects.equals(chats, jpaUser.chats) && Objects.equals(messages, jpaUser.messages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, firstName, lastName, chats, messages);
    }

}



