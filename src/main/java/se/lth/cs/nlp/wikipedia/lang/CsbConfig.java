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

public class CsbConfig extends TemplateConfig {
	public CsbConfig() {
		addNamespaceAlias(-2, "Media", "Media");
		addNamespaceAlias(-1, "Specjalnô", "Specjalna");
		addNamespaceAlias(1, "Diskùsëjô", "Dyskusja");
		addNamespaceAlias(2, "Brëkòwnik", "Użytkownik", "Użytkownik", "Użytkowniczka");
		addNamespaceAlias(3, "Diskùsëjô_brëkòwnika", "Dyskusja_użytkownika", "Dyskusja_użytkownika", "Dyskusja_użytkowniczki");
		addNamespaceAlias(5, "Diskùsëjô_Wikipedia", "Dyskusja_Wikipedia");
		addNamespaceAlias(6, "Òbrôzk", "Plik", "Grafika");
		addNamespaceAlias(7, "Diskùsëjô_òbrôzków", "Dyskusja_pliku", "Dyskusja_grafiki");
		addNamespaceAlias(8, "MediaWiki", "MediaWiki");
		addNamespaceAlias(9, "Diskùsëjô_MediaWiki", "Dyskusja_MediaWiki");
		addNamespaceAlias(10, "Szablóna", "Szablon");
		addNamespaceAlias(11, "Diskùsëjô_Szablónë", "Dyskusja_szablonu");
		addNamespaceAlias(12, "Pòmòc", "Pomoc");
		addNamespaceAlias(13, "Diskùsëjô_Pòmòcë", "Dyskusja_pomocy");
		addNamespaceAlias(14, "Kategòrëjô", "Kategoria");
		addNamespaceAlias(15, "Diskùsëjô_Kategòrëji", "Dyskusja_kategorii");

		addI18nCIAlias("redirect", "#PATRZ", "#PRZEKIERUJ", "#TAM", "#REDIRECT");
		addI18nCIAlias("notoc", "__BEZSPISU__", "__NOTOC__");
		addI18nCIAlias("nogallery", "__BEZGALERII__", "__NOGALLERY__");
		addI18nCIAlias("forcetoc", "__ZESPISEM__", "__WYMUŚSPIS__", "__FORCETOC__");
		addI18nCIAlias("toc", "__SPIS__", "__TOC__");
		addI18nCIAlias("noeditsection", "__BEZEDYCJISEKCJI__", "__NOEDITSECTION__");
		addI18nAlias("currentday", "AKTUALNYDZIEŃ", "CURRENTDAY");
		addI18nAlias("currentdayname", "NAZWADNIA", "CURRENTDAYNAME");
		addI18nAlias("currentyear", "AKTUALNYROK", "CURRENTYEAR");
		addI18nAlias("currenttime", "AKTUALNYCZAS", "CURRENTTIME");
		addI18nAlias("currenthour", "AKTUALNAGODZINA", "CURRENTHOUR");
		addI18nAlias("localmonth", "MIESIĄC", "LOCALMONTH", "LOCALMONTH2");
		addI18nAlias("localmonthname", "MIESIĄCNAZWA", "LOCALMONTHNAME");
		addI18nAlias("localmonthnamegen", "MIESIĄCNAZWAD", "LOCALMONTHNAMEGEN");
		addI18nAlias("localmonthabbrev", "MIESIĄCNAZWASKR", "LOCALMONTHABBREV");
		addI18nAlias("localday", "DZIEŃ", "LOCALDAY");
		addI18nAlias("localday2", "DZIEŃ2", "LOCALDAY2");
		addI18nAlias("localdayname", "DZIEŃTYGODNIA", "LOCALDAYNAME");
		addI18nAlias("localyear", "ROK", "LOCALYEAR");
		addI18nAlias("localtime", "CZAS", "LOCALTIME");
		addI18nAlias("localhour", "GODZINA", "LOCALHOUR");
		addI18nAlias("numberofpages", "STRON", "NUMBEROFPAGES");
		addI18nAlias("numberofarticles", "ARTYKUŁÓW", "NUMBEROFARTICLES");
		addI18nAlias("numberoffiles", "PLIKÓW", "NUMBEROFFILES");
		addI18nAlias("numberofusers", "UŻYTKOWNIKÓW", "NUMBEROFUSERS");
		addI18nAlias("numberofactiveusers", "LICZBAAKTYWNYCHUŻYTKOWNIKÓW", "NUMBEROFACTIVEUSERS");
		addI18nAlias("numberofedits", "EDYCJI", "NUMBEROFEDITS");
		addI18nAlias("pagename", "NAZWASTRONY", "PAGENAME");
		addI18nAlias("namespace", "NAZWAPRZESTRZENI", "NAMESPACE");
		addI18nAlias("talkspace", "DYSKUSJA", "TALKSPACE");
		addI18nAlias("fullpagename", "PELNANAZWASTRONY", "FULLPAGENAME");
		addI18nAlias("subpagename", "NAZWAPODSTRONY", "SUBPAGENAME");
		addI18nAlias("basepagename", "BAZOWANAZWASTRONY", "BASEPAGENAME");
		addI18nAlias("talkpagename", "NAZWASTRONYDYSKUSJI", "TALKPAGENAME");
		addI18nCIAlias("subst", "podst:", "SUBST:");
		addI18nAlias("img_thumbnail", "mały", "thumbnail", "thumb");
		addI18nAlias("img_manualthumb", "mały=$1", "thumbnail=$1", "thumb=$1");
		addI18nAlias("img_right", "prawo", "right");
		addI18nAlias("img_left", "lewo", "left");
		addI18nAlias("img_none", "brak", "none");
		addI18nAlias("img_center", "centruj", "center", "centre");
		addI18nAlias("img_framed", "ramka", "framed", "enframed", "frame");
		addI18nAlias("img_frameless", "bezramki", "bez_ramki", "frameless");
		addI18nAlias("img_page", "strona=$1", "page=$1", "page $1");
		addI18nAlias("img_border", "tło", "border");
		addI18nAlias("img_top", "góra", "top");
		addI18nAlias("img_middle", "środek", "middle");
		addI18nAlias("img_bottom", "dół", "bottom");
		addI18nAlias("sitename", "PROJEKT", "SITENAME");
		addI18nCIAlias("ns", "PN:", "NS:");
		addI18nCIAlias("articlepath", "ŚCIEŻKAARTYKUŁÓW", "ARTICLEPATH");
		addI18nCIAlias("server", "SERWER", "SERVER");
		addI18nCIAlias("servername", "NAZWASERWERA", "SERVERNAME");
		addI18nCIAlias("scriptpath", "ŚCIEŻKASKRYPTU", "SCRIPTPATH");
		addI18nCIAlias("grammar", "ODMIANA:", "GRAMMAR:");
		addI18nCIAlias("gender", "PŁEĆ:", "GENDER:");
		addI18nAlias("currentweek", "AKTUALNYTYDZIEŃ", "CURRENTWEEK");
		addI18nAlias("localweek", "TYDZIEŃROKU", "LOCALWEEK");
		addI18nAlias("localdow", "DZIEŃTYGODNIANR", "LOCALDOW");
		addI18nCIAlias("plural", "MNOGA:", "PLURAL:");
		addI18nCIAlias("fullurl", "PEŁNYURL", "FULLURL:");
		addI18nCIAlias("lcfirst", "ZMAŁEJ:", "LCFIRST:");
		addI18nCIAlias("ucfirst", "ZWIELKIEJ:", "ZDUŻEJ:", "UCFIRST:");
		addI18nCIAlias("lc", "MAŁE:", "LC:");
		addI18nCIAlias("uc", "WIELKIE:", "DUŻE:", "UC:");
		addI18nAlias("displaytitle", "WYŚWIETLANYTYTUŁ", "DISPLAYTITLE");
		addI18nAlias("newsectionlink", "__LINKNOWEJSEKCJI__", "__NEWSECTIONLINK__");
		addI18nAlias("currentversion", "AKTUALNAWERSJA", "CURRENTVERSION");
		addI18nCIAlias("language", "#JĘZYK:", "#LANGUAGE:");
		addI18nAlias("numberofadmins", "ADMINISTRATORÓW", "NUMBEROFADMINS");
		addI18nCIAlias("padleft", "DOLEWEJ", "PADLEFT");
		addI18nCIAlias("padright", "DOPRAWEJ", "PADRIGHT");
		addI18nCIAlias("special", "specjalna", "special");
		addI18nAlias("defaultsort", "DOMYŚLNIESORTUJ", "DEFAULTSORT:", "DEFAULTSORTKEY:", "DEFAULTCATEGORYSORT:");
		addI18nCIAlias("filepath", "ŚCIEŻKAPLIKU", "FILEPATH:");
		addI18nAlias("hiddencat", "__KATEGORIAUKRYTA__", "__HIDDENCAT__");
		addI18nAlias("pagesincategory", "STRONYWKATEGORII", "PAGESINCATEGORY", "PAGESINCAT");
		addI18nAlias("pagesize", "ROZMIARSTRONY", "PAGESIZE");
		addI18nAlias("index", "__INDEKSUJ__", "__INDEX__");
		addI18nAlias("noindex", "__NIEINDEKSUJ__", "__NOINDEX__");
		addI18nAlias("protectionlevel", "__POZIOMZABEZPIECZEŃ__", "PROTECTIONLEVEL");
		addI18nCIAlias("url_path", "ŚCIEŻKA", "PATH");
		addI18nCIAlias("url_query", "ZAPYTANIE", "QUERY");
	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://csb.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "csb";
	}
}
