package behavioral.memento;

public class Notepad {

    private String metin;

    public Notepad(String metin) {
        this.metin = metin;
    }

    public Notepad() {
        metin = "";
    }

    public String getMetin() {
        return metin;
    }


    public void ekle(String eklenecekMetin) {

        metin = metin + eklenecekMetin;
    }

    public NotepadMemento kaydet() {
        return new NotepadMemento(metin);
    }

    public void geriDon(NotepadMemento memento) {
        metin = memento.getMetin();
    }

    public void yazdir() {
        System.out.println(metin);
    }
}
