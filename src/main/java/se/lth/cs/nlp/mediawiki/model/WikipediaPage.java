/**
 * This file is part of Wikiforia.
 * <p>
 * Wikiforia is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * Wikiforia is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */
package se.lth.cs.nlp.mediawiki.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import se.lth.cs.nlp.wikipedia.ds.Mention;
import se.lth.cs.nlp.wikipedia.ds.MentionsAndText;

import java.util.List;

/**
 * Represents a parsed page that is assumed to belong to a wikipedia dump.
 */
public class WikipediaPage extends Page {
    private final String text;
    private List<Mention> mentions;

    public WikipediaPage(Page page, MentionsAndText ms) {
        super(page.getHeader(), page.getId(), page.getTitle(), page.getContent(), page.getRevision(), page.getNamespace(), page.getFormat());
        this.text = ms.text;
        this.mentions = ms.mentions;
    }

    public String getText() {
        return text;
    }

    public List<Mention> getMentions() {
        return mentions;
    }
}
