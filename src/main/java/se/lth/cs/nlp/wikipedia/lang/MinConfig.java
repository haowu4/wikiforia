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

public class MinConfig extends TemplateConfig {
	public MinConfig() {
		addNamespaceAlias(-2, "Media", "Media");
		addNamespaceAlias(-1, "Istimewa", "Istimewa", "Istimewa");
		addNamespaceAlias(1, "Rundiang", "Pembicaraan", "Maota", "Pembicaraan", "Bicara");
		addNamespaceAlias(2, "Pangguno", "Pengguna", "Pengguna");
		addNamespaceAlias(3, "Rundiang_Pangguno", "Pembicaraan_Pengguna", "Pembicaraan_Pengguna", "Bicara_Pengguna");
		addNamespaceAlias(5, "Rundiang_Wikipedia", "Pembicaraan_Wikipedia", "Pembicaraan_Wikipedia");
		addNamespaceAlias(6, "Berkas", "Berkas", "Berkas", "Gambar");
		addNamespaceAlias(7, "Rundiang_Berkas", "Pembicaraan_Berkas", "Pembicaraan_Berkas", "Gambar_Pembicaraan", "Pembicaraan_Gambar");
		addNamespaceAlias(8, "MediaWiki", "MediaWiki");
		addNamespaceAlias(9, "Rundiang_MediaWiki", "Pembicaraan_MediaWiki", "Pembicaraan_MediaWiki", "MediaWiki_Pembicaraan");
		addNamespaceAlias(10, "Templat", "Templat", "Templat");
		addNamespaceAlias(11, "Rundiang_Templat", "Pembicaraan_Templat", "Pembicaraan_Templat", "Templat_Pembicaraan");
		addNamespaceAlias(12, "Bantuan", "Bantuan", "Bantuan");
		addNamespaceAlias(13, "Rundiang_Bantuan", "Pembicaraan_Bantuan", "Pembicaraan_Bantuan", "Bantuan_Pembicaraan");
		addNamespaceAlias(14, "Kategori", "Kategori", "Kategori");
		addNamespaceAlias(15, "Rundiang_Kategori", "Pembicaraan_Kategori", "Pembicaraan_Kategori", "Kategori_Pembicaraan");

		addI18nCIAlias("redirect", "#ALIAH", "#ALIH", "#REDIRECT", "Array");
		addI18nCIAlias("pagesincategory_all", "sado", "all", "Array");
		addI18nCIAlias("pagesincategory_pages", "laman", "pages", "Array");
		addI18nCIAlias("pagesincategory_files", "berkas", "files", "Array");
		addI18nCIAlias("notoc", "__TANPADAFTARISI__", "__NIRDASI__", "__NOTOC__");
		addI18nCIAlias("nogallery", "__TANPAGALERI__", "__NIRGAL__", "__NOGALLERY__");
		addI18nCIAlias("forcetoc", "__PAKSADAFTARISI__", "__PAKSADASI__", "__FORCETOC__");
		addI18nCIAlias("toc", "__DAFTARISI__", "__DASI__", "__TOC__");
		addI18nCIAlias("noeditsection", "__TANPASUNTINGANBAGIAN__", "__NIRSUBA__", "__NOEDITSECTION__");
		addI18nAlias("currentmonth", "BULANKINI", "BULANKINI2", "BUKIN", "BUKIN2", "CURRENTMONTH", "CURRENTMONTH2");
		addI18nAlias("currentmonth1", "BULANKINI1", "BUKIN1", "CURRENTMONTH1");
		addI18nAlias("currentmonthname", "NAMABULANKINI", "NAMBUKIN", "CURRENTMONTHNAME");
		addI18nAlias("currentmonthnamegen", "NAMAJENDERBULANKINI", "NAMJENBUKIN", "CURRENTMONTHNAMEGEN");
		addI18nAlias("currentmonthabbrev", "NAMASINGKATBULANKINI", "BULANINISINGKAT", "NAMSINGBUKIN", "CURRENTMONTHABBREV");
		addI18nAlias("currentday", "HARIKINI", "HARKIN", "CURRENTDAY");
		addI18nAlias("currentday2", "HARIKINI2", "HARKIN2", "CURRENTDAY2");
		addI18nAlias("currentdayname", "NAMAHARIKINI", "NAMHARKIN", "CURRENTDAYNAME");
		addI18nAlias("currentyear", "TAHUNKINI", "TAKIN", "CURRENTYEAR");
		addI18nAlias("currenttime", "WAKTUKINI", "WAKIN", "CURRENTTIME");
		addI18nAlias("currenthour", "JAMKINI", "JAKIN", "CURRENTHOUR");
		addI18nAlias("localmonth", "BULANLOKAL", "BULANLOKAL2", "BULOK", "BULOK2", "LOCALMONTH", "LOCALMONTH2");
		addI18nAlias("localmonth1", "BULANLOKAL1", "BULOK1", "LOCALMONTH1");
		addI18nAlias("localmonthname", "NAMABULANLOKAL", "NAMBULOK", "LOCALMONTHNAME");
		addI18nAlias("localmonthnamegen", "NAMAJENDERBULANLOKAL", "NAMJENBULOK", "LOCALMONTHNAMEGEN");
		addI18nAlias("localmonthabbrev", "NAMASINGKATBULANLOKAL", "NAMSINGBULOK", "LOCALMONTHABBREV");
		addI18nAlias("localday", "HARILOKAL", "HALOK", "LOCALDAY");
		addI18nAlias("localday2", "HARILOKAL2", "HALOK2", "LOCALDAY2");
		addI18nAlias("localdayname", "NAMAHARILOKAL", "NAMHALOK", "LOCALDAYNAME");
		addI18nAlias("localyear", "TAHUNLOKAL", "TALOK", "LOCALYEAR");
		addI18nAlias("localtime", "WAKTULOKAL", "WALOK", "LOCALTIME");
		addI18nAlias("localhour", "JAMLOKAL", "JALOK", "LOCALHOUR");
		addI18nAlias("numberofpages", "JUMLAHHALAMAN", "JUMMAN", "NUMBEROFPAGES");
		addI18nAlias("numberofarticles", "JUMLAHARTIKEL", "JUMKEL", "NUMBEROFARTICLES");
		addI18nAlias("numberoffiles", "JUMLAHBERKAS", "JUMKAS", "NUMBEROFFILES");
		addI18nAlias("numberofusers", "JUMLAHPENGGUNA", "JUMPENG", "NUMBEROFUSERS");
		addI18nAlias("numberofactiveusers", "JUMLAHPENGGUNAAKTIF", "JUMPENGTIF", "NUMBEROFACTIVEUSERS");
		addI18nAlias("numberofedits", "JUMLAHSUNTINGAN", "JUMTING", "NUMBEROFEDITS");
		addI18nAlias("numberofviews", "JUMLAHTAMPILAN", "JUMTAM", "NUMBEROFVIEWS");
		addI18nAlias("pagename", "NAMAHALAMAN", "NAMMAN", "PAGENAME");
		addI18nAlias("pagenamee", "NAMAHALAMANE", "NAMMANE", "PAGENAMEE");
		addI18nAlias("namespace", "RUANGNAMA", "RUNAM", "NAMESPACE");
		addI18nAlias("namespacee", "RUANGNAMAE", "RUNAME", "NAMESPACEE");
		addI18nAlias("talkspace", "RUANGBICARA", "RUBIR", "TALKSPACE");
		addI18nAlias("talkspacee", "RUANGBICARAE", "RUBIRE", "TALKSPACEE");
		addI18nAlias("subjectspace", "RUANGUTAMA", "RUANGARTIKEL", "RUTAMA", "RUTIKEL", "SUBJECTSPACE", "ARTICLESPACE");
		addI18nAlias("subjectspacee", "RUANGUTAMAE", "RUANGARTIKELE", "RUTAMAE", "RUKELE", "SUBJECTSPACEE", "ARTICLESPACEE");
		addI18nAlias("fullpagename", "NAMAHALAMANLENGKAP", "NAMALENGKAPHALAMAN", "NAMMANKAP", "FULLPAGENAME");
		addI18nAlias("fullpagenamee", "AMAHALAMANLENGKAPE", "NAMALENGKAPHALAMANE", "NAMMANKAPE", "FULLPAGENAMEE");
		addI18nAlias("subpagename", "NAMASUBHALAMAN", "NAMAUPAHALAMAN", "NAMUMAN", "SUBPAGENAME");
		addI18nAlias("subpagenamee", "NAMASUBHALAMANE", "NAMAUPAHALAMANE", "NAMUMANE", "SUBPAGENAMEE");
		addI18nAlias("basepagename", "NAMAHALAMANDASAR", "NAMADASARHALAMAN", "NAMMANSAR", "BASEPAGENAME");
		addI18nAlias("basepagenamee", "NAMAHALAMANDASARE", "NAMADASARHALAMANE", "NAMMANSARE", "BASEPAGENAMEE");
		addI18nAlias("talkpagename", "NAMAHALAMANBICARA", "NAMMANBIR", "TALKPAGENAME");
		addI18nAlias("talkpagenamee", "NAMAHALAMANBICARAE", "NAMMANBIRE", "TALKPAGENAMEE");
		addI18nAlias("subjectpagename", "NAMAHALAMANUTAMA", "NAMAHALAMANARTIKEL", "NAMMANTAMA", "NAMMANTIKEL", "SUBJECTPAGENAME", "ARTICLEPAGENAME");
		addI18nAlias("subjectpagenamee", "NAMAHALAMANUTAMAE", "NAMAHALAMANARTIKELE", "NAMMANTAMAE", "NAMMANTIKELE", "SUBJECTPAGENAMEE", "ARTICLEPAGENAMEE");
		addI18nCIAlias("msg", "PSN:", "PESAN:", "MSG:");
		addI18nCIAlias("subst", "GNT:", "GANTI:", "TUKAR:", "SUBST:");
		addI18nCIAlias("msgnw", "TPL:", "MSGNW:");
		addI18nAlias("img_thumbnail", "jmpl", "jempol", "mini", "miniatur", "thumbnail", "thumb");
		addI18nAlias("img_manualthumb", "jmpl=$1", "jempol=$1", "mini=$1", "miniatur=$1", "thumbnail=$1", "thumb=$1");
		addI18nAlias("img_right", "ka", "kanan", "right");
		addI18nAlias("img_left", "ki", "kiri", "left");
		addI18nAlias("img_none", "nir", "tanpa", "none");
		addI18nAlias("img_center", "pus", "pusat", "center", "centre");
		addI18nAlias("img_framed", "bing", "bingkai", "framed", "enframed", "frame");
		addI18nAlias("img_frameless", "nirbing", "tanpabingkai", "frameless");
		addI18nAlias("img_lang", "bhs=$1", "lang=$1");
		addI18nAlias("img_page", "hal=$1", "halaman=$1", "hal_$1", "halaman_$1", "page=$1", "page $1");
		addI18nAlias("img_upright", "lurus", "lurus=$1", "lurus_$1", "tegak", "tegak=$1", "tegak_$1", "upright", "upright=$1", "upright $1");
		addI18nAlias("img_border", "tepi", "batas", "border");
		addI18nAlias("img_baseline", "gada", "garis_dasar", "baseline");
		addI18nAlias("img_sub", "upa", "sub");
		addI18nAlias("img_top", "atas", "top");
		addI18nAlias("img_text_top", "atek", "atas-teks", "text-top");
		addI18nAlias("img_middle", "tengah", "middle");
		addI18nAlias("img_bottom", "bawah", "bottom");
		addI18nAlias("img_text_bottom", "batek", "bawah-teks", "text-bottom");
		addI18nAlias("img_link", "pra=$1", "pranala=$1", "link=$1");
		addI18nAlias("img_alt", "al=$1", "alternatif=$1", "alt=$1");
		addI18nAlias("sitename", "NAMASITUS", "NAMSIT", "SITENAME");
		addI18nCIAlias("ns", "RN:", "RUNAM:", "NS:");
		addI18nCIAlias("localurl", "URLLOKAL", "LOCALURL:");
		addI18nCIAlias("localurle", "URLLOKALE", "LOCALURLE:");
		addI18nCIAlias("server", "PELADEN", "SERVER");
		addI18nCIAlias("servername", "NAMAPELADEN", "NAMASERVER", "NAMPEL", "SERVERNAME");
		addI18nCIAlias("scriptpath", "LOKASISKRIP", "SCRIPTPATH");
		addI18nCIAlias("grammar", "TATABAHASA:", "TASA:", "GRAMMAR:");
		addI18nCIAlias("gender", "JANTINA:", "GENDER:");
		addI18nCIAlias("notitleconvert", "__TANPAKONVERSIJUDUL__", "__NIRKODUL__", "__NOTITLECONVERT__", "__NOTC__");
		addI18nCIAlias("nocontentconvert", "__TANPAKONVERSIISI__", "__NIRKOSI__", "__NOCONTENTCONVERT__", "__NOCC__");
		addI18nAlias("currentweek", "MINGGUKINI", "MIKIN", "CURRENTWEEK");
		addI18nAlias("currentdow", "HARIDALAMMINGGU", "HADAMI", "CURRENTDOW");
		addI18nAlias("localweek", "MINGGULOKAL", "MIKAL", "LOCALWEEK");
		addI18nAlias("localdow", "HARIDALAMMINGGULOKAL", "HADAMIKAL", "LOCALDOW");
		addI18nAlias("revisionid", "IDREVISI", "IREV", "REVISIONID");
		addI18nAlias("revisionday", "HARIREVISI", "HAREV", "REVISIONDAY");
		addI18nAlias("revisionday2", "HARIREVISI2", "HAREV2", "REVISIONDAY2");
		addI18nAlias("revisionmonth", "BULANREVISI", "BUREV", "REVISIONMONTH");
		addI18nAlias("revisionmonth1", "BULANREVISI1", "REVISIONMONTH1");
		addI18nAlias("revisionyear", "TAHUNREVISI", "TAREV", "REVISIONYEAR");
		addI18nAlias("revisiontimestamp", "STEMPELWAKTUREVISI", "REKAMWAKTUREVISI", "REVISIONTIMESTAMP");
		addI18nAlias("revisionuser", "PENGGUNAREVISI", "REVISIONUSER");
		addI18nCIAlias("plural", "JAMAK:", "PLURAL:");
		addI18nCIAlias("fullurl", "URLLENGKAP:", "FULLURL:");
		addI18nCIAlias("fullurle", "URLLENGKAPE", "FULLURLE:");
		addI18nCIAlias("lcfirst", "AKC:", "AWALKECIL:", "LCFIRST:");
		addI18nCIAlias("ucfirst", "ABS:", "AWALBESAR:", "UCFIRST:");
		addI18nCIAlias("lc", "KC:", "KECIL:", "HURUFKECIL:", "LC:");
		addI18nCIAlias("uc", "BS:", "BESAR:", "HURUFBESAR:", "UC:");
		addI18nCIAlias("raw", "MENTAH:", "RAW:");
		addI18nAlias("displaytitle", "JUDULTAMPILAN", "JUTAM", "DISPLAYTITLE");
		addI18nAlias("rawsuffix", "M", "R");
		addI18nAlias("newsectionlink", "__PRANALABAGIANBARU__", "__PRABABA__", "__NEWSECTIONLINK__");
		addI18nAlias("nonewsectionlink", "_TANPAPRANALABAGIANBARU__", "__NIRPRABABA__", "__NONEWSECTIONLINK__");
		addI18nAlias("currentversion", "VERSIKINI", "VERKIN", "CURRENTVERSION");
		addI18nCIAlias("urlencode", "KODEURL:", "KODU:", "URLENCODE:");
		addI18nCIAlias("anchorencode", "KODEJANGKAR", "KOJANG", "ANCHORENCODE");
		addI18nAlias("currenttimestamp", "STEMPELWAKTUKINI", "STEMWAKIN", "CURRENTTIMESTAMP");
		addI18nAlias("localtimestamp", "STEMPELWAKTULOKAL", "STEMWAKAL", "LOCALTIMESTAMP");
		addI18nAlias("directionmark", "MARKAARAH", "MARRAH", "DIRECTIONMARK", "DIRMARK");
		addI18nCIAlias("language", "#BAHASA:", "#BHS:", "#LANGUAGE:");
		addI18nAlias("contentlanguage", "BAHASAISI", "BHSISI", "BASI", "CONTENTLANGUAGE", "CONTENTLANG");
		addI18nAlias("pagesinnamespace", "HALAMANDIRUANGNAMA:", "HALDIRN", "PAGESINNAMESPACE:", "PAGESINNS:");
		addI18nAlias("numberofadmins", "JUMLAHADMIN", "JUMLAHPENGURUS", "JUMAD", "JURUS", "NUMBEROFADMINS");
		addI18nCIAlias("formatnum", "FORMATANGKA", "FORANG", "FORMATNUM");
		addI18nCIAlias("padleft", "ISIKIRI", "IKI", "PADLEFT");
		addI18nCIAlias("padright", "ISIKANAN", "IKA", "PADRIGHT");
		addI18nCIAlias("special", "istimewa", "spesial", "special");
		addI18nAlias("defaultsort", "URUTANBAKU:", "UBUR:", "DEFAULTSORT:", "DEFAULTSORTKEY:", "DEFAULTCATEGORYSORT:");
		addI18nCIAlias("filepath", "LOKASIBERKAS:", "LOBER:", "FILEPATH:");
		addI18nCIAlias("tag", "kata_kunci", "takun", "tag");
		addI18nAlias("hiddencat", "__KATEGORITERSEMBUNYI__", "__KATSEM__", "__HIDDENCAT__");
		addI18nAlias("pagesincategory", "HALAMANDIKATEGORI", "HALDIKAT", "PAGESINCATEGORY", "PAGESINCAT");
		addI18nAlias("pagesize", "BESARHALAMAN", "BESMAN", "PAGESIZE");
		addI18nAlias("index", "__INDEKS__", "__INDEX__");
		addI18nAlias("noindex", "__TANPAINDEKS__", "__NIRDEKS__", "__NOINDEX__");
		addI18nAlias("numberingroup", "JUMLAHDIKELOMPOK", "JULDIPOK", "NUMBERINGROUP", "NUMINGROUP");
		addI18nAlias("staticredirect", "__PENGALIHANSTATIK__", "__PENGALIHANSTATIS__", "__PETIK__", "__PETIS__", "__STATICREDIRECT__");
		addI18nAlias("protectionlevel", "TINGKATPERLINDUNGAN", "TIPER", "PROTECTIONLEVEL");
		addI18nCIAlias("formatdate", "formattanggal", "formatdate", "dateformat");
	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://min.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "min";
	}
}
