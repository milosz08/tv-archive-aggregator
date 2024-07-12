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

package pl.miloszgilga.tvarchiver.dataserver.network.tvchannel.dto;

import java.util.List;

public record MonthlyProgramsChartDto(
	List<MonthlyProgramChartStackElement> series,
	List<MonthlyProgramChartStackElement> table,
	List<String> months,
	String stackKey,
	List<Integer> allPerMonths
) {
}
