/*
 * Copyright (c) 2024 Evolveum
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

public class ChartScaleAxisOption implements Serializable {

    Boolean display;
    Boolean stacked;
    ChartTitleOption title;

    public Boolean getStacked() {
        return stacked;
    }

    public void setStacked(Boolean stacked) {
        this.stacked = stacked;
    }

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public ChartTitleOption getTitle() {
        return title;
    }

    public void setTitle(ChartTitleOption title) {
        this.title = title;
    }

}
