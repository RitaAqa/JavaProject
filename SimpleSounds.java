import javax.sound.midi.*;

public class  SimpleSounds {


    public static void main(String[] args) {

        SimpleSounds mt = new SimpleSounds();
        if (args.length < 2) {  //102+30//80+20//40+70
            System.out.println("Do not forget set arg");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            mt.play(instrument, note);
        }

    }

    void play(int instrument, int note) {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            MidiEvent event = null;

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);


            player.setSequence(seq);

            player.start();
        } catch (Exception ex) {
            System.out.println("FAIL");
            ex.printStackTrace();
        }

    }
}








