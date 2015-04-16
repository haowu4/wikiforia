/**
 * This file is part of Wikiforia.
 *
 * Wikiforia is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * Wikiforia is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Wikiforia. If not, see <http://www.gnu.org/licenses/>.
 */
 package se.lth.cs.nlp.wikipedia.lang;

//Autogenerated from Wikimedia sources at 2015-04-16T13:55:11+00:00

public class GotConfig extends TemplateConfig {
	public GotConfig() {
		addNamespaceAlias(2, "𐌽𐌹𐌿𐍄𐌰𐌽𐌳𐍃");
		addNamespaceAlias(3, "𐌽𐌹𐌿𐍄𐌰𐌽𐌳𐌹𐍃_𐌲𐌰𐍅𐌰𐌿𐍂𐌳𐌾𐌰");
		addNamespaceAlias(5, "𐌸𐌹𐍃_Wikipedia_𐌲𐌰𐍅𐌰𐌿𐍂𐌳𐌾𐌰");
		addNamespaceAlias(6, "𐍆𐌴𐌹𐌻𐌰");
		addNamespaceAlias(7, "𐍆𐌴𐌹𐌻𐌹𐌽𐍃_𐌲𐌰𐍅𐌰𐌿𐍂𐌳𐌾𐌰");
		addNamespaceAlias(10, "𐍆𐌰𐌿𐍂𐌰𐌼𐌴𐌻𐌴𐌹𐌽𐍃");
		addNamespaceAlias(11, "𐍆𐌰𐌿𐍂𐌰𐌼𐌴𐌻𐌴𐌹𐌽𐌰𐌹𐍃_𐌲𐌰𐍅𐌰𐌿𐍂𐌳𐌾𐌰");
		addNamespaceAlias(12, "𐌷𐌹𐌻𐍀𐌰");
		addNamespaceAlias(13, "𐌷𐌹𐌻𐍀𐍉𐍃_𐌲𐌰𐍅𐌰𐌿𐍂𐌳𐌾𐌰");
		addNamespaceAlias(14, "𐌷𐌰𐌽𐍃𐌰");
		addNamespaceAlias(15, "𐌷𐌰𐌽𐍃𐍉𐍃_𐌲𐌰𐍅𐌰𐌿𐍂𐌳𐌾𐌰");

	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://got.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "got";
	}
}
