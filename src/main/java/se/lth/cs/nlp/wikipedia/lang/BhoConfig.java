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

public class BhoConfig extends TemplateConfig {
	public BhoConfig() {
		addNamespaceAlias(-2, "मीडिया");
		addNamespaceAlias(-1, "विशेष");
		addNamespaceAlias(1, "वार्तालाप");
		addNamespaceAlias(2, "प्रयोगकर्ता");
		addNamespaceAlias(3, "प्रयोगकर्ता_वार्ता");
		addNamespaceAlias(5, "Wikipedia_वार्ता");
		addNamespaceAlias(6, "चित्र");
		addNamespaceAlias(7, "चित्र_वार्ता");
		addNamespaceAlias(8, "मीडियाविकि");
		addNamespaceAlias(9, "मीडियाविकि_वार्ता");
		addNamespaceAlias(10, "टेम्पलेट");
		addNamespaceAlias(11, "टेम्पलेट_वार्ता");
		addNamespaceAlias(12, "मदद");
		addNamespaceAlias(13, "मदद_वार्ता");
		addNamespaceAlias(14, "श्रेणी");
		addNamespaceAlias(15, "श्रेणी_वार्ता");

	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://bho.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "bho";
	}
}
