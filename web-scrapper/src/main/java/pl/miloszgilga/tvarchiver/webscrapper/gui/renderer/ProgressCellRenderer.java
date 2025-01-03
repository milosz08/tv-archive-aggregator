/*
 * Copyright (c) 2024 by Miłosz Gilga <https://miloszgilga.pl>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     <http://www.apache.org/licenses/LICENSE-2.0>
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pl.miloszgilga.tvarchiver.webscrapper.gui.renderer;

import pl.miloszgilga.tvarchiver.webscrapper.util.Constant;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class ProgressCellRenderer extends DefaultTableCellRenderer {
	private final JProgressBar progressBar;

	public ProgressCellRenderer() {
		progressBar = new JProgressBar(0, 100);
		progressBar.setStringPainted(true);
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
												   int row, int column) {
		final double percentageLevel = (Double) value;
		progressBar.setValue((int) percentageLevel);
		progressBar.setString(Constant.PF.format(percentageLevel) + "%");
		return progressBar;
	}
}
