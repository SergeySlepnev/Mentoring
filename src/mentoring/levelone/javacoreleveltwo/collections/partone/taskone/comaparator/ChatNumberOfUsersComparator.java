package mentoring.levelone.javacoreleveltwo.collections.partone.taskone.comaparator;

import mentoring.levelone.javacoreleveltwo.collections.partone.Chat;

import java.util.Comparator;

public class ChatNumberOfUsersComparator implements Comparator<Chat> {

    @Override
    public int compare(Chat chatOne, Chat chatTwo) {
        return Integer.compare(chatOne.getNumberOfUsers(), chatTwo.getNumberOfUsers());
    }
}
