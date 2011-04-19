/* ========================================================================
 * PlantUML : a free UML diagram generator
 * ========================================================================
 *
 * (C) Copyright 2009, Arnaud Roques
 *
 * Project Info:  http://plantuml.sourceforge.net
 * 
 * This file is part of PlantUML.
 *
 * PlantUML is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PlantUML distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc.
 * in the United States and other countries.]
 *
 * Original Author:  Arnaud Roques
 * 
 * Revision $Revision: 6404 $
 *
 */
package net.sourceforge.plantuml.skin.rose;

import java.awt.Color;
import java.awt.geom.Dimension2D;

import net.sourceforge.plantuml.graphic.StringBounder;
import net.sourceforge.plantuml.skin.AbstractComponent;
import net.sourceforge.plantuml.ugraphic.UGraphic;
import net.sourceforge.plantuml.ugraphic.ULine;
import net.sourceforge.plantuml.ugraphic.UStroke;

public class ComponentRoseGroupingTail extends AbstractComponent {

	private final Color foregroundColor;
	private final Color groupBorder;

	public ComponentRoseGroupingTail(Color foregroundColor, Color groupBorder) {
		this.foregroundColor = foregroundColor;
		this.groupBorder = groupBorder;
	}
	

	@Override
	protected void drawInternalU(UGraphic ug, Dimension2D dimensionToUse) {
		ug.getParam().setStroke(new UStroke(2));
		ug.getParam().setColor(groupBorder);
		ug.draw(0, dimensionToUse.getHeight(), new ULine(dimensionToUse.getWidth(), 0));
		ug.getParam().setStroke(new UStroke());
	}

	@Override
	public double getPreferredWidth(StringBounder stringBounder) {
		return 0;
	}

	@Override
	public double getPreferredHeight(StringBounder stringBounder) {
		return 6;
	}

}
