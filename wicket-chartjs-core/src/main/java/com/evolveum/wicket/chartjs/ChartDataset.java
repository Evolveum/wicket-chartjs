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
import java.util.ArrayList;
import java.util.Collection;

public class ChartDataset implements Serializable {

    private Collection<Object> data = new ArrayList<Object>();
    private Collection<String> backgroundColor = new ArrayList<String>();

    private Collection<String> borderColor = new ArrayList<String>();

    /**
     * used for bar chart
     */
    private Integer borderWidth = 0;
    private boolean fill = false;
    private String label;
    private String stack;

    public Collection<Object> getData() {
        return data;
    }

    public void addData(Object addData) {
        data.add(addData);
    }

    public Collection<String> getBackgroundColor() {
        return backgroundColor;
    }

    public void addBackgroudColor(String color) {
        backgroundColor.add(color);
    }

    public Collection<String> getBorderColor() {
        return borderColor;
    }

    public void addBorderColor(String color) {
        borderColor.add(color);
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }
}
