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

public class SwConfig extends TemplateConfig {
	public SwConfig() {
		addNamespaceAlias(-2, "Faili");
		addNamespaceAlias(-1, "Maalum");
		addNamespaceAlias(1, "Majadiliano");
		addNamespaceAlias(2, "Mtumiaji");
		addNamespaceAlias(3, "Majadiliano_ya_mtumiaji");
		addNamespaceAlias(5, "Majadiliano_ya_Wikipedia", "Wikipedia_majadiliano");
		addNamespaceAlias(6, "Picha");
		addNamespaceAlias(7, "Majadiliano_ya_faili", "Majadiliano_faili");
		addNamespaceAlias(9, "Majadiliano_ya_MediaWiki", "MediaWiki_majadiliano");
		addNamespaceAlias(10, "Kigezo");
		addNamespaceAlias(11, "Majadiliano_ya_kigezo", "Kigezo_majadiliano");
		addNamespaceAlias(12, "Msaada");
		addNamespaceAlias(13, "Majadiliano_ya_msaada", "Msaada_majadiliano");
		addNamespaceAlias(14, "Jamii");
		addNamespaceAlias(15, "Majadiliano_ya_jamii", "Jamii_majadiliano");

	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://sw.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "sw";
	}
}
