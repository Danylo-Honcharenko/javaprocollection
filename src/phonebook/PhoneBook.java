package phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Record> phoneBook;

    public PhoneBook() {
        this.phoneBook = new ArrayList<>();
    }

    public void add(Record record) {
        phoneBook.add(record);
    }

    public Record find(String name) {
        for(Record rec: phoneBook) {
            if(rec.getName().equals(name)) {
                return rec;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> foundRecords = new ArrayList<>();
        for(Record rec: phoneBook) {
            if(rec.getName().equals(name)) {
                foundRecords.add(rec);
            }
        }

        if(foundRecords.isEmpty()) {
            return null;
        }
        return foundRecords;
    }
}
