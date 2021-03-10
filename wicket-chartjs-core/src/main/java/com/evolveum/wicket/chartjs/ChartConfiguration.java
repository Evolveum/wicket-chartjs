/*
 * Copyright (c) 2021 Evolveum
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.evolveum.wicket.chartjs;

import java.io.Serializable;

public class ChartConfiguration implements Serializable {

    private String type;
    private ChartData data;
    private ChartOptions options;

    ChartConfiguration(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ChartData getData() {
        return data;
    }

    public void setData(ChartData data) {
        this.data = data;
    }

    public ChartOptions getOptions() {
        return options;
    }

    public void setOptions(ChartOptions options) {
        this.options = options;
    }

}
