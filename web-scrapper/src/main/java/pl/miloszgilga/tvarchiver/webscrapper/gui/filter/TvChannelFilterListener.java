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

package pl.miloszgilga.tvarchiver.webscrapper.gui.filter;

import lombok.RequiredArgsConstructor;
import pl.miloszgilga.tvarchiver.webscrapper.controller.ChannelsListController;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

@RequiredArgsConstructor
public class TvChannelFilterListener implements DocumentListener {
	private final ChannelsListController controller;

	@Override
	public void insertUpdate(DocumentEvent e) {
		controller.performListFiltering();
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		controller.performListFiltering();
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		controller.performListFiltering();
	}
}
