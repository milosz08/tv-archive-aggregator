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

package pl.miloszgilga.tvarchiver.dataserver.features.tvchannel.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class MonthlyProgramChartStackElement {
	private String name;
	private long total;
	private List<Integer> data;
	private String color;
	private boolean existInChart;

	public MonthlyProgramChartStackElement(String name, List<Integer> data) {
		this.name = name;
		this.data = data;
		total = calculateTotal();
	}

	public MonthlyProgramChartStackElement(String name, List<Integer> data, String color, boolean existInChart) {
		this.name = name;
		this.data = data;
		this.color = color;
		this.existInChart = existInChart;
		total = calculateTotal();
	}

	private long calculateTotal() {
		return data.stream().reduce(0, Integer::sum);
	}
}
