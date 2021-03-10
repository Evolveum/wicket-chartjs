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

public class ChartLegendOption implements Serializable {

    private String position = "top";
    private ChartLegendLabel labels;
    private Boolean display = true;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ChartLegendLabel getLabels() {
        return labels;
    }

    public void setLabels(ChartLegendLabel labels) {
        this.labels = labels;
    }

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }
}
