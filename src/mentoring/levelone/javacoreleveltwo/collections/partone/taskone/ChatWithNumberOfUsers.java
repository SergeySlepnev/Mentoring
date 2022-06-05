package mentoring.levelone.javacoreleveltwo.collections.partone.taskone;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import mentoring.levelone.javacoreleveltwo.collections.partone.AbstractChat;
import mentoring.levelone.javacoreleveltwo.collections.partone.Chat;
import mentoring.levelone.javacoreleveltwo.collections.partone.tasktwo.User;

import java.util.List;

@Getter
@Setter
@ToString
public class ChatWithNumberOfUsers extends AbstractChat implements Chat {

    private int numberOfUsers;

    public ChatWithNumberOfUsers(String name, int numberOfUsers) {
        super(name);
        this.numberOfUsers = numberOfUsers;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public int compareTo(Chat o) {
        return getName().compareTo(o.getName());
    }
}
