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

public class CrhConfig extends TemplateConfig {
	public CrhConfig() {
		addNamespaceAlias(-2, "Media", "Медиа");
		addNamespaceAlias(-1, "Mahsus", "Махсус");
		addNamespaceAlias(1, "Muzakere", "Музакере");
		addNamespaceAlias(2, "Qullanıcı", "Къулланыджы");
		addNamespaceAlias(3, "Qullanıcı_muzakeresi", "Къулланыджы_музакереси");
		addNamespaceAlias(5, "Wikipedia_muzakeresi", "Wikipedia_музакереси");
		addNamespaceAlias(6, "Fayl", "Ресим", "Resim");
		addNamespaceAlias(7, "Fayl_muzakeresi", "Ресим_музакереси", "Resim_muzakeresi");
		addNamespaceAlias(8, "MediaViki", "МедиаВики");
		addNamespaceAlias(9, "MediaViki_muzakeresi", "МедиаВики_музакереси");
		addNamespaceAlias(10, "Şablon", "Шаблон");
		addNamespaceAlias(11, "Şablon_muzakeresi", "Шаблон_музакереси");
		addNamespaceAlias(12, "Yardım", "Ярдым");
		addNamespaceAlias(13, "Yardım_muzakeresi", "Разговор_о_помоћи");
		addNamespaceAlias(14, "Kategoriya", "Категория");
		addNamespaceAlias(15, "Kategoriya_muzakeresi", "Категория_музакереси");

	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://crh.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "crh";
	}
}
