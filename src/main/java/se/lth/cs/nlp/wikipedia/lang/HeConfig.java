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

public class HeConfig extends TemplateConfig {
	public HeConfig() {
		addNamespaceAlias(-2, "מדיה");
		addNamespaceAlias(-1, "מיוחד");
		addNamespaceAlias(0, "");
		addNamespaceAlias(1, "שיחה");
		addNamespaceAlias(2, "משתמש", "משתמש", "משתמשת");
		addNamespaceAlias(3, "שיחת_משתמש", "שיחת_משתמש", "שיחת_משתמשת");
		addNamespaceAlias(5, "שיחת_Wikipedia");
		addNamespaceAlias(6, "קובץ", "תמונה");
		addNamespaceAlias(7, "שיחת_קובץ", "שיחת_תמונה");
		addNamespaceAlias(8, "מדיה_ויקי");
		addNamespaceAlias(9, "שיחת_מדיה_ויקי");
		addNamespaceAlias(10, "תבנית");
		addNamespaceAlias(11, "שיחת_תבנית");
		addNamespaceAlias(12, "עזרה");
		addNamespaceAlias(13, "שיחת_עזרה");
		addNamespaceAlias(14, "קטגוריה");
		addNamespaceAlias(15, "שיחת_קטגוריה");

		addI18nCIAlias("redirect", "#הפניה", "#REDIRECT");
		addI18nCIAlias("notoc", "__ללא_תוכן_עניינים__", "__ללא_תוכן__", "__NOTOC__");
		addI18nCIAlias("nogallery", "__ללא_גלריה__", "__NOGALLERY__");
		addI18nCIAlias("forcetoc", "__חייב_תוכן_עניינים__", "__חייב_תוכן__", "__FORCETOC__");
		addI18nCIAlias("toc", "__תוכן_עניינים__", "__תוכן__", "__TOC__");
		addI18nCIAlias("noeditsection", "__ללא_עריכה__", "__NOEDITSECTION__");
		addI18nAlias("currentmonth", "חודש נוכחי", "חודש נוכחי 2", "CURRENTMONTH", "CURRENTMONTH2");
		addI18nAlias("currentmonth1", "חודש נוכחי 1", "CURRENTMONTH1");
		addI18nAlias("currentmonthname", "שם חודש נוכחי", "CURRENTMONTHNAME");
		addI18nAlias("currentmonthnamegen", "שם חודש נוכחי קניין", "CURRENTMONTHNAMEGEN");
		addI18nAlias("currentmonthabbrev", "קיצור חודש נוכחי", "CURRENTMONTHABBREV");
		addI18nAlias("currentday", "יום נוכחי", "CURRENTDAY");
		addI18nAlias("currentday2", "יום נוכחי 2", "CURRENTDAY2");
		addI18nAlias("currentdayname", "שם יום נוכחי", "CURRENTDAYNAME");
		addI18nAlias("currentyear", "שנה נוכחית", "CURRENTYEAR");
		addI18nAlias("currenttime", "שעה נוכחית", "CURRENTTIME");
		addI18nAlias("currenthour", "שעות נוכחיות", "CURRENTHOUR");
		addI18nAlias("localmonth", "חודש מקומי", "חודש מקומי 2", "LOCALMONTH", "LOCALMONTH2");
		addI18nAlias("localmonth1", "חודש מקומי 1", "LOCALMONTH1");
		addI18nAlias("localmonthname", "שם חודש מקומי", "LOCALMONTHNAME");
		addI18nAlias("localmonthnamegen", "שם חודש מקומי קניין", "LOCALMONTHNAMEGEN");
		addI18nAlias("localmonthabbrev", "קיצור חודש מקומי", "LOCALMONTHABBREV");
		addI18nAlias("localday", "יום מקומי", "LOCALDAY");
		addI18nAlias("localday2", "יום מקומי 2", "LOCALDAY2");
		addI18nAlias("localdayname", "שם יום מקומי", "LOCALDAYNAME");
		addI18nAlias("localyear", "שנה מקומית", "LOCALYEAR");
		addI18nAlias("localtime", "שעה מקומית", "LOCALTIME");
		addI18nAlias("localhour", "שעות מקומיות", "LOCALHOUR");
		addI18nAlias("numberofpages", "מספר דפים כולל", "מספר דפים", "NUMBEROFPAGES");
		addI18nAlias("numberofarticles", "מספר ערכים", "NUMBEROFARTICLES");
		addI18nAlias("numberoffiles", "מספר קבצים", "NUMBEROFFILES");
		addI18nAlias("numberofusers", "מספר משתמשים", "NUMBEROFUSERS");
		addI18nAlias("numberofactiveusers", "מספר משתמשים פעילים", "NUMBEROFACTIVEUSERS");
		addI18nAlias("numberofedits", "מספר עריכות", "NUMBEROFEDITS");
		addI18nAlias("numberofviews", "מספר צפיות", "NUMBEROFVIEWS");
		addI18nAlias("pagename", "שם הדף", "PAGENAME");
		addI18nAlias("pagenamee", "שם הדף מקודד", "PAGENAMEE");
		addI18nAlias("namespace", "מרחב השם", "NAMESPACE");
		addI18nAlias("namespacee", "מרחב השם מקודד", "NAMESPACEE");
		addI18nAlias("namespacenumber", "מספר_מרחב_השם", "NAMESPACENUMBER");
		addI18nAlias("talkspace", "מרחב השיחה", "TALKSPACE");
		addI18nAlias("talkspacee", "מרחב השיחה מקודד", "TALKSPACEE");
		addI18nAlias("subjectspace", "מרחב הנושא", "מרחב הערכים", "SUBJECTSPACE", "ARTICLESPACE");
		addI18nAlias("subjectspacee", "מרחב הנושא מקודד", "מרחב הערכים מקודד", "SUBJECTSPACEE", "ARTICLESPACEE");
		addI18nAlias("fullpagename", "שם הדף המלא", "FULLPAGENAME");
		addI18nAlias("fullpagenamee", "שם הדף המלא מקודד", "FULLPAGENAMEE");
		addI18nAlias("subpagename", "שם דף המשנה", "SUBPAGENAME");
		addI18nAlias("subpagenamee", "שם דף המשנה מקודד", "SUBPAGENAMEE");
		addI18nAlias("basepagename", "שם דף הבסיס", "BASEPAGENAME");
		addI18nAlias("basepagenamee", "שם דף הבסיס מקודד", "BASEPAGENAMEE");
		addI18nAlias("talkpagename", "שם דף השיחה", "TALKPAGENAME");
		addI18nAlias("talkpagenamee", "שם דף השיחה מקודד", "TALKPAGENAMEE");
		addI18nAlias("subjectpagename", "שם דף הנושא", "שם הערך", "SUBJECTPAGENAME", "ARTICLEPAGENAME");
		addI18nAlias("subjectpagenamee", "שם דף הנושא מקודד", "שם הערך מקודד", "SUBJECTPAGENAMEE", "ARTICLEPAGENAMEE");
		addI18nCIAlias("msg", "הכללה:", "MSG:");
		addI18nCIAlias("subst", "ס:", "SUBST:");
		addI18nCIAlias("safesubst", "ס בטוח:", "SAFESUBST:");
		addI18nCIAlias("msgnw", "הכללת מקור", "MSGNW:");
		addI18nAlias("img_thumbnail", "ממוזער", "thumbnail", "thumb");
		addI18nAlias("img_manualthumb", "ממוזער=$1", "thumbnail=$1", "thumb=$1");
		addI18nAlias("img_right", "ימין", "right");
		addI18nAlias("img_left", "שמאל", "left");
		addI18nAlias("img_none", "ללא", "none");
		addI18nAlias("img_width", "$1 פיקסלים", "$1px");
		addI18nAlias("img_center", "מרכז", "center", "centre");
		addI18nAlias("img_framed", "ממוסגר", "מסגרת", "framed", "enframed", "frame");
		addI18nAlias("img_frameless", "לא ממוסגר", "ללא מסגרת", "frameless");
		addI18nAlias("img_page", "דף=$1", "דף $1", "page=$1", "page $1");
		addI18nAlias("img_upright", "ימין למעלה", "ימין למעלה=$1", "ימין למעלה $1", "upright", "upright=$1", "upright $1");
		addI18nAlias("img_border", "גבולות", "גבול", "border");
		addI18nAlias("img_baseline", "שורת הבסיס", "baseline");
		addI18nAlias("img_sub", "תחתי", "sub");
		addI18nAlias("img_super", "עילי", "super", "sup");
		addI18nAlias("img_top", "למעלה", "top");
		addI18nAlias("img_text_top", "בראש הטקסט", "text-top");
		addI18nAlias("img_middle", "באמצע", "middle");
		addI18nAlias("img_bottom", "למטה", "bottom");
		addI18nAlias("img_text_bottom", "בתחתית הטקסט", "text-bottom");
		addI18nAlias("img_link", "קישור=$1", "link=$1");
		addI18nAlias("img_alt", "טקסט=$1", "alt=$1");
		addI18nCIAlias("int", "הודעה:", "INT:");
		addI18nAlias("sitename", "שם האתר", "SITENAME");
		addI18nCIAlias("ns", "מרחב שם:", "NS:");
		addI18nCIAlias("nse", "מרחב שם מקודד:", "NSE:");
		addI18nCIAlias("localurl", "כתובת יחסית:", "LOCALURL:");
		addI18nCIAlias("localurle", "כתובת יחסית מקודד:", "LOCALURLE:");
		addI18nCIAlias("articlepath", "נתיב הדפים", "ARTICLEPATH");
		addI18nCIAlias("server", "כתובת השרת", "שרת", "SERVER");
		addI18nCIAlias("servername", "שם השרת", "SERVERNAME");
		addI18nCIAlias("scriptpath", "נתיב הקבצים", "SCRIPTPATH");
		addI18nCIAlias("stylepath", "נתיב הסגנון", "STYLEPATH");
		addI18nCIAlias("grammar", "דקדוק:", "GRAMMAR:");
		addI18nCIAlias("gender", "מגדר:", "GENDER:");
		addI18nCIAlias("notitleconvert", "__ללא_המרת_כותרת__", "__NOTITLECONVERT__", "__NOTC__");
		addI18nCIAlias("nocontentconvert", "__ללא_המרת_תוכן__", "__NOCONTENTCONVERT__", "__NOCC__");
		addI18nAlias("currentweek", "שבוע נוכחי", "CURRENTWEEK");
		addI18nAlias("currentdow", "מספר יום נוכחי", "CURRENTDOW");
		addI18nAlias("localweek", "שבוע מקומי", "LOCALWEEK");
		addI18nAlias("localdow", "מספר יום מקומי", "LOCALDOW");
		addI18nAlias("revisionid", "מזהה גרסה", "REVISIONID");
		addI18nAlias("revisionday", "יום גרסה", "REVISIONDAY");
		addI18nAlias("revisionday2", "יום גרסה 2", "REVISIONDAY2");
		addI18nAlias("revisionmonth", "חודש גרסה", "REVISIONMONTH");
		addI18nAlias("revisionmonth1", "חודש גרסה 1", "REVISIONMONTH1");
		addI18nAlias("revisionyear", "שנת גרסה", "REVISIONYEAR");
		addI18nAlias("revisiontimestamp", "זמן גרסה", "REVISIONTIMESTAMP");
		addI18nAlias("revisionuser", "כותב גרסה", "REVISIONUSER");
		addI18nCIAlias("plural", "רבים:", "PLURAL:");
		addI18nCIAlias("fullurl", "כתובת מלאה:", "FULLURL:");
		addI18nCIAlias("fullurle", "כתובת מלאה מקודד:", "FULLURLE:");
		addI18nCIAlias("canonicalurl", "כתובת קנונית:", "CANONICALURL:");
		addI18nCIAlias("canonicalurle", "כתובת קנונית מקודד:", "CANONICALURLE:");
		addI18nCIAlias("lcfirst", "אות ראשונה קטנה:", "LCFIRST:");
		addI18nCIAlias("ucfirst", "אות ראשונה גדולה:", "UCFIRST:");
		addI18nCIAlias("lc", "אותיות קטנות:", "LC:");
		addI18nCIAlias("uc", "אותיות גדולות:", "UC:");
		addI18nCIAlias("raw", "ללא עיבוד:", "RAW:");
		addI18nAlias("displaytitle", "כותרת תצוגה", "DISPLAYTITLE");
		addI18nAlias("rawsuffix", "ללא פסיק", "R");
		addI18nAlias("newsectionlink", "__יצירת_הערה__", "__NEWSECTIONLINK__");
		addI18nAlias("nonewsectionlink", "__ללא_יצירת_הערה__", "__NONEWSECTIONLINK__");
		addI18nAlias("currentversion", "גרסה נוכחית", "CURRENTVERSION");
		addI18nCIAlias("urlencode", "נתיב מקודד:", "URLENCODE:");
		addI18nCIAlias("anchorencode", "עוגן מקודד:", "ANCHORENCODE");
		addI18nAlias("currenttimestamp", "זמן נוכחי", "CURRENTTIMESTAMP");
		addI18nAlias("localtimestamp", "זמן מקומי", "LOCALTIMESTAMP");
		addI18nAlias("directionmark", "סימן כיווניות", "DIRECTIONMARK", "DIRMARK");
		addI18nCIAlias("language", "#שפה:", "#LANGUAGE:");
		addI18nAlias("contentlanguage", "שפת תוכן", "CONTENTLANGUAGE", "CONTENTLANG");
		addI18nAlias("pagesinnamespace", "דפים במרחב השם:", "PAGESINNAMESPACE:", "PAGESINNS:");
		addI18nAlias("numberofadmins", "מספר מפעילים", "NUMBEROFADMINS");
		addI18nCIAlias("formatnum", "עיצוב מספר", "FORMATNUM");
		addI18nCIAlias("padleft", "ריפוד משמאל", "PADLEFT");
		addI18nCIAlias("padright", "ריפוד מימין", "PADRIGHT");
		addI18nCIAlias("special", "מיוחד", "special");
		addI18nAlias("defaultsort", "מיון רגיל:", "DEFAULTSORT:", "DEFAULTSORTKEY:", "DEFAULTCATEGORYSORT:");
		addI18nCIAlias("filepath", "נתיב לקובץ:", "FILEPATH:");
		addI18nCIAlias("tag", "תגית", "tag");
		addI18nAlias("hiddencat", "__קטגוריה_מוסתרת__", "__HIDDENCAT__");
		addI18nAlias("pagesincategory", "דפים בקטגוריה", "PAGESINCATEGORY", "PAGESINCAT");
		addI18nAlias("pagesize", "גודל דף", "PAGESIZE");
		addI18nAlias("index", "__לחיפוש__", "__INDEX__");
		addI18nAlias("noindex", "__לא_לחיפוש__", "__NOINDEX__");
		addI18nAlias("numberingroup", "מספר בקבוצה", "NUMBERINGROUP", "NUMINGROUP");
		addI18nAlias("staticredirect", "__הפניה_קבועה__", "__STATICREDIRECT__");
		addI18nAlias("protectionlevel", "רמת הגנה", "PROTECTIONLEVEL");
		addI18nCIAlias("formatdate", "עיצוב תאריך", "formatdate", "dateformat");
		addI18nCIAlias("url_path", "נתיב", "PATH");
		addI18nCIAlias("url_wiki", "ויקי", "WIKI");
		addI18nCIAlias("url_query", "שאילתה", "QUERY");
		addI18nCIAlias("defaultsort_noerror", "ללא שגיאה", "noerror");
		addI18nCIAlias("defaultsort_noreplace", "ללא החלפה", "noreplace");
		addI18nCIAlias("pagesincategory_pages", "דפים", "pages");
	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://he.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "he";
	}
}
