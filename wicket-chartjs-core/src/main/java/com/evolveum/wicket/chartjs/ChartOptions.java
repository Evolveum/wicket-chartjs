package com.evolveum.wicket.chartjs;
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

import java.io.Serializable;

public class ChartOptions implements Serializable {

    private ChartAnimationOption animation;
    private ChartLegendOption legend;
    private ChartTitleOption title;
    private ChartTooltipOption tooltips;
    private ChartInteractionOption interaction;
    private ChartScaleOption scales;

    /**
     * used for bar chart
     */
    double barPercentage = 1;

    private String indexAxis;

    public ChartAnimationOption getAnimation() {
        return animation;
    }

    public void setAnimation(ChartAnimationOption animation) {
        this.animation = animation;
    }

    public ChartLegendOption getLegend() {
        return legend;
    }

    public void setLegend(ChartLegendOption legend) {
        this.legend = legend;
    }

    public ChartTitleOption getTitle() {
        return title;
    }

    public void setTitle(ChartTitleOption title) {
        this.title = title;
    }

    public ChartTooltipOption getTooltips() {
        return tooltips;
    }

    public void setTooltips(ChartTooltipOption tooltips) {
        this.tooltips = tooltips;
    }

    public void setIndexAxis(String indexAxis) {
        this.indexAxis = indexAxis;
    }

    public String getIndexAxis() {
        return indexAxis;
    }

    public double getBarPercentage() {
        return barPercentage;
    }

    public void setBarPercentage(double barPercentage) {
        this.barPercentage = barPercentage;
    }

    public ChartScaleOption getScales() {
        return scales;
    }

    public void setScales(ChartScaleOption scales) {
        this.scales = scales;
    }

    public ChartInteractionOption getInteraction() {
        return interaction;
    }

    public void setInteraction(ChartInteractionOption interaction) {
        this.interaction = interaction;
    }
}
