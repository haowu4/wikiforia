package se.lth.cs.nlp.wikipedia.ds;

/**
 * Created by haowu4 on 7/30/17.
 */
public class Mention {
    public int start;
    public int end;
    public String url;

    public Mention(int start, int end, String url) {
        this.start = start;
        this.end = end;
        this.url = url;
    }
}
