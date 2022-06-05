package mentoring.levelone.javacoreleveltwo.collections.partone.tasktwo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import mentoring.levelone.javacoreleveltwo.collections.partone.AbstractChat;
import mentoring.levelone.javacoreleveltwo.collections.partone.Chat;

import java.util.List;

@Getter
@Setter
@ToString
public class ChatWithUsers extends AbstractChat implements Chat {

    private List<User> users;

    public ChatWithUsers(String name, List<User> users) {
        super(name);
        this.users = users;
    }

    public static int getInt() {
        return 0;
    }

    @Override
    public int getNumberOfUsers() {
        return 0;
    }

    @Override
    public int compareTo(Chat o) {
        return getName().compareTo(o.getName());
    }
}
