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

public class CebConfig extends TemplateConfig {
	public CebConfig() {
		addNamespaceAlias(-2, "Medya");
		addNamespaceAlias(-1, "Espesyal");
		addNamespaceAlias(1, "Hisgot");
		addNamespaceAlias(2, "Gumagamit");
		addNamespaceAlias(3, "Hisgot_sa_Gumagamit");
		addNamespaceAlias(5, "Hisgot_sa_Wikipedia", "Hisgot_saWikipedia");
		addNamespaceAlias(6, "Payl", "Imahen");
		addNamespaceAlias(7, "Hisgot_sa_Payl", "Hisgot_sa_Imahen");
		addNamespaceAlias(8, "MediaWiki");
		addNamespaceAlias(9, "Hisgot_sa_MediaWiki");
		addNamespaceAlias(10, "Plantilya");
		addNamespaceAlias(11, "Hisgot_sa_Plantilya");
		addNamespaceAlias(12, "Tabang");
		addNamespaceAlias(13, "Hisgot_sa_Tabang");
		addNamespaceAlias(14, "Kategoriya");
		addNamespaceAlias(15, "Hisgot_sa_Kategoriya");

	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://ceb.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "ceb";
	}
}
