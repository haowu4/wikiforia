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

public class KaConfig extends TemplateConfig {
	public KaConfig() {
		addNamespaceAlias(-2, "მედია");
		addNamespaceAlias(-1, "სპეციალური");
		addNamespaceAlias(1, "განხილვა");
		addNamespaceAlias(2, "მომხმარებელი", "მონაწილე");
		addNamespaceAlias(3, "მომხმარებლის_განხილვა", "მონაწილის_განხილვა", "მომხმარებელი_განხილვა");
		addNamespaceAlias(5, "Wikipedia_განხილვა");
		addNamespaceAlias(6, "ფაილი", "სურათი");
		addNamespaceAlias(7, "ფაილის_განხილვა", "სურათი_განხილვა");
		addNamespaceAlias(8, "მედიავიკი");
		addNamespaceAlias(9, "მედიავიკის_განხილვა", "მედიავიკი_განხილვა");
		addNamespaceAlias(10, "თარგი");
		addNamespaceAlias(11, "თარგის_განხილვა", "თარგი_განხილვა");
		addNamespaceAlias(12, "დახმარება");
		addNamespaceAlias(13, "დახმარების_განხილვა", "დახმარება_განხილვა");
		addNamespaceAlias(14, "კატეგორია");
		addNamespaceAlias(15, "კატეგორიის_განხილვა", "კატეგორია_განხილვა");

		addI18nCIAlias("redirect", "#გადამისამართება", "#REDIRECT");
		addI18nCIAlias("nogallery", "__უგალერეო__", "__NOGALLERY__");
		addI18nAlias("currentmonth", "მიმდინარე_თვე", "მიმდინარე_თვე2", "CURRENTMONTH", "CURRENTMONTH2");
		addI18nAlias("currentmonth1", "მიმდინარე_თვე1", "CURRENTMONTH1");
		addI18nAlias("currentmonthname", "მიმდინარე_თვის_სახელი", "CURRENTMONTHNAME");
		addI18nAlias("currentmonthnamegen", "მიმდინარე_თვის_სახელის_აბრევიატურა", "CURRENTMONTHNAMEGEN");
		addI18nAlias("currentday", "მიმდინარე_დღე", "CURRENTDAY");
		addI18nAlias("currentday2", "მიმდინარე_დღე2", "CURRENTDAY2");
		addI18nAlias("currentdayname", "მიმდინარე_დღის_სახელი", "CURRENTDAYNAME");
		addI18nAlias("currentyear", "მიმდინარე_წელი", "CURRENTYEAR");
		addI18nAlias("currenttime", "მიმდინარე_დრო", "CURRENTTIME");
		addI18nAlias("currenthour", "მიმდინარე_საათი", "CURRENTHOUR");
		addI18nAlias("pagename", "გვერდის_სახელი", "PAGENAME");
		addI18nAlias("namespace", "სახელთა_სივრცე", "NAMESPACE");
		addI18nAlias("fullpagename", "გვერდის_სრული_სახელი", "FULLPAGENAME");
		addI18nCIAlias("subst", "მიდგმ:", "SUBST:");
		addI18nAlias("img_thumbnail", "მინიატიურა", "მინი", "მინიასლი", "ცეროდენა", "thumbnail", "thumb");
		addI18nAlias("img_manualthumb", "მინიატიურა=$1", "მინი=$1", "thumbnail=$1", "thumb=$1");
		addI18nAlias("img_right", "მარჯვნივ", "right");
		addI18nAlias("img_left", "მარცხნივ", "left");
		addI18nAlias("img_none", "არა", "none");
		addI18nAlias("img_width", "$1პქ", "$1px");
		addI18nAlias("img_center", "ცენტრი", "ცენტრში", "center", "centre");
		addI18nAlias("img_page", "გვერდი=$1", "გვერდი_$1", "page=$1", "page $1");
		addI18nAlias("img_border", "საზღვარი", "border");
		addI18nAlias("img_top", "ზედა", "top");
		addI18nAlias("img_middle", "შუა", "middle");
		addI18nAlias("img_bottom", "ქვედა", "bottom");
		addI18nAlias("img_link", "ბმული=$1", "link=$1");
		addI18nAlias("img_alt", "ალტ=$1", "alt=$1");
		addI18nAlias("sitename", "საიტის_სახელი", "SITENAME");
		addI18nCIAlias("special", "სპეციალური", "special");
	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://ka.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "ka";
	}
}
