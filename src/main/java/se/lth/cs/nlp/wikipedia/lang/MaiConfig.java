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

public class MaiConfig extends TemplateConfig {
	public MaiConfig() {
		addNamespaceAlias(-2, "मेडिया", "मीडिया");
		addNamespaceAlias(-1, "विशेष", "विशेष");
		addNamespaceAlias(1, "वार्ता", "वार्ता");
		addNamespaceAlias(2, "प्रयोगकर्ता", "सदस्य");
		addNamespaceAlias(3, "प्रयोगकर्ता_वार्ता", "सदस्य_वार्ता");
		addNamespaceAlias(5, "Wikipedia_वार्ता", "Wikipedia_वार्ता");
		addNamespaceAlias(6, "फाइल", "चित्र");
		addNamespaceAlias(7, "फाइल_वार्ता", "चित्र_वार्ता");
		addNamespaceAlias(8, "मेडियाविकि", "मीडियाविकि");
		addNamespaceAlias(9, "मेडियाविकि_वार्ता", "मीडियाविकि_वार्ता");
		addNamespaceAlias(10, "आकृति", "साँचा");
		addNamespaceAlias(11, "आकृति_वार्ता", "साँचा_वार्ता");
		addNamespaceAlias(12, "मद्दत", "सहायता");
		addNamespaceAlias(13, "मद्दत_वार्ता", "सहायता_वार्ता");
		addNamespaceAlias(14, "श्रेणी", "श्रेणी");
		addNamespaceAlias(15, "श्रेणी_वार्ता", "श्रेणी_वार्ता");

		addI18nCIAlias("redirect", "#अनुप्रेषित", "#REDIRECT");
	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://mai.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "mai";
	}
}
