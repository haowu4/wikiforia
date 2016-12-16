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

public class IgConfig extends TemplateConfig {
	public IgConfig() {
		addNamespaceAlias(-2, "Midia", "Nká");
		addNamespaceAlias(-1, "Ihü_kárírí");
		addNamespaceAlias(1, "Okwu");
		addNamespaceAlias(2, "Ọbanife", "Ọ'bànifé");
		addNamespaceAlias(3, "Okwu_ọbanife", "Okwu_ọ'bànifé");
		addNamespaceAlias(5, "Okwu_Wikipedia");
		addNamespaceAlias(6, "Usòrò", "Ákwúkwó_orünotu");
		addNamespaceAlias(7, "Okwu_usòrò", "Okwu_ákwúkwó_orünotu");
		addNamespaceAlias(8, "MidiaWiki", "NkáWiki");
		addNamespaceAlias(9, "Okwu_MidiaWiki", "Okwu_NkáWiki");
		addNamespaceAlias(10, "Àtụ");
		addNamespaceAlias(11, "Okwu_àtụ");
		addNamespaceAlias(12, "Nkwadọ", "Nkwádọ");
		addNamespaceAlias(13, "Okwu_nkwadọ", "Okwu_nkwádọ");
		addNamespaceAlias(14, "Òtù", "Ébéonọr");
		addNamespaceAlias(15, "Okwu_òtù", "Okwu_ébéonọr");

		addI18nCIAlias("redirect", "#KÚFÙ", "#REDIRECT");
		addI18nAlias("fullpagename", "ÁHÀNÍLÉNKÈIHÜ", "FULLPAGENAME");
		addI18nCIAlias("msg", "OZI:", "MSG:");
		addI18nAlias("img_right", "áká_ịkẹngạ", "right");
		addI18nAlias("img_left", "áká_èkpè", "left");
		addI18nAlias("img_top", "élú", "top");
		addI18nAlias("img_middle", "ẹtítì", "middle");
		addI18nAlias("img_text_bottom", "okpúrù-ede", "text-bottom");
		addI18nAlias("displaytitle", "ZIÍSHÍ", "DISPLAYTITLE");
		addI18nAlias("pagesize", "ÀSÁIHÜ", "PAGESIZE");
	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://ig.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "ig";
	}
}
