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

public class TyvConfig extends TemplateConfig {
	public TyvConfig() {
		addNamespaceAlias(-2, "Медиа", "Медиа");
		addNamespaceAlias(-1, "Тускай", "Служебная");
		addNamespaceAlias(1, "Чугаа", "Обсуждение");
		addNamespaceAlias(2, "Aжыглакчы", "Участник", "Участник", "Участница");
		addNamespaceAlias(3, "Aжыглакчы_чугаа", "Aжыглакчы_чугаазы", "Обсуждение_участника", "Обсуждение_участника", "Обсуждение_участницы");
		addNamespaceAlias(5, "Wikipedia_чугаа", "Wikipedia_чугаазы", "Обсуждение_{{GRAMMAR:genitive|Wikipedia}}");
		addNamespaceAlias(6, "Файл", "Файл", "Изображение");
		addNamespaceAlias(7, "Файл_чугаа", "Файл_чугаазы", "Обсуждение_файла", "Обсуждение_изображения");
		addNamespaceAlias(8, "МедиаВики", "MediaWiki");
		addNamespaceAlias(9, "МедиаВики_чугаа", "МедиаВики_чугаазы", "Обсуждение_MediaWiki");
		addNamespaceAlias(10, "Майык", "Шаблон");
		addNamespaceAlias(11, "Майык_чугаа", "Майык_чугаазы", "Обсуждение_шаблона");
		addNamespaceAlias(12, "Дуза", "Справка");
		addNamespaceAlias(13, "Дуза_чугаа", "Дуза_чугаазы", "Обсуждение_справки");
		addNamespaceAlias(14, "Аңгылал", "Категория", "Категория");
		addNamespaceAlias(15, "Аңгылал_чугаа", "Категория_чугаазы", "Обсуждение_категории");

		addI18nCIAlias("redirect", "#көжүрүлге", "#ШИГЛЕДИР", "#перенаправление", "#перенапр", "#REDIRECT", "Array");
		addI18nCIAlias("notoc", "__ЭГЕ_ЧОК__", "__БЕЗ_ОГЛАВЛЕНИЯ__", "__БЕЗ_ОГЛ__", "__NOTOC__", "Array");
		addI18nCIAlias("nogallery", "__ГАЛЕРЕЯ_ЧОК__", "__БЕЗ_ГАЛЕРЕИ__", "__NOGALLERY__", "Array");
		addI18nCIAlias("forcetoc", "__АЛБАН_ЭГЕ__", "__ОБЯЗАТЕЛЬНОЕ_ОГЛАВЛЕНИЕ__", "__ОБЯЗ_ОГЛ__", "__FORCETOC__", "Array");
		addI18nCIAlias("toc", "__ДОПЧУ__", "__ОГЛАВЛЕНИЕ__", "__ОГЛ__", "__TOC__", "Array");
		addI18nCIAlias("noeditsection", "__ҮЛЕГ_ЭДИЛГЕЗИ_ЧОК__", "__БЕЗ_РЕДАКТИРОВАНИЯ_РАЗДЕЛА__", "__NOEDITSECTION__", "Array");
		addI18nAlias("currentmonth", "__АМГЫ_АЙ", "__АМГЫ_АЙ_2__", "ТЕКУЩИЙ_МЕСЯЦ", "ТЕКУЩИЙ_МЕСЯЦ_2", "CURRENTMONTH", "CURRENTMONTH2", "Array");
		addI18nAlias("currentmonth1", "__АМГЫ_АЙ_1__", "ТЕКУЩИЙ_МЕСЯЦ_1", "CURRENTMONTH1", "Array");
		addI18nAlias("currentmonthname", "АМГЫАЙНЫҢАДЫ", "НАЗВАНИЕ_ТЕКУЩЕГО_МЕСЯЦА", "CURRENTMONTHNAME", "Array");
		addI18nAlias("currentday", "АМГЫХҮН", "ТЕКУЩИЙ_ДЕНЬ", "CURRENTDAY", "Array");
		addI18nAlias("currentday2", "АМГЫХҮН2", "ТЕКУЩИЙ_ДЕНЬ_2", "CURRENTDAY2", "Array");
		addI18nAlias("currentdayname", "АМГЫХҮННҮҢАДЫ", "НАЗВАНИЕ_ТЕКУЩЕГО_ДНЯ", "CURRENTDAYNAME", "Array");
		addI18nAlias("currentyear", "АМГЫЧЫЛ", "ТЕКУЩИЙ_ГОД", "CURRENTYEAR", "Array");
		addI18nAlias("currenttime", "АМГЫҮЕ", "ТЕКУЩЕЕ_ВРЕМЯ", "CURRENTTIME", "Array");
		addI18nAlias("currenthour", "АМГЫШАК", "ТЕКУЩИЙ_ЧАС", "CURRENTHOUR", "Array");
		addI18nAlias("numberofpages", "АРЫННАРНЫҢСАНЫ", "КОЛИЧЕСТВО_СТРАНИЦ", "NUMBEROFPAGES", "Array");
		addI18nAlias("numberofarticles", "ЧҮҮЛДЕРНИҢСАНЫ", "КОЛИЧЕСТВО_СТАТЕЙ", "NUMBEROFARTICLES", "Array");
		addI18nAlias("numberoffiles", "ФАЙЛДАРНЫҢСАНЫ", "КОЛИЧЕСТВО_ФАЙЛОВ", "NUMBEROFFILES", "Array");
		addI18nAlias("numberofusers", "АЖЫГЛАКЧЫЛАРНЫҢСАНЫ", "КОЛИЧЕСТВО_УЧАСТНИКОВ", "NUMBEROFUSERS", "Array");
		addI18nAlias("numberofedits", "ӨСКЕРЛИИШКИННЕРНИҢСАНЫ", "КОЛИЧЕСТВО_ПРАВОК", "NUMBEROFEDITS", "Array");
		addI18nAlias("pagename", "АРЫННЫҢАДЫ", "НАЗВАНИЕ_СТРАНИЦЫ", "PAGENAME", "Array");
		addI18nAlias("namespace", "АТТАРДЕЛГЕМИ", "ПРОСТРАНСТВО_ИМЁН", "NAMESPACE", "Array");
		addI18nAlias("namespacee", "АТТАРДЕЛГЕМИ2", "ПРОСТРАНСТВО_ИМЁН_2", "NAMESPACEE", "Array");
		addI18nAlias("namespacenumber", "АТТАРДЕЛГЕМИНИҢСАНЫ", "НОМЕР_ПРОСТРАНСТВА_ИМЁН", "NAMESPACENUMBER", "Array");
		addI18nAlias("talkspace", "ЧУГААДЕЛГЕМИ", "ПРОСТРАНСТВО_ОБСУЖДЕНИЙ", "TALKSPACE", "Array");
		addI18nAlias("talkspacee", "ЧУГААДЕЛГЕМИ2", "ПРОСТРАНСТВО_ОБСУЖДЕНИЙ_2", "TALKSPACEE", "Array");
		addI18nAlias("img_right", "оң", "справа", "right", "Array");
		addI18nAlias("img_left", "солагай", "слева", "left", "Array");
		addI18nAlias("img_center", "төп", "центр", "center", "centre", "Array");
		addI18nAlias("sitename", "САЙТТЫҢАДЫ", "НАЗВАНИЕ_САЙТА", "SITENAME", "Array");
		addI18nCIAlias("ns", "АД:", "ПИ:", "NS:", "Array");
		addI18nCIAlias("nse", "АД2:", "ПИК:", "NSE:", "Array");
		addI18nAlias("currentweek", "АМГЫЧЕДИХОНУК", "ТЕКУЩАЯ_НЕДЕЛЯ", "CURRENTWEEK", "Array");
		addI18nAlias("currentdow", "АМГЫЧЕДИХОНУКТУҢХҮНҮ", "ТЕКУЩИЙ_ДЕНЬ_НЕДЕЛИ", "CURRENTDOW", "Array");
		addI18nCIAlias("raw", "ЧИГ:", "НЕОБРАБ:", "RAW:", "Array");
		addI18nCIAlias("language", "#ДЫЛ:", "#ЯЗЫК:", "#LANGUAGE:", "Array");
		addI18nCIAlias("special", "тускай", "служебная", "special", "Array");
		addI18nCIAlias("tag", "демдек", "метка", "тег", "тэг", "tag", "Array");
		addI18nAlias("hiddencat", "__ЧАЖЫТ_АҢГЫЛАЛ__", "__СКРЫТАЯ_КАТЕГОРИЯ__", "__HIDDENCAT__", "Array");
		addI18nAlias("pagesincategory", "__АҢГЫЛАЛ_АРЫННАРЫ__", "СТРАНИЦ_В_КАТЕГОРИИ", "PAGESINCATEGORY", "PAGESINCAT", "Array");
		addI18nCIAlias("pagesincategory_all", "шупту", "все", "all", "Array");
		addI18nCIAlias("pagesincategory_pages", "арыннар", "страницы", "pages", "Array");
		addI18nCIAlias("pagesincategory_files", "файлдар", "файлы", "files", "Array");
		addI18nAlias("currentmonthnamegen", "НАЗВАНИЕ_ТЕКУЩЕГО_МЕСЯЦА_РОД", "CURRENTMONTHNAMEGEN");
		addI18nAlias("currentmonthabbrev", "НАЗВАНИЕ_ТЕКУЩЕГО_МЕСЯЦА_АБР", "CURRENTMONTHABBREV");
		addI18nAlias("localmonth", "МЕСТНЫЙ_МЕСЯЦ", "МЕСТНЫЙ_МЕСЯЦ_2", "LOCALMONTH", "LOCALMONTH2");
		addI18nAlias("localmonth1", "МЕСТНЫЙ_МЕСЯЦ_1", "LOCALMONTH1");
		addI18nAlias("localmonthname", "НАЗВАНИЕ_МЕСТНОГО_МЕСЯЦА", "LOCALMONTHNAME");
		addI18nAlias("localmonthnamegen", "НАЗВАНИЕ_МЕСТНОГО_МЕСЯЦА_РОД", "LOCALMONTHNAMEGEN");
		addI18nAlias("localmonthabbrev", "НАЗВАНИЕ_МЕСТНОГО_МЕСЯЦА_АБР", "LOCALMONTHABBREV");
		addI18nAlias("localday", "МЕСТНЫЙ_ДЕНЬ", "LOCALDAY");
		addI18nAlias("localday2", "МЕСТНЫЙ_ДЕНЬ_2", "LOCALDAY2");
		addI18nAlias("localdayname", "НАЗВАНИЕ_МЕСТНОГО_ДНЯ", "LOCALDAYNAME");
		addI18nAlias("localyear", "МЕСТНЫЙ_ГОД", "LOCALYEAR");
		addI18nAlias("localtime", "МЕСТНОЕ_ВРЕМЯ", "LOCALTIME");
		addI18nAlias("localhour", "МЕСТНЫЙ_ЧАС", "LOCALHOUR");
		addI18nAlias("numberofactiveusers", "КОЛИЧЕСТВО_АКТИВНЫХ_УЧАСТНИКОВ", "NUMBEROFACTIVEUSERS");
		addI18nAlias("numberofviews", "КОЛИЧЕСТВО_ПРОСМОТРОВ", "NUMBEROFVIEWS");
		addI18nAlias("pagenamee", "НАЗВАНИЕ_СТРАНИЦЫ_2", "PAGENAMEE");
		addI18nAlias("subjectspace", "ПРОСТРАНСТВО_СТАТЕЙ", "SUBJECTSPACE", "ARTICLESPACE");
		addI18nAlias("subjectspacee", "ПРОСТРАНСТВО_СТАТЕЙ_2", "SUBJECTSPACEE", "ARTICLESPACEE");
		addI18nAlias("fullpagename", "ПОЛНОЕ_НАЗВАНИЕ_СТРАНИЦЫ", "FULLPAGENAME");
		addI18nAlias("fullpagenamee", "ПОЛНОЕ_НАЗВАНИЕ_СТРАНИЦЫ_2", "FULLPAGENAMEE");
		addI18nAlias("subpagename", "НАЗВАНИЕ_ПОДСТРАНИЦЫ", "SUBPAGENAME");
		addI18nAlias("subpagenamee", "НАЗВАНИЕ_ПОДСТРАНИЦЫ_2", "SUBPAGENAMEE");
		addI18nAlias("basepagename", "ОСНОВА_НАЗВАНИЯ_СТРАНИЦЫ", "BASEPAGENAME");
		addI18nAlias("basepagenamee", "ОСНОВА_НАЗВАНИЯ_СТРАНИЦЫ_2", "BASEPAGENAMEE");
		addI18nAlias("talkpagename", "НАЗВАНИЕ_СТРАНИЦЫ_ОБСУЖДЕНИЯ", "TALKPAGENAME");
		addI18nAlias("talkpagenamee", "НАЗВАНИЕ_СТРАНИЦЫ_ОБСУЖДЕНИЯ_2", "TALKPAGENAMEE");
		addI18nAlias("subjectpagename", "НАЗВАНИЕ_СТРАНИЦЫ_СТАТЬИ", "SUBJECTPAGENAME", "ARTICLEPAGENAME");
		addI18nAlias("subjectpagenamee", "НАЗВАНИЕ_СТРАНИЦЫ_СТАТЬИ_2", "SUBJECTPAGENAMEE", "ARTICLEPAGENAMEE");
		addI18nCIAlias("msg", "СООБЩЕНИЕ:", "СООБЩ:", "MSG:");
		addI18nCIAlias("subst", "ПОДСТАНОВКА:", "ПОДСТ:", "SUBST:");
		addI18nCIAlias("safesubst", "ЗАЩПОДСТ:", "SAFESUBST:");
		addI18nCIAlias("msgnw", "СООБЩ_БЕЗ_ВИКИ:", "MSGNW:");
		addI18nAlias("img_thumbnail", "мини", "миниатюра", "thumbnail", "thumb");
		addI18nAlias("img_manualthumb", "мини=$1", "миниатюра=$1", "thumbnail=$1", "thumb=$1");
		addI18nAlias("img_none", "без", "none");
		addI18nAlias("img_width", "$1пкс", "$1px");
		addI18nAlias("img_framed", "обрамить", "framed", "enframed", "frame");
		addI18nAlias("img_frameless", "безрамки", "frameless");
		addI18nAlias("img_page", "страница=$1", "страница $1", "page=$1", "page $1");
		addI18nAlias("img_upright", "сверхусправа", "сверхусправа=$1", "сверхусправа $1", "upright", "upright=$1", "upright $1");
		addI18nAlias("img_border", "граница", "border");
		addI18nAlias("img_baseline", "основание", "baseline");
		addI18nAlias("img_sub", "под", "sub");
		addI18nAlias("img_super", "над", "super", "sup");
		addI18nAlias("img_top", "сверху", "top");
		addI18nAlias("img_text_top", "текст-сверху", "text-top");
		addI18nAlias("img_middle", "посередине", "middle");
		addI18nAlias("img_bottom", "снизу", "bottom");
		addI18nAlias("img_text_bottom", "текст-снизу", "text-bottom");
		addI18nAlias("img_link", "ссылка=$1", "link=$1");
		addI18nAlias("img_alt", "альт=$1", "alt=$1");
		addI18nCIAlias("int", "ВНУТР:", "INT:");
		addI18nCIAlias("localurl", "ЛОКАЛЬНЫЙ_АДРЕС:", "LOCALURL:");
		addI18nCIAlias("localurle", "ЛОКАЛЬНЫЙ_АДРЕС_2:", "LOCALURLE:");
		addI18nCIAlias("articlepath", "ПУТЬ_К_СТАТЬЕ", "ARTICLEPATH");
		addI18nCIAlias("pageid", "ИДЕНТИФИКАТОР_СТРАНИЦЫ", "PAGEID");
		addI18nCIAlias("server", "СЕРВЕР", "SERVER");
		addI18nCIAlias("servername", "НАЗВАНИЕ_СЕРВЕРА", "SERVERNAME");
		addI18nCIAlias("scriptpath", "ПУТЬ_К_СКРИПТУ", "SCRIPTPATH");
		addI18nCIAlias("stylepath", "ПУТЬ_К_СТИЛЮ", "STYLEPATH");
		addI18nCIAlias("grammar", "ПАДЕЖ:", "GRAMMAR:");
		addI18nCIAlias("gender", "ПОЛ:", "GENDER:");
		addI18nCIAlias("notitleconvert", "__БЕЗ_ПРЕОБРАЗОВАНИЯ_ЗАГОЛОВКА__", "__NOTITLECONVERT__", "__NOTC__");
		addI18nCIAlias("nocontentconvert", "__БЕЗ_ПРЕОБРАЗОВАНИЯ_ТЕКСТА__", "__NOCONTENTCONVERT__", "__NOCC__");
		addI18nAlias("localweek", "МЕСТНАЯ_НЕДЕЛЯ", "LOCALWEEK");
		addI18nAlias("localdow", "МЕСТНЫЙ_ДЕНЬ_НЕДЕЛИ", "LOCALDOW");
		addI18nAlias("revisionid", "ИД_ВЕРСИИ", "REVISIONID");
		addI18nAlias("revisionday", "ДЕНЬ_ВЕРСИИ", "REVISIONDAY");
		addI18nAlias("revisionday2", "ДЕНЬ_ВЕРСИИ_2", "REVISIONDAY2");
		addI18nAlias("revisionmonth", "МЕСЯЦ_ВЕРСИИ", "REVISIONMONTH");
		addI18nAlias("revisionmonth1", "МЕСЯЦ_ВЕРСИИ_1", "REVISIONMONTH1");
		addI18nAlias("revisionyear", "ГОД_ВЕРСИИ", "REVISIONYEAR");
		addI18nAlias("revisiontimestamp", "ОТМЕТКА_ВРЕМЕНИ_ВЕРСИИ", "REVISIONTIMESTAMP");
		addI18nAlias("revisionuser", "ВЕРСИЯ_УЧАСТНИКА", "REVISIONUSER");
		addI18nCIAlias("plural", "МНОЖЕСТВЕННОЕ_ЧИСЛО:", "PLURAL:");
		addI18nCIAlias("fullurl", "ПОЛНЫЙ_АДРЕС:", "FULLURL:");
		addI18nCIAlias("fullurle", "ПОЛНЫЙ_АДРЕС_2:", "FULLURLE:");
		addI18nCIAlias("lcfirst", "ПЕРВАЯ_БУКВА_МАЛЕНЬКАЯ:", "LCFIRST:");
		addI18nCIAlias("ucfirst", "ПЕРВАЯ_БУКВА_БОЛЬШАЯ:", "UCFIRST:");
		addI18nCIAlias("lc", "МАЛЕНЬКИМИ_БУКВАМИ:", "LC:");
		addI18nCIAlias("uc", "БОЛЬШИМИ_БУКВАМИ:", "UC:");
		addI18nAlias("displaytitle", "ПОКАЗАТЬ_ЗАГОЛОВОК", "DISPLAYTITLE");
		addI18nAlias("rawsuffix", "Н", "R");
		addI18nAlias("newsectionlink", "__ССЫЛКА_НА_НОВЫЙ_РАЗДЕЛ__", "__NEWSECTIONLINK__");
		addI18nAlias("nonewsectionlink", "__БЕЗ_ССЫЛКИ_НА_НОВЫЙ_РАЗДЕЛ__", "__NONEWSECTIONLINK__");
		addI18nAlias("currentversion", "ТЕКУЩАЯ_ВЕРСИЯ", "CURRENTVERSION");
		addI18nCIAlias("urlencode", "ЗАКОДИРОВАННЫЙ_АДРЕС:", "URLENCODE:");
		addI18nCIAlias("anchorencode", "КОДИРОВАТЬ_МЕТКУ", "ANCHORENCODE");
		addI18nAlias("currenttimestamp", "ОТМЕТКА_ТЕКУЩЕГО_ВРЕМЕНИ", "CURRENTTIMESTAMP");
		addI18nAlias("localtimestamp", "ОТМЕТКА_МЕСТНОГО_ВРЕМЕНИ", "LOCALTIMESTAMP");
		addI18nAlias("directionmark", "НАПРАВЛЕНИЕ_ПИСЬМА", "DIRECTIONMARK", "DIRMARK");
		addI18nAlias("contentlanguage", "ЯЗЫК_СОДЕРЖАНИЯ", "CONTENTLANGUAGE", "CONTENTLANG");
		addI18nAlias("pagesinnamespace", "СТРАНИЦ_В_ПРОСТРАНСТВЕ_ИМЁН:", "PAGESINNAMESPACE:", "PAGESINNS:");
		addI18nAlias("numberofadmins", "КОЛИЧЕСТВО_АДМИНИСТРАТОРОВ", "NUMBEROFADMINS");
		addI18nCIAlias("formatnum", "ФОРМАТИРОВАТЬ_ЧИСЛО", "FORMATNUM");
		addI18nCIAlias("padleft", "ЗАПОЛНИТЬ_СЛЕВА", "PADLEFT");
		addI18nCIAlias("padright", "ЗАПОЛНИТЬ_СПРАВА", "PADRIGHT");
		addI18nAlias("defaultsort", "СОРТИРОВКА_ПО_УМОЛЧАНИЮ", "КЛЮЧ_СОРТИРОВКИ", "DEFAULTSORT:", "DEFAULTSORTKEY:", "DEFAULTCATEGORYSORT:");
		addI18nCIAlias("filepath", "ПУТЬ_К_ФАЙЛУ:", "FILEPATH:");
		addI18nAlias("pagesize", "РАЗМЕР_СТРАНИЦЫ", "PAGESIZE");
		addI18nAlias("index", "__ИНДЕКС__", "__INDEX__");
		addI18nAlias("noindex", "__БЕЗ_ИНДЕКСА__", "__NOINDEX__");
		addI18nAlias("numberingroup", "ЧИСЛО_В_ГРУППЕ", "NUMBERINGROUP", "NUMINGROUP");
		addI18nAlias("staticredirect", "__СТАТИЧЕСКОЕ_ПЕРЕНАПРАВЛЕНИЕ__", "__STATICREDIRECT__");
		addI18nAlias("protectionlevel", "УРОВЕНЬ_ЗАЩИТЫ", "PROTECTIONLEVEL");
		addI18nCIAlias("formatdate", "форматдаты", "formatdate", "dateformat");
		addI18nCIAlias("url_path", "ПУТЬ", "PATH");
		addI18nCIAlias("url_wiki", "ВИКИ", "WIKI");
		addI18nCIAlias("url_query", "ЗАПРОС", "QUERY");
		addI18nCIAlias("pagesincategory_subcats", "подкатегории", "subcats");
	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://tyv.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "tyv";
	}
}
