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

public class VoConfig extends TemplateConfig {
	public VoConfig() {
		addNamespaceAlias(-2, "Nünamakanäd");
		addNamespaceAlias(-1, "Patikos");
		addNamespaceAlias(1, "Bespik");
		addNamespaceAlias(2, "Geban");
		addNamespaceAlias(3, "Gebanibespik");
		addNamespaceAlias(5, "Bespik_dö_Wikipedia");
		addNamespaceAlias(6, "Ragiv", "Magod");
		addNamespaceAlias(7, "Ragivibespik", "Magodibespik");
		addNamespaceAlias(8, "Sitanuns");
		addNamespaceAlias(9, "Bespik_dö_sitanuns");
		addNamespaceAlias(10, "Samafomot");
		addNamespaceAlias(11, "Samafomotibespik");
		addNamespaceAlias(12, "Yuf");
		addNamespaceAlias(13, "Yufibespik");
		addNamespaceAlias(14, "Klad");
		addNamespaceAlias(15, "Kladibespik");

	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://vo.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "vo";
	}
}
