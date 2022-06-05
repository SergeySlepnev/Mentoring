package mentoring.levelone.javacoreleveltwo.collections.partone.taskone.comaparator;

import mentoring.levelone.javacoreleveltwo.collections.partone.Chat;

import java.util.Comparator;

public class ChatNameComparator implements Comparator<Chat> {

    @Override
    public int compare(Chat chatOne, Chat chatTwo) {
        return chatOne.getName().compareTo(chatTwo.getName());
    }
}
