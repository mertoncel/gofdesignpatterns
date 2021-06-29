package behavioral.memento;

public class App {

    /**
     *https://www.tutorialspoint.com/design_pattern/memento_pattern.htm#:~:text=Memento%20pattern%20uses%20three%20actor,classes%20Memento%2C%20Originator%20and%20CareTaker.
     *
     * Memento pattern is used to restore state of an object to a previous state. Memento pattern falls under behavioral pattern category.
     *
     * @param args
     */

    public static void main(String[] args) {
        Hafiza hafiza = new Hafiza();

        Notepad notepad = new Notepad();
        notepad.ekle("B");
        notepad.ekle("A");
        notepad.ekle("H");
        notepad.ekle("A");
        versiyonKaydet(hafiza, notepad);

        notepad.ekle("DIR");
        versiyonKaydet(hafiza, notepad);

        hataliNoktaKoy(notepad);

        geriAl(hafiza, notepad);

        versiyonKaydet(hafiza, notepad);

        notepad.ekle(" MEMİŞ");
        versiyonKaydet(hafiza, notepad);

        hataliNoktaKoy(notepad);

        geriAl(hafiza, notepad);

        geriAl(hafiza, notepad);

        geriAl(hafiza, notepad);

        // bu hata verir çünkü artık elimizde başka versiyon yok
        //geriAl(hafiza, notepad);




    }

    private static void geriAl(Hafiza hafiza, Notepad notepad) {
        notepad.geriDon(hafiza.sonVersiyonuGetir());
        notepad.yazdir();
    }

    private static void hataliNoktaKoy(Notepad notepad) {
        notepad.ekle(".");
        notepad.yazdir();
    }

    private static void versiyonKaydet(Hafiza hafiza, Notepad notepad) {
        NotepadMemento memento = notepad.kaydet();
        hafiza.ekle(memento);
        notepad.yazdir();
    }
}
