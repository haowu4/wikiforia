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

public class AmConfig extends TemplateConfig {
	public AmConfig() {
		addNamespaceAlias(-2, "ፋይል");
		addNamespaceAlias(-1, "ልዩ");
		addNamespaceAlias(1, "ውይይት");
		addNamespaceAlias(2, "አባል");
		addNamespaceAlias(3, "አባል_ውይይት");
		addNamespaceAlias(5, "Wikipedia_ውይይት");
		addNamespaceAlias(6, "ስዕል");
		addNamespaceAlias(7, "ስዕል_ውይይት");
		addNamespaceAlias(8, "መልዕክት");
		addNamespaceAlias(9, "መልዕክት_ውይይት");
		addNamespaceAlias(10, "መለጠፊያ", "መልጠፊያ");
		addNamespaceAlias(11, "መለጠፊያ_ውይይት", "መልጠፊያ_ውይይት");
		addNamespaceAlias(12, "እርዳታ");
		addNamespaceAlias(13, "እርዳታ_ውይይት");
		addNamespaceAlias(14, "መደብ");
		addNamespaceAlias(15, "መደብ_ውይይት");

	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://am.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "am";
	}
}
