package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Hafiza {

    private List<NotepadMemento> list;

    public Hafiza() {
        list = new ArrayList<>();
    }

    public void ekle(NotepadMemento memento) {
       list.add(memento);
    }

    public NotepadMemento sonVersiyonuGetir() {

        if (!list.isEmpty()) {
            NotepadMemento sonVersiyon = list.get(list.size() - 1);

            list.remove(sonVersiyon);

            return sonVersiyon;
        } else {
            throw new ArrayIndexOutOfBoundsException("Yüklü versiyon bulunamadı");
        }
    }
}
