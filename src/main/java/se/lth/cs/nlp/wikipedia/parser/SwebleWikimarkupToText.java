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
package se.lth.cs.nlp.wikipedia.parser;

import org.sweble.wikitext.engine.nodes.EngProcessedPage;
import se.lth.cs.nlp.mediawiki.model.Page;
import se.lth.cs.nlp.mediawiki.model.WikipediaPage;
import se.lth.cs.nlp.wikipedia.ds.MentionsAndText;
import se.lth.cs.nlp.wikipedia.lang.TemplateConfig;

import java.util.regex.Pattern;

/**
 * Sweble Wikimarkup to text
 */
public class SwebleWikimarkupToText extends SwebleWikimarkupParserBase<WikipediaPage> {

    public SwebleWikimarkupToText(TemplateConfig config) {
        super(config);
    }

    private final Pattern trimLineStartFix = Pattern.compile("^[\\t ]+", Pattern.MULTILINE);
    private final Pattern trimLineEndFix = Pattern.compile("[\\t ]+$", Pattern.MULTILINE);

    @Override
    protected WikipediaPage extract(Page page, EngProcessedPage cp) {

//        String text = page.getContent();

        SwebleTextAstWalker walker = new SwebleTextAstWalker(config);
        MentionsAndText mntext = (MentionsAndText) walker.go(cp.getPage());

//        mntext.text = text.replaceAll("\\(\\s*\\)", " ");
//        mntext.text = text.replaceAll(" {2,}", " ");
//        mntext.text = text.replaceAll("\n{2,}", "\n\n");
//        mntext.text = trimLineStartFix.matcher(text).replaceAll("");
//        mntext.text = trimLineEndFix.matcher(text).replaceAll("");
//        mntext.text = text.trim();

        return new WikipediaPage(page, mntext);
    }
}
