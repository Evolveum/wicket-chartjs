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

public class ChartData implements Serializable {

    private Collection<ChartDataset> datasets = new ArrayList<>();
    private Collection<String> labels = new ArrayList<>();

    public Collection<ChartDataset> getDatasets() {
        return datasets;
    }

    public void addDataset(ChartDataset dataset) {
        datasets.add(dataset);
    }

    public Collection<String> getLabels() {
        return labels;
    }

    public void addLabel(String label) {
        labels.add(label);
    }
}
