package se.lth.cs.nlp.wikipedia.ds;

import java.util.List;

/**
 * Created by haowu4 on 7/30/17.
 */
public class MentionsAndText {
    public List<Mention> mentions;
    public String text;

    public MentionsAndText(String text, List<Mention> mentions) {
        this.mentions = mentions;
        this.text = text;
    }
}
